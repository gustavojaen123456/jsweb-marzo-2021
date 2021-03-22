package ar.com.educacionit.clase3;

public final class Pelicula extends Articulo {//final corta la linea de herencia. 
	
	private String productora;
	private String clasificacion;
	
	public Pelicula(String titulo, String autor, Float precio, String productora, String clasificacion) {
		super(titulo, autor, precio);
		inicializar(productora, clasificacion);
	}

	private void inicializar(String productora, String clasificacion) {
		this.productora = productora;
		this.clasificacion = clasificacion;
	}
	
	public Pelicula(String titulo, Float precio, String productora, String clasificacion) {
		super(titulo, precio);
		inicializar(productora, clasificacion);
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	

	//Sobreescritura = polimorfismo con redefinicion
	public void displayHijo() {
		System.out.println("Pelicula");
	
		System.out.println("Productora: "+this.productora);
		System.out.println("Clasificacion: "+this.clasificacion);
		
	
	}
	
	


}
