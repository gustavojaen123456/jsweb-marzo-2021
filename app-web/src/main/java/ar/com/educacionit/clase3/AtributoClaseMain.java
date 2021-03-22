package ar.com.educacionit.clase3;

public class AtributoClaseMain {
	
	public static void main(String[] args) {
		Libro l = new Libro("Tony Star Iron man", "Scott Dan", 830f, "12345698", "Panini");
		Pasatiempo p = new Pasatiempo("Ironman 15 cm", 117.99f, "Hasbro", "4561234");
		
		//Atriburo de objeto se accede asi
		//objeto.metodo | atributo
		l.getAutor();
		
		//Atributo de clase se accede asi
		String tipo = Articulo.tipo;
	}
}
