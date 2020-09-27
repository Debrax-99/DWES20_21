package laboral2;

/**
 * FP-2DAW Desarrollo Web en Entorno Servidor
 * 
 * @author Ana Blanco Escudero
 * @since 22-09-2020
 * 
 *        Clase Empleado que modeliza el objeto correspondiente a un empleado.
 */
public class Empleado extends Persona {
	// ATTRIBUTES:
	/** Categoría del empleado */
	private int categoria;
	/** Años trabajados por el empleado */
	public int anyo;

	/**
	 * Constructor genérico.
	 */
	// CONSTRUCTOR:
	public Empleado() {
		super();
	}

	/**
	 * Constructor sobrecargado.
	 * 
	 * @param nombre    el valor para el nombre de la persona
	 * @param dni       el valor para el DNI de la persona
	 * @param sexo      el valor para el género de la persona
	 * @param categoria el valor para la categoría del empleado
	 * @param anyo      número de años trabajados por el empleado
	 */
	// CONSTRUCTOR WITH ALL PARAMETHERS:
	public Empleado(String nombre, String dni, char sexo, int categoria, int anyo) throws DatosNoCorrectosException {
		super(nombre, dni, sexo);
		setCategoria(categoria);
		if (anyo >= 0) {
			this.anyo = anyo;
		} else {
			throw new DatosNoCorrectosException();
		}

	}

	/**
	 * Constructor sobrecargado.
	 * 
	 * @param nombre el valor para el nombre de la persona
	 * @param dni    el valor para el DNI de la persona
	 * @param sexo   el valor para el género de la persona
	 */
	// CONSTRUCTOR WITHOUT CATEGORIA AND ANYO:
	public Empleado(String nombre, String dni, char sexo) throws DatosNoCorrectosException {
		super(nombre, dni, sexo);
		this.categoria = 1;
		this.anyo = 0;
	}

	// SET CATEGORIA METHOD:
	/**
	 * Método que modifica la categoría de un empleado.
	 * 
	 * @param categoria the categoria to set
	 */
	public void setCategoria(int categoria) throws DatosNoCorrectosException {
		if (categoria < 1 || categoria > 10) {
			throw new DatosNoCorrectosException();
		} else {
			this.categoria = categoria;
		}
	}

	// GET CATEGORIA METHOD:
	/**
	 * Método que obtiene la categoría de un empleado.
	 * 
	 * @return the categoria
	 */
	public int getCategoria() {
		return categoria;
	}

	/**
	 * Método que aumenta en 1 los años trabajados por un empleado.
	 */
	// INCREMENT WORKED YEARS METHOD:
	public void incrAnyo() {
		this.anyo++;
	}

	/**
	 * Método que imprime los datos de un empleado.
	 */
	// IMPRIME METHOD:
	@Override
	public void imprime() {
		System.out.println("Los datos del empleado con nombre " + this.nombre + " son DNI:" + this.dni + ", sexo:"
				+ this.sexo + ", categoria:" + this.categoria + ", años trabajados:" + this.anyo + ".");
	}
}
