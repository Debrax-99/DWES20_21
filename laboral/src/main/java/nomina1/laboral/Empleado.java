package nomina1.laboral;

public class Empleado extends Persona {
	// ATTRIBUTES:
	private int categoria;
	public int anyo;

	// CONSTRUCTOR WITH ALL PARAMETHERS:
	public Empleado(String nombre, String dni, char sexo, int categoria, int anyo) {
		super(nombre, dni, sexo);
		this.categoria = categoria;
		this.anyo = anyo;
	}

	// CONSTRUCTOR WITHOUT CATEGORIA AND ANYO:
	public Empleado(String nombre, String dni, char sexo) {
		super(nombre, dni, sexo);
		this.categoria = 1;
		this.anyo = 0;
	}

	// SET CATEGORIA METHOD:
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	// GET CATEGORIA METHOD:
	/**
	 * @return the categoria
	 */
	public int getCategoria() {
		return categoria;
	}

	// INCREMENT WORKED YEARS METHOD:
	public void incrAnyo() {
		this.anyo++;
	}

	// IMPRIME METHOD:
	@Override
	public void imprime() {
		System.out.println("Los datos del empleado con nombre " + this.nombre + " son DNI:" + this.dni + ", sexo:"
				+ this.sexo + ", categoria:" + this.categoria + ", años trabajados:" + this.anyo + ".");
	}
}
