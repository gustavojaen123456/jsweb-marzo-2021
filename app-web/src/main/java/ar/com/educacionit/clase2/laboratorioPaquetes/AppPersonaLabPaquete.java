package ar.com.educacionit.clase2.laboratorioPaquetes;

import java.util.Scanner;

public class AppPersonaLabPaquete {
	public static void main(String[] args) {
			/*** declarar el array personas PersonaLabPaquete[]***/
			/*** declarar la variable de cantidad de personas***/
			Scanner teclado = new Scanner(System.in);
			PersonaLabPaquete[] personas;
			int cantidad_personas;
			
			
			System.out.println("Ingrese los datos de las Personas");
			System.out.println("\n");
			
			/***asingamos el valor a cantidadPersonas**/
			/** instanciamos la variable personas diciendo cuantas personas tendrá el array**/
			System.out.println("Cuantas personas quiere ingresar al sistema");
			cantidad_personas = teclado.nextInt();
			personas = new PersonaLabPaquete[cantidad_personas];

			
			/***Con un for solicitamos los datos nombre, apellido, tipo de documento, numero de documento***/
			for (int i = 0; i < personas.length; i++){


				System.out.println("Ingrese el nombre de la persona" + (i+1) + ":");
				String nombre = teclado.next();
				System.out.println("Ingrese el apellido de la persona" + (i+1) + ":");
				String apellido = teclado.next();
				System.out.println("Ingrese el Tipo de documento de la persona" + (i+1) + ":");
				String tipoDocumento = teclado.next();
				System.out.println("Ingrese el numero de documento de la persona" + (i+1) + ":");
				int numeroDocumento = teclado.nextInt();
				
				/***Dentro del for creamos el objeto del docuemnto con las variables que asignamos arriba**/
				Documento documento = new Documento(tipoDocumento, numeroDocumento);
				// creamos un objeto persona auxiliar para asignar a la posicion del vector
				// correspondiente
				// vemos la venta de utilizar variables auxiliares con el mismo nombre de los
				// parametros
				PersonaLabPaquete personaAuxiliar = new PersonaLabPaquete(nombre, apellido, documento);

				// tambien podemos omitir el objeto documento y mandarlo instanciando
				// directamente al constructor de persona
				// Persona personaAuxiliar = new Persona(nombre, apellido, new
				// Documento(tipoDocumento, numeroDocumento), edad);
				// asignamos el objeto auxiliar a la posicion del vector correspondiente
				personas[i] = personaAuxiliar;
				System.out.println();
			}
			// mostramos un salto de linea para diferenciar el titulo
			System.out.print("\n");

			// mostramos las notas, en este metodo uso el .length y no la variable cantidad
			// solo a modo de ejemplo
			System.out.println("Datos de las Personas");
			for (int i = 0; i < personas.length; i++) {
				// mostramos los datos de las personas

				// al cambiar el metodo a uno con retorno lo podemos utilizar en donde
				// necesitemos y no nos vmos limitados a solo imprimirlo en consola
				System.out.println(personas[i].display());

			}

			// debemos cerrar la comunicacion con la consola, no nos preocupemos ya que lo
			// veremos mas adelante el por qué de esto :)
			teclado.close();
			
		
	}
}
