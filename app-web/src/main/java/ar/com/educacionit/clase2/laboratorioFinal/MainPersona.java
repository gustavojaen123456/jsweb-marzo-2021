package ar.com.educacionit.clase2.laboratorioFinal;

import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {
		/*Scanner, array de personas y variable de cantidad de personas**/
		/*syso ingrese cuantas personas quiere ingresar**/
		Scanner teclado = new Scanner(System.in);
		Persona[] personas;
		int cantidad_personas;
		
		System.out.println("Cuantas personas desea ingresar?");
		cantidad_personas = teclado.nextInt();
		personas = new Persona[cantidad_personas];

		
		/***Bucle que pregunta por los datos de las personas. Dentro del bucle hay que crear una persona Auxiliar y un Documento**/
		for(int i =0; i<cantidad_personas; i++) {
			Persona personaAuxiliar = new Persona();
			Documento documento = new Documento();
			
			System.out.println("Ingrese el nombre de la persona: ");
			personaAuxiliar.setNombre(teclado.next());
			System.out.println("Ingrese el apellido de la persona: ");
			personaAuxiliar.setApellido(teclado.next());
			System.out.println("Ingrese el tipo de Documento");
			documento.setTipoDocumento(teclado.next());
			System.out.println("Ingrese el número de documento");
			documento.setNumeroDocumento(teclado.nextInt());
			
			personaAuxiliar.setDocumento(documento);
			System.out.println("Ingrese la edad de la persona");
			personaAuxiliar.setEdad(teclado.nextByte()); 
			
			personas[i] = personaAuxiliar;
			System.out.println();
		}
		// mostramos un salto de linea para diferenciar el titulo
		System.out.print("\n");

		// mostramos las notas, en este metodo uso el .length y no la variable cantidad
		// solo a modo de ejemplo
		System.out.println("Datos de las Personas");	
					
		/***Bucle para mostrar los datos de las personas***/
		for(int i = 0; i< personas.length; i++) {
			String atributosPersona = personas[i].mostrarAtributos();
			System.out.println(atributosPersona);
			System.out.println("************");
		}
		/***Creamos un string (atributosPersona) y mostramos cada dato de la personas[i]***/
		/***System.out.println(atributosPersona);***/
		
		// debemos cerrar la comunicacion con la consola, no nos preocupemos ya que lo
				// veremos mas adelante el por qué de esto :)
				teclado.close();

	}

}
