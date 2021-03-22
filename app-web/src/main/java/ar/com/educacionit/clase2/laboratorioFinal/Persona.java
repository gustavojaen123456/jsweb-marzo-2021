package ar.com.educacionit.clase2.laboratorioFinal;

import java.util.Random;

public class Persona {
	/***Ingresamos los atributos de la persona - Documento tiene que ser por clase ***/
	private String nombre;
	private String apellido;
	private Documento documento;
	private byte edad;
	
	
	public Persona() {
		
	}
	/***Metodo constructor sin edad y con edad***/
	public Persona(String nombre, String apellido, Documento documento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
	}
	
	public Persona(String nombre, String apellido, Documento documento, byte edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = edad;
	}

	
	/***Booleano que informe si es mayor de edad o no***/
	
	public boolean mayorEdad() {
		return edad >=18;
	}

	
	/***metodo para que asigne una edad***/
	public byte asignarEdad() {
		Random edad = new Random();
		return (byte) edad.nextInt();
	}

	
	/*** metodo que muestre los atributos en un String***/
	
	public String mostrarAtributos() {
		String atributos = "Nombre: "+nombre+"\n"+"Apellido: "+apellido+"\n"+"Documento: "+documento.mostrarAtributos()+"\n"+"Edad: "+edad+" \n"+"Es "+(mayorEdad()? "Mayor de Edad":"Menor de Edad");
		return atributos;
	}
	
	/***Getters y Setters***/
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Documento getDocumento() {
		return documento;
	}
	
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	
	public byte getEdad() {
		return edad;
	}
	
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	
	

	
	
	
	
}
