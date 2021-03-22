package ar.com.educacionit.clase1;

import java.util.Scanner;

public class LaboratorioCondicionales {

	public static void main(String[] args) {
		/*	1. Declare e inicie 3 variables enteras y compare cual de las 3 es la mayor.
			2. Declare e inicie 2 variables que permitan realizar y mostrar en consola las operaciones básicas matemáticas (suma, resta,
			división y multiplicación) pero con la opción de elegir cual operación realizar.
			3. Del ejercicio anterior hacerlo con switch y que pueda aceptar el carácter ‘s’ para sumar, ‘r’ para restar, ‘m’ para multiplicar y ‘d’
			para dividir.*/
		
		int a = 50;
		int b = 10;
		int c = 9;
			
		//System.out.println("El mayor es " +mayor(a,b,c));
		
     Scanner teclado = new Scanner(System.in);
     System.out.println("Que operacion desea realizar 1-Suma 2-resta 3-Multi 4-Div");
     int operacion = teclado.nextInt();
     
     switch(operacion) {
     	case 1:
     		System.out.println(a+b);
     		break;
     	case 2:
     		System.out.println(a-b);
     		break;
     	case 3:
     		System.out.println(a*b);
     		break;
     	case 4:
     		System.out.println(a/b);
     }
	}
	
	static int mayor(int a, int b, int c) {
		
		if(a > b && a>c) {
			return a;
		}else if (b>a && b>c) {
			return b;
		}else {
			return c;
		}	
	}
	
	public static void calc(int a, int b) {
		 a = 2;
		 b = 10;
		 
	}

}
