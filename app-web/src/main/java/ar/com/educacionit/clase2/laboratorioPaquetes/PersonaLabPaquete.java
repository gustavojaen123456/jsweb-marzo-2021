package ar.com.educacionit.clase2.laboratorioPaquetes;

import java.util.Random;
/***La persona tiene sus atributos ***/


/**El documento se asigna con un metodo de la clase Documento, este simplemente muestra en texto el tipo y numero***/
public class PersonaLabPaquete {
	
	public String nombre;
	public String apellido;
	public Documento documento; /***Se asignara en la clase Documento***/
	public int edad;

	
	public PersonaLabPaquete (String nombre, String apellido, Documento documento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = asignarEdad();
	}
	
	public boolean mayorEdad() {
		return edad >=18;
	}
	
	/**La edad se asigna desde un metodo propio de la persona**/
	public int asignarEdad() {
		Random nuevaEdad = new Random();
		return (byte) nuevaEdad.nextInt(127);
	}
	
	/**La persona cuenta con un metodo display
	 * EL display guarda todos los atributos en un String y los muestra en un return
	 * **/
	/***Dentro del display se muestra el resultado del boolean si es mayor de edad o no***/
	public String display() {
		String mensaje = "Nombre: "+ nombre + "\n Apellido: " + apellido + "\n" + documento.display() + "\n Edad: " + edad + "\n y es " + (mayorEdad()? "Mayor de edad" : "menor de edad");
		return mensaje;
	}

	
}


