package ar.com.educacionit.clase3;

import ar.com.educacionit.clase2.Auto;

public class MainClase3 {

	public static void main(String[] args) {
		// Encapsulamiento
		/*	
		 * Modificamos los accesos de la clase Auto.java de la clase 2.
		 * 
		 *  - Privado - Solo es visible dentro de la clase
		 *  + publico
		 *  ~ / # protegido (cualquiera de los dos)
		 *  
		 *  GET/SET para modificar los atributos
		 *  GET obtiene informacion
		 *  SET establece o modifica la info.
		 */
		
		
		Auto auto = new Auto();
		//setear una marca en el auto, porque no tiene una predeterminada.
		// El metodo set se define al final de la clase Auto.java dela clase 2
					
		auto.setMarca("Ford");
		auto.getMArca();
		
		auto.encender();
		auto.acelerar();
		auto.informarEstado();
		
	
	}

}
