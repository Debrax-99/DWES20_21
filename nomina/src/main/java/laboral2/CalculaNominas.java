package laboral2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * FP-2DAW Desarrollo Web en Entorno Servidor
 * 
 * @author Ana Blanco Escudero
 * @since 22-09-2020
 * 
 *        Clase CalculaNominas que contiene el programa principal.
 */
public class CalculaNominas {

	private static final String PATH_EMPLEADOS = "C:\\Users\\Debrax\\Desktop\\GIT PROJECTS\\dwes20_21\\laboral\\resources\\empleados.txt";
	private static final String PATH_SALARIOS = "C:\\Users\\Debrax\\Desktop\\GIT PROJECTS\\dwes20_21\\laboral\\resources\\salarios.txt";

	public static void main(String[] args) throws IOException, DatosNoCorrectosException {
		try {
			// Creamos dos empleados:
			Empleado empleado1 = new Empleado("James Cosling", "32000032G", 'M', 4, 7);
			Empleado empleado2 = new Empleado("Ada Lovelace", "32000031R", 'F');

			// Los guardamos en un ArrayList:
			ArrayList<Empleado> empleados = new ArrayList<Empleado>();
			empleados.add(empleado1);
			empleados.add(empleado2);

			// Creamos el File con la ruta del archivo txt donde queremos guardar los
			// empleados:
			System.out.println("CREANDO EL FICHERO..");
			File empleadosFile = new File(PATH_EMPLEADOS);

			// Llamamos al método que actualiza los datos de los empleados en el archivo
			// txt:
			actualizarEmpleados(empleados);

			// Llamamos al método que lee los datos de los empleados de un txt y crea
			// objetos a partir de ellos:
			empleados = leerEmpleados(empleadosFile);

			// Incrementamos los años trabajados del empleado2:
			empleados.get(1).incrAnyo();

			// Modificamos la categoría del empleado1:
			empleados.get(0).setCategoria(9);

			// Llamamos al método que actualiza los datos de los empleados en el archivo
			// txt:
			actualizarEmpleados(empleados);

			// Creamos el File con la ruta del archivo txt donde queremos guardar los
			// empleados:
			System.out.println("CREANDO EL FICHERO..");
			File salariosFile = new File(PATH_EMPLEADOS);

			// Llamamos al método que calcula y escribe el sueldo de cada empleado en el
			// archivo txt:
			escribirSalarios(empleados);

		} catch (DatosNoCorrectosException e) {
			e.errorMessage();
			e.printStackTrace();
		}

	}

	/**
	 * Método que lee los datos de los empleados desde un fichero txt y crea objetos
	 * a partir de ellos, devolviéndolos en una variable ArrayList
	 * 
	 * @param PATH_EMPLEADOS ruta relativa del fichero txt que contiene los datos
	 * @return empleados ArrayList que contiene los empleados creados
	 * @throws DatosNoCorrectosException
	 * @throws NumberFormatException
	 */
	// LEER EMPLEADOS METHOD:
	private static ArrayList<Empleado> leerEmpleados(File empleadosFile)
			throws NumberFormatException, DatosNoCorrectosException {
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			System.out.println("Abriendo el fichero...");
			fr = new FileReader(PATH_EMPLEADOS);
			br = new BufferedReader(fr);

			System.out.println("Leyendo el contenido...");
			String[] elementos;
			String line;
			int i = 0;
			while ((line = br.readLine()) != null) {
				elementos = line.split("-");
				Empleado empleado = new Empleado(elementos[0], elementos[1], elementos[2].charAt(0),
						Integer.parseInt(elementos[3]), Integer.parseInt(elementos[4]));
				empleados.add(empleado);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Cerrando el fichero...");
				if (null != fr) {
					fr.close();
				}
				if (null != br) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return empleados;
	}

	/**
	 * Método que actualiza los datos de un fichero txt desde una lista de empleados
	 * 
	 * @param empleados ArrayList que contiene los empleados
	 */
	// ACTUALIZAR EMPLEADOS METHOD:
	private static void actualizarEmpleados(ArrayList<Empleado> empleados) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			System.out.println("Abriendo el fichero...");
			fw = new FileWriter(PATH_EMPLEADOS);
			bw = new BufferedWriter(fw);

			System.out.println("Escribiendo el contenido...");

			for (Empleado empleado : empleados) {
				bw.write(empleado.nombre + "-" + empleado.dni + "-" + empleado.sexo + "-" + empleado.getCategoria()
						+ "-" + empleado.anyo);
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Cerrando el fichero...");
				if (null != bw) {
					bw.close();
				}
				if (null != fw) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * Método que guarda el dni y el salario de cada empleado de una lista en un
	 * fichero txt
	 * 
	 * @param empleados ArrayList que contiene los empleados
	 */
	// ACTUALIZAR EMPLEADOS METHOD:
	private static void escribirSalarios(ArrayList<Empleado> empleados) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			System.out.println("Abriendo el fichero...");
			fw = new FileWriter(PATH_SALARIOS);
			bw = new BufferedWriter(fw);

			System.out.println("Escribiendo el contenido...");

			for (Empleado empleado : empleados) {
				bw.write(empleado.dni + "-" + Nomina.sueldo(empleado));
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Cerrando el fichero...");
				if (null != bw) {
					bw.close();
				}
				if (null != fw) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

//	/**
//	 * Método que imprime los datos y el sueldo de dos empleados.
//	 * 
//	 * @param empleado1 el primer empleado del que se quiere saber sus datos y
//	 *                  calcular el sueldo.
//	 * @param empleado2 el segundo empleado del que se quiere saber sus datos y
//	 *                  calcular el sueldo.
//	 */
//	// ESCRIBE METHOD:
//	public static void escribe(Empleado empleado1, Empleado empleado2) {
//		empleado1.imprime();
//		System.out
//				.println("El empleado " + empleado1.nombre + " gana un sueldo de " + Nomina.sueldo(empleado1) + " €.");
//		empleado2.imprime();
//		System.out
//				.println("El empleado " + empleado2.nombre + " gana un sueldo de " + Nomina.sueldo(empleado2) + " €.");
//	}
}
