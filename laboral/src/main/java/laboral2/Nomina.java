package laboral2;

/**
 * FP-2DAW Desarrollo Web en Entorno Servidor
 * 
 * @author Ana Blanco Escudero
 * @since 22-09-2020
 * 
 *        Clase Nomina que modeliza el objeto correspondiente a la biblioteca de
 *        sueldos de una empresa.
 */
public class Nomina {
	// ATTRIBUTES:
	/** Tabla de sueldos base */
	private static final int SUELDO_BASE[] = { 50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000,
			230000 };

	/**
	 * Método que calcula el sueldo de un empleado.
	 * 
	 * @param empleado el empleado del que se quiere calcular el sueldo.
	 * @return int sueldo el sueldo del empleado.
	 */
	// SUELDO METHOD:
	public static int sueldo(Empleado empleado) {
		int sueldo = SUELDO_BASE[empleado.getCategoria() - 1] + 5000 * empleado.anyo;
		return sueldo;
	}

}
