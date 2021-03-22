package ar.com.educacionit.clase3;

public class CasteoMain {

	public static void main(String[] args) {
		
		//byte < short <int < long < float < double
		
		byte b =1;
		short s = 10;
		int a = 20;
		
		long aux = b;
		aux = s; 
		aux = a;
		
		a = (int)aux;

	}

}
