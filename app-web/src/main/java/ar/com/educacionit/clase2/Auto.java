package ar.com.educacionit.clase2;


// Nombre clase
public class Auto {
	// atributos
	
	private String marca;
	private String modelo;
	private String color;
	private int anio;
	private float velocidad;
	private float velocidadMaxima;
	private float combustible;
	private boolean encendido;
	
	// constructor: por defecto. Porque no tiene parametros
	public Auto(){
		//inicializar ciertos atributos de un objeto
		encendido = false;
		combustible = 0;
		anio = 2021;
		velocidad = 0;
		velocidadMaxima = 250;
	}
	
	
	// CONSTRUCTOR: PARAMETRIZADO
	public Auto(String marca, String modelo, String color, float velocidadMaxima){
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		encendido = false;
		combustible = 0;
		anio = 2021;
		velocidad = 0;
		this.velocidadMaxima = velocidadMaxima;
		//el this hace referencia al atributo del objeto. Asi no hay confusion.
		
	}
	
	// Metodos
	public void encender() {		
		if(encendido != true) {
			encendido = true;	
			System.out.println("Se ha encendido");
		}else {
			System.out.println("Ya esta encendido");
		}
			
	}
	
	public void apagar() {
		if(encendido != false) {
			encendido = false;
			System.out.println("Se ha apgado");
		}else {
			System.out.println("Ya esta apagado");
		}
		
	}
	
	public void acelerar() {
		if(encendido) {
			if(velocidad < velocidadMaxima) {
				if(combustible >0) {
					velocidad ++;
					combustible --;
				}else {
					System.out.println("No hay mas combustible");
				}
								
			}else {
				System.out.println("Velocidad maxima alcanzada");
			}
		}		
	}
	
	
	public float obtenerVelocidad() {
		return velocidad;
	}
	
	public void informarEstado() {
		System.out.println("Marca : " +this.marca);
		System.out.println("Model : " +this.modelo);
		System.out.println("Color : " +this.color);
		System.out.println("Encendido : " +this.encendido);
		System.out.println("Año : " +this.anio);
		System.out.println("Velocidad : " +this.velocidad);
		System.out.println("Velocidad Maxima : " +this.velocidadMaxima);
		System.out.println("Combustible : " +this.combustible);
		
	}
	
	//getter/setter
	public void setMarca(String marca) {
		if(marca != null) {
			//ejercicio
			this.marca = marca.toUpperCase(); 
			//this.marca hace referencia al valor del constructor. 			
			// = marca es el valor que traemos en el string.			
		}else {
			System.out.println("La Marca no puede ser null");
		}
	}
	
	public String getMArca() {
		return this.marca;
	}
	
	
}
