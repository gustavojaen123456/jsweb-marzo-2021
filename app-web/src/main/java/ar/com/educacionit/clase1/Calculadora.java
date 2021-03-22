package ar.com.educacionit.clase1;

public class Calculadora {
	
	public static void main(String[] args) {		
		// suma
		int a = 200;
		int b = 20;
		
		int c = a+b;
		System.out.println(sumar(a,b));
		
		float division = dividir(a,b);		
		System.out.println(division);
	}
	
	static int sumar(int a, int b) {
		return a + b;
	}
	
	static int dividir(int a, int b) {
		if(b != 0) {
			return a/b;
		}else {
			System.out.println("No se puede dividir por 0");
			return -0;
		}
	}

}
