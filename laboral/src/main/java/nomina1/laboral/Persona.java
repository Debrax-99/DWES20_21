package nomina1.laboral;

public class Persona {
	//ATTRIBUTES:
	public String nombre;
	public String dni;
	public char sexo;
	
	//CONSTRUCTOR WITH ALL PARAMETHERS:
	public Persona(String nombre, String dni, char sexo) {
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
	}
	
	//CONSTRUCTOR WITHOUT DNI:
	public Persona(String nombre, char sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	//SET DNI METHOD:
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	//IMPRIME METHOD:
	public void imprime() {
		System.out.println("El dni de la persona con nombre " + this.nombre + " es " + this.dni + ".");
	}

}
