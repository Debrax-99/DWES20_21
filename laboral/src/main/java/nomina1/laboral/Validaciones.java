package nomina1.laboral;

import java.util.regex.Pattern;

public class Validaciones {

	// CHECK DNI METHOD:
	public static boolean checkDni(String dni) {
		boolean check = false;
		String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";

		if (Pattern.matches(dniRegexp, dni)) {
			check = true;
		}

		return check;
	}

	// CHECK SEXO METHOD:
	public static boolean checkSexo(char sexo) {
		boolean check = false;

		if (sexo == 'M' || sexo == 'F') {
			check = true;
		}

		return check;
	}

}
