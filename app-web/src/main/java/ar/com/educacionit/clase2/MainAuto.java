package ar.com.educacionit.clase2;

public class MainAuto {

	public static void main(String[] args) {
		
		//como instanciar un objeto de la clase auto.
		
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto("Renault", "Duster", "rojo", 270);
		
		//ahora que el auto esta vivo
		auto1.encender();
		System.out.println("*********");
		auto1.informarEstado();
		System.out.println("*********");
		auto1.acelerar();
		System.out.println("*********");
		auto1.informarEstado();
		System.out.println("*********");
		
		
		auto3.encender();
		System.out.println("*********");
		auto3.informarEstado();
		System.out.println("*********");
	}

}
