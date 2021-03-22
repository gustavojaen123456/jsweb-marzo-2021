package ar.com.educacionit.clase1;


public class LaboratorioOperadores {

	public static void main(String[] args) {		
		// suma
		int a = 200;
		int b = 20;
		int c = 2;
		int d = 10;
		
		int suma = sumar(a,b);
		System.out.println(suma);
		
		float division = dividir(a,b);		
		System.out.println(division);
		
		int multiplicar = multiplicar(a,b);
		System.out.println(multiplicar);
		
		float promedio = promedio(a,b,c,d);
		System.out.println(promedio);
		
		float dividir = dividir(a,b);
		System.out.println(dividir);
	}
	
	
	static int sumar(int a, int b) {
		return a + b;
	}
	
	static int restar (int a, int b) {
		return a-b;
	}
	
	static int multiplicar (int a, int b) {
		return a*b;
	}
	
	static float dividir (int a, int b) {
		return a/b;
	}
	
	static float promedio (int a, int b, int c, int d) {
		float cuenta = (a+b+c+d)/4;
		return cuenta;
	}

	
}
