package ar.com.educacionit.clase1;

public class Programa4 {

	public static void main(String[] args) {
		// Vectores
		
		String[] alumnos;
		alumnos = new String[3];
		
		//cargar vectores
		alumnos[0] = "Carlos";
		alumnos[1] = "Marta";
		alumnos[2] = "Pepe";
		
		// recorrer un vector
		for(int i = 0; i<alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}
		
		//---------Al iniciar los arreglos booleanos los valores son siempre flase
		boolean[] mayores20 = new boolean[6];
		//for each Solo para recorrer elementos
		for( boolean aux : mayores20 ) {
			aux = true;
		}
		for(int i = 0; i<mayores20.length; i++) {
			mayores20[i] = true;
		}
		
		boolean[] mayores40 = new boolean[3];
		
		
		
		
		
	}

}
