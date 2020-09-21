package nomina1.laboral;

public class DatosNoCorrectosException extends Exception {

	// CONSTRUCTOR:
	public DatosNoCorrectosException() {

	}

	// ERROR MESSAGE METHOD:
	public void errorMessage() {
		System.out.println("Datos no correctos.");
	}

}
