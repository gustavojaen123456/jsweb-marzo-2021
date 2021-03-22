package ar.com.educacionit.clase3.laboratorioFinal;

public class Persona {
	
	private static int contador = 0;
	private int id;
	private String nombre;
	private String apellido;
	private Documento documento;
	private byte edad;
	
	
	public Persona( String nombre, String apellido, Documento documento, byte edad) {
		contador++;
		this.id = contador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = edad;
	}
	
	public boolean mayorEdad() {
		return edad >=18;
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento
				+ ", edad=" + edad + "]";
	}
	
	
	/****gettes y setters***/
	
	public String getNombre() {
		return nombre;
	}
	
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
	
	/***Contador***/
	public static int getContador() {
		return contador;
	}
}
