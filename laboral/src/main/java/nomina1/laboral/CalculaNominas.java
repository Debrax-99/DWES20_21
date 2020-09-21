package nomina1.laboral;

public class CalculaNominas {

	public static void main(String[] args) throws Exception {
		try {
			// Creamos dos empleados:
			Empleado empleado1 = new Empleado("James Cosling", "32000032G", 'M', 4, 7);
			Empleado empleado2 = new Empleado("Ada Lovelace", "32000031R", 'F');

			// Llamamos al método escribe:
			escribe(empleado1, empleado2);

			// Incrementamos los años trabajados del empleado2:
			empleado2.incrAnyo();

			// Modificamos la categoría del empleado1:
			empleado1.setCategoria(9);
			
			// Llamamos de nuevo al método escribe:
			escribe(empleado1, empleado2);
			
		} catch (DatosNoCorrectosException e) {
			e.errorMessage();
			e.printStackTrace();
		}		
		
	}

	// ESCRIBE METHOD:
	public static void escribe(Empleado empleado1, Empleado empleado2) {
		empleado1.imprime();
		System.out
				.println("El empleado " + empleado1.nombre + " gana un sueldo de " + Nomina.sueldo(empleado1) + " €.");
		empleado2.imprime();
		System.out
				.println("El empleado " + empleado2.nombre + " gana un sueldo de " + Nomina.sueldo(empleado2) + " €.");
	}
}
