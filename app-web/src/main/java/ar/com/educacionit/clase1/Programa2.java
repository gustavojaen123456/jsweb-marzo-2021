package ar.com.educacionit.clase1;

public class Programa2 {

	public static void main(String[] args) {
		// Operadores relacionales
		
		float alturaMia = 180;
		float otraAltura = 180.1f;
		//por defecto los valores con decimales son double
		//por eso ponemos una f al final del valor float
		
		if(alturaMia > otraAltura) {
			System.out.println("Soy Mas Alto");
		}else if (alturaMia < otraAltura) {
			System.out.println("Soy mas bajo");
		}else {
			System.out.println("Somos iguales de estatura");
		}
		
		
		

	}

}
