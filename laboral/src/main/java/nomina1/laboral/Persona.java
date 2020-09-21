package nomina1.laboral;

public class Persona {
	//ATTRIBUTES:
	public String nombre;
	public String dni;
	public char sexo;
	
	//CONSTRUCTOR WITH ALL PARAMETHERS:
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
	
	//CONSTRUCTOR WITHOUT DNI:
	public Persona(String nombre, char sexo) throws DatosNoCorrectosException {
		this.nombre = nombre;
		if (Validaciones.checkSexo(sexo)) {
			this.sexo = sexo;
		} else {
			throw new DatosNoCorrectosException();
		}
	}
	
	//SET DNI METHOD:
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) throws DatosNoCorrectosException {
		if (Validaciones.checkDni(dni)) {
			this.dni = dni;
		} else {
			throw new DatosNoCorrectosException();
		}
	}
	
	//IMPRIME METHOD:
	public void imprime() {
		System.out.println("El dni de la persona con nombre " + this.nombre + " es " + this.dni + ".");
	}

}
