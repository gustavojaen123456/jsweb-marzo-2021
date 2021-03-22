package ar.com.educacionit.clase2.laboratorioPaquetes;

public class Documento {
	String tipoDocumento;
	int numeroDocumento;
	/***Creamos un metodo que asigne valores a las variables arriba**/
	// constructor con todos los atributos
	
	public Documento (String tipoDocumento, int numeroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	
	/***El metodo  display documento debe retornar un string con los valores**/
	public String display() {
		return "tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento;
	}

}
