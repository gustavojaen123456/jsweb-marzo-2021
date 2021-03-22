package ar.com.educacionint.clase2.Laboratorio;

import java.util.Scanner;

public class Data {
	
	public static void main(String[] args) {
			String nombre;
			String apellido;
			String tipoDocumento;
			String numreoDocumento;
			int edad;
			
			PersonaDos[] personas;
			int cantPersonas;
			
			// mostramos por pantalla
			System.out.println("Ingreso de Datos de Personas Laboratorio 1");
			// mostramos un salto de linea para diferenciar el titulo
			System.out.print("\n");
			
			Scanner teclado = new Scanner(System.in);
			
			// pregunta a usuario
			System.out.print("Ingrese la cantidad de Personas que cargara: ");

			// capturamos lo que el usuario ingresa y lo asignamos como tamaño del
			// vector, recuerden Int para capturar es un entero y saber cantidad de personas
			cantPersonas = teclado.nextInt();
			personas = new PersonaDos[cantPersonas];
			
			
			// usamos un for para preguntar cada uno de los datos de las personas
			for (int i = 0; i < personas.length; i++) {
				// preguntamos los datos de las personas y podemos usar un objeto auxiliar
				
				System.out.print("Ingrese el Nombre de la Persona [" + (i + 1) + "]: ");
				nombre = teclado.next();
				System.out.print("Ingrese el Apellido de la Persona [" + (i + 1) + "]: ");
				apellido = teclado.next();
				System.out.print("Ingrese el Tipo de Documento de la Persona [" + (i + 1) + "]: ");
				tipoDocumento = teclado.next();
				System.out.print("Ingrese el Numero de Documento de la Persona [" + (i + 1) + "]: ");
				numreoDocumento = teclado.next();
				System.out.print("Ingrese el Edad de la Persona [" + (i + 1) + "]: ");
				edad = teclado.nextByte();
				
				PersonaDos personaAuxiliar = new PersonaDos(nombre, apellido, tipoDocumento, numreoDocumento, edad);
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

				personas[i].display();

			}

			// debemos cerrar la comunicacion con la consola, no nos preocupemos ya que lo
			// veremos mas adelante el por qué de esto :)
			teclado.close();
		}
}
