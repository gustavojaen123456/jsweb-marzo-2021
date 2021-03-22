package ar.com.educacionit.clase3;

import java.util.Arrays;

public class Articulo {
	
	public final String nombre = "ARTICULO"; //no podemos cambiar el nombre
	
	//atributos de instancia
	private String titulo;
	private String autor;
	private Float precio;
	private String imagenPpal;
	private String[] imagenesExtras;
	
	//Atributos de clase
	static String tipo = "ARTICULO";
	public static Integer cantidadInstancias = 0; // Inicia en 0	
	
	//alt+shift+s. Luego quitamos el super();
	public Articulo(String titulo, String autor, Float precio) {
		inicializar(titulo, precio);
		this.autor = autor;
	}


	public Articulo(String titulo, Float precio) {
		inicializar(titulo, precio);
	}
	
	//alt+shift+m generamos inicializadores
	private void inicializar(String titulo, Float precio) {
		this.titulo = titulo;
		this.precio = precio;
		this.imagenPpal = "";
		this.imagenesExtras = new String[] {};
		//aumento en uno la cantidad de instancias
		Articulo.cantidadInstancias ++;
	}

    ///alt+shift+s generamos getters y setter
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Float getPrecio() {
		return precio;
	}


	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	//para saber si tiene autor
	public boolean tieneAutor() {
		return this.autor != null;
	}
	
	/*Nadie puede sobreescribir este metodo por ser final*/
	public final void display() {
		System.out.println("Titulo: "+this.getTitulo());
		System.out.println("Autor: ");
		if(this.tieneAutor()) {
			System.out.println(this.getAutor());
		}
		
		System.out.println("Precio: "+this.getPrecio());
		System.out.println("Imagenes Ppal ");
		if(this.tieneImagen()) {
			System.out.println(this.imagenPpal);
		}
		if(this.tieneImagenesExtras()) {
			System.out.println(Arrays.toString(this.imagenesExtras));
		}
		this.displayHijo();
	
	}
	
	//por defecto este metodo  no tiene logica
			public void displayHijo() {
				
			}


			public String getImagenPpal() {
				return imagenPpal;
			}


			public void setImagenPpal(String imagenPpal) {
				this.imagenPpal = imagenPpal;
			}


			public String[] getImagenesExtras() {
				return imagenesExtras;
			}


			public void setImagenesExtras(String[] imagenesExtras) {
				this.imagenesExtras = imagenesExtras;
			}
			
			public boolean tieneImagen() {
				return !this.imagenPpal.equals(""); //Porque nace con "". Si no las tienen es que tiene foto
			}
			
			public boolean tieneImagenesExtras() {
				return this.imagenesExtras.length >0;
			}
			
	
	
}
