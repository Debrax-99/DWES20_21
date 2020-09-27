package laboral2;

/**
 * FP-2DAW Desarrollo Web en Entorno Servidor
 * 
 * @author Ana Blanco Escudero
 * @since 22-09-2020
 * 
 *        Clase Persona que modeliza el objeto correspondiente a una persona.
 */
public class Persona {
	// ATTRIBUTES:
	/** Nombre de la persona */
	public String nombre;
	/** DNI de la persona */
	public String dni;
	/** Género de la persona */
	public char sexo;

	/**
	 * Constructor genérico
	 */
	// CONSTRUCTOR:
	public Persona() {

	}

	/**
	 * Constructor sobrecargado.
	 * 
	 * @param nombre el valor para el nombre de la persona
	 * @param dni    el valor para el DNI de la persona
	 * @param sexo   el valor para el género de la persona
	 */
	// CONSTRUCTOR WITH ALL PARAMETHERS:
	public Persona(String nombre, String dni, char sexo) throws DatosNoCorrectosException {
		this.nombre = nombre;
		if (Validaciones.checkDni(dni)) {
			this.dni = dni;
		} else {
			throw new DatosNoCorrectosException();
		}

		if (Validaciones.checkSexo(sexo)) {
			this.sexo = sexo;
		} else {
			throw new DatosNoCorrectosException();
		}

	}

	/**
	 * Constructor sobrecargado.
	 * 
	 * @param nombre el valor para el nombre de la persona
	 * @param sexo   el valor para el género de la persona
	 */
	// CONSTRUCTOR WITHOUT DNI:
	public Persona(String nombre, char sexo) throws DatosNoCorrectosException {
		this.nombre = nombre;
		if (Validaciones.checkSexo(sexo)) {
			this.sexo = sexo;
		} else {
			throw new DatosNoCorrectosException();
		}
	}

	// SET DNI METHOD:
	/**
	 * Método que modifica el DNI de una persona.
	 * 
	 * @param dni the dni to set
	 */
	public void setDni(String dni) throws DatosNoCorrectosException {
		if (Validaciones.checkDni(dni)) {
			this.dni = dni;
		} else {
			throw new DatosNoCorrectosException();
		}
	}

	/**
	 * Método que imprime los datos de una persona.
	 */
	// IMPRIME METHOD:
	public void imprime() {
		System.out.println("El dni de la persona con nombre " + this.nombre + " es " + this.dni + ".");
	}

}
