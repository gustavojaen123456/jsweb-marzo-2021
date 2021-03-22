package ar.com.educacionit.clase3.laboratorioFinal;


import java.util.Scanner;
import ar.com.educacionit.clase3.laboratorioFinal.Alumno;
import ar.com.educacionit.clase3.laboratorioFinal.Documento;
import ar.com.educacionit.clase3.laboratorioFinal.Persona;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// Utilizamos la Clase Scanner para pedir los datos por la consola
		Scanner teclado = new Scanner(System.in);

		// declaracion de Variables, sin inicializarlos porque no sabemos el tamano
		Alumno[] alumnos;
		int cantalumnos;

		// mostramos por pantalla
		System.out.println("Ingreso de Datos de alumnos Laboratorio01");
		// mostramos un salto de linea para diferenciar el titulo
		System.out.print("\n");

		// pregunta a usuario
		System.out.print("Ingrese la cantidad de alumnos que cargara: ");

		// capturamos lo que el usuario ingresa y lo asignamos como tamaño del
		// vector, recuerden Int para capturar es un entero y saber cantidad de alumnos
		cantalumnos = teclado.nextInt();
		alumnos = new Alumno[cantalumnos];

		// usamos un for para preguntar cada uno de los datos de las alumnos
		for (int i = 0; i < alumnos.length; i++) {

			System.out.print("Ingrese el Nombre del Alumno [" + (i + 1) + "]: ");
			String nombre = teclado.next();
			System.out.print("Ingrese el Apellido del Alumno [" + (i + 1) + "]: ");
			String apellido = teclado.next();
			System.out.print("Ingrese el Tipo de Documento del Alumno [" + (i + 1) + "]: ");
			String tipoDocumento = teclado.next();
			System.out.print("Ingrese el Numero de Documento del Alumno [" + (i + 1) + "]: ");
			int numeroDocumento = teclado.nextInt();

			System.out.print("Ingrese la Edad del Alumno [" + (i + 1) + "]: ");
			byte edad = teclado.nextByte();

			System.out.print("Ingrese la cantidad de cursos del Alumno [" + (i + 1) + "]: ");
			int cantidadCursos = teclado.nextInt();
			String[] cursos = new String[cantidadCursos];

			for (int j = 0; j < cursos.length; j++) {
				System.out.print("Ingrese el curso [" + (j + 1) + "] del Alumno [" + (i + 1) + "]: ");
				cursos[j] = teclado.next();
			}

			alumnos[i] = new Alumno(nombre, apellido, new Documento(tipoDocumento, numeroDocumento), edad, cursos);
			System.out.println();

		}
		// mostramos un salto de linea para diferenciar el titulo
		System.out.print("\n");

		// mostramos las notas, en este metodo uso el .length y no la variable cantidad
		// solo a modo de ejemplo
		System.out.println("Datos de las alumnos");
		for (int i = 0; i < alumnos.length; i++) {
			// mostramos los datos de las alumnos

			System.out.println(alumnos[i]);

		}

		// mostramos la cantidad de personas asignadas
		System.out.println("Cantidad de Personas " + Persona.getContador());

		// debemos cerrar la comunicacion con la consola, no nos preocupemos ya que lo
		// veremos mas adelante el por qué de esto :)
		teclado.close();

	}

}
