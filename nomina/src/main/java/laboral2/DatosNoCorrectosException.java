package laboral2;

/**
 * FP-2DAW Desarrollo Web en Entorno Servidor
 * 
 * @author Ana Blanco Escudero
 * @since 22-09-2020
 * 
 *        Clase DatosNoCorrectosException que define una excepción específica
 *        para el manejo de errores.
 */
public class DatosNoCorrectosException extends Exception {

	/**
	 * Constructor genérico.
	 */
	// CONSTRUCTOR:
	public DatosNoCorrectosException() {

	}

	/**
	 * Método que imprime por pantalla un mensaje de error para el manejo de la
	 * excepción.
	 */
	// ERROR MESSAGE METHOD:
	public void errorMessage() {
		System.out.println("Datos no correctos.");
	}

}
