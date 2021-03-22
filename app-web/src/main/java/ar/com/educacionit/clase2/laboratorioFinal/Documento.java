package ar.com.educacionit.clase2.laboratorioFinal;

public class Documento {
	/***Atributos privados***/
	private String tipoDocumento;
	private int numeroDocumento;
	
	public Documento () {
		
	}
	/***Constructor del Documento***/
	public Documento(String tipoDocumento, int numeroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}
	
	/**Metodo string para mostrar loa atributos***/

	public String mostrarAtributos() {
		return "Tipo de documento: "+tipoDocumento+"\n"+"Numero Documento:" +numeroDocumento;
	}
	
	/**
	 * getters y setters
	 */
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	
	public int getNumeroDocumento() {
		return numeroDocumento;
	}
	
	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	
	
}
