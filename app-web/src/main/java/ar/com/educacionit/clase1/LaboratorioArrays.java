package ar.com.educacionit.clase1;

import java.util.Arrays;
import java.util.Scanner;

public class LaboratorioArrays {
	public static void main(String[] args) {
		// la clase scanner para capturar valores del teclado
		Scanner teclado = new Scanner(System.in);
		
		// declaracion de Variables, sin inicializarlos porque no sabemos el tamano
		double[] notas_alumnos;
		String[] nombres_alumnos;
		int cant_alumnos;
		
	
		
		// mostramos por pantalla
		System.out.println("Notas de Educacion IT");
		// mostramos un salto de linea para diferenciar el titulo
		System.out.print("\n");
		
		// pregunta a usuario
				System.out.print("Ingrese la cantidad de notas que cargara: ");

		// capturamos lo que el usuario ingresa y lo asignamos como tamaño del
		// vector, recuerden Int para capturar es un entero y saber cantidad de alumnos
		cant_alumnos = teclado.nextInt();
		
		notas_alumnos = new double [cant_alumnos];
		nombres_alumnos = new String[cant_alumnos];
		
		// usamos un for para preguntar cada uno de los nombres y las notas
		for(int i=0; i<cant_alumnos; i++) {
			// preguntamos los nombres y notas
			System.out.println("Ingrese el nombre del alumno ["+(i+1)+"]: ");
			nombres_alumnos[i] = teclado.next();
			
			// preguntamos la nota
			System.out.println("Ingrese la nota del alumno ["+ nombres_alumnos[i]+"]: ");
			notas_alumnos[i] = teclado.nextDouble();
		}
		
		System.out.println("----------------------------------");
		
		// mostramos las notas, en este metodo uso el .length y no la variable cantidad
		// solo a modo de ejemplo
		System.out.println("NOTAS PARCIALES DE LOS ALUMNOS: ");
		for (int i = 0; i < nombres_alumnos.length; i++) {
			// mostramos las notas como las ingresaron
			System.out.println(nombres_alumnos[i] + " obtuvo " + notas_alumnos[i] + " pts");

		}
		
		System.out.println("----------------------------------");
		
		// el promedio y la suma inicializamos en cero y las notas las inicializamos en
		// la primera posicion del vector
		double promedio = 0, suma = 0, nota_mayor = 0; 
		double nota_menor = notas_alumnos[0];
		int posicion_mayor = 0;
		int posicion_menor = 0;
		
		for(int i =0; i < cant_alumnos; i++) {
			suma = suma+notas_alumnos[i];
			
			if(i==0) {
				continue;
			}
			
			if(nota_mayor < notas_alumnos[i]) {
				nota_mayor = notas_alumnos[i];
				posicion_mayor = i;
			}
			
			if(nota_menor > notas_alumnos[i]) {
				nota_menor = notas_alumnos[i];
				posicion_menor = i;
			}
			
		}
		
		promedio = suma / cant_alumnos;
		
		System.out.println("El pronedio de las notas es: " + promedio);
		System.out.println("El Alumno con mejor nota es: " + nombres_alumnos[posicion_mayor] + " que obtuvo un " + notas_alumnos[posicion_mayor]);
		System.out.println("El alumno con peor nota es : " + nombres_alumnos[posicion_menor] + " que obtuvo un " + notas_alumnos[posicion_menor]);
		
		
		System.out.println("Notas antes de ordenar:");
		System.out.println(Arrays.toString(notas_alumnos));
		System.out.println(Arrays.toString(nombres_alumnos));
		
		// bonus ordenamiento burbuja
		for (int i = 0; i < notas_alumnos.length; i++) {

			for (int j = 0; j < notas_alumnos.length; j++) {
				if (notas_alumnos[i] < notas_alumnos[j]) {
					// movemos las notas
					// para ello necesitamos de un auxiliar que guarde momentaneamente uno de los
					// valores
					double notaAuxiliar = notas_alumnos[i];
					notas_alumnos[i] = notas_alumnos[j];
					notas_alumnos[j] = notaAuxiliar;

					// aprovechamos para mover los nombres cuando se de la condicion
					String nombreAuxiliar = nombres_alumnos[i];
					nombres_alumnos[i] = nombres_alumnos[j];
					nombres_alumnos[j] = nombreAuxiliar;
				}

			}
		}
		
	}
}
