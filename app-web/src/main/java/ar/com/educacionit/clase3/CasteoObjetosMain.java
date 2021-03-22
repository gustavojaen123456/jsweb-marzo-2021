package ar.com.educacionit.clase3;

public class CasteoObjetosMain {

	public static void main(String[] args) {
		
		// (libro != musica != pasatiempo != pelicula) < Articulo
		// Clases Hermanas							   < Padre
		Libro l =new Libro("Tony Star Iron man", "Scott Dan", 830f, "12345698", "Panini");
		Pasatiempo p = new Pasatiempo("Ironman 15 cm", 117.99f, "Hasbro", "4561234");
		Musica m =new Musica("Ironman 15 cm","Brian Michel", 1125f, "Sony",new String[] {});
		Pelicula pe = new Pelicula("IronMan 3", 830f, "Warner", "Todo Publico");
		
		
		Articulo articulo = new Libro("Tony Star Iron man", "Scott Dan", 830f, "12345698", "Panini");
		articulo.getAutor();
		articulo.getPrecio();
		articulo.getTitulo();
		
		Libro libro = (Libro)articulo;
		libro.getIsbn();
		libro.getEditorial();
		
		//-------------------------------//
		
		
	}

}
