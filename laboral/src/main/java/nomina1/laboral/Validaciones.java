package nomina1.laboral;

import java.util.regex.Pattern;

/**
 * FP-2DAW Desarrollo Web en Entorno Servidor
 * 
 * @author Ana Blanco Escudero
 * @since 22-09-2020
 * 
 *        Clase Validacionesn que contiene los métodos necesarios para validar
 *        los datos.
 */
public class Validaciones {

	/**
	 * Método que valida un DNI.
	 * 
	 * @param dni el DNI que hay que comprobar.
	 * @return boolean check el resultado de la validación.
	 */
	// CHECK DNI METHOD:
	public static boolean checkDni(String dni) {
		boolean check = false;
		String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";

		if (Pattern.matches(dniRegexp, dni)) {
			check = true;
		}

		return check;
	}

	/**
	 * Método que valida el género.
	 * 
	 * @param sexo el género que hay que comprobar.
	 * @return boolean check el resultado de la validación.
	 */
	// CHECK SEXO METHOD:
	public static boolean checkSexo(char sexo) {
		boolean check = false;

		if (sexo == 'M' || sexo == 'F') {
			check = true;
		}

		return check;
	}

}
