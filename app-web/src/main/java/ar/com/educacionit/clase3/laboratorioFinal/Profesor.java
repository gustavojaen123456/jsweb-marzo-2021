package ar.com.educacionit.clase3.laboratorioFinal;

public class Profesor extends Persona {
	private Float pago;

	public Profesor(String nombre, String apellido, Documento documento, Byte edad, Float pago) {
		super(nombre, apellido, documento, edad);
		this.pago = pago;
	}

	@Override
	public String toString() {
		return "Profesor [toString()=" + super.toString() + ", pago=" + pago + "]";
	}

	/**
	 * @return the pago
	 */
	public Float getPago() {
		return pago;
	}

	/**
	 * @param pago the pago to set
	 */
	public void setPago(Float pago) {
		this.pago = pago;
	}

}
