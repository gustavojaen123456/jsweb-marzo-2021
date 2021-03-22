package ar.com.educacionit.clase3.laboratorio;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String tipoDocumento;
	private String numreoDocumento;
	private int edad;
	private boolean mayor;
	
	//Constructor
	public Persona(String nombre, String apellido, String tipoDocumento, String numreoDocumento, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDocumento = tipoDocumento;
		this.numreoDocumento = numreoDocumento;
		this.edad = edad;
		
	}
	
	
	//Metodo
	public String mayor() {
		if(edad >= 18) {
		 return "Es mayor de edad";
		}else {
		return "Es menor de edad";
		}
	}
	
	public void display() {
		System.out.println("Nombre: "+ this.nombre);
		System.out.println("Apellido: "+ this.apellido);
		System.out.println("Tipo de Documento: "+this.tipoDocumento);
		System.out.println("Numero de Docuemnto: "+this.numreoDocumento);
		System.out.println("Edad: "+ edad);
		System.out.println("******************************************");
		System.out.println(this.mayor());
	}
}
