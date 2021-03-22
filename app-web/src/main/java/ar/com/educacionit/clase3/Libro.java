package ar.com.educacionit.clase3;

//herencia - Libro es un articulo
public class Libro extends Articulo{
	
	//atributos propios
	private String isbn;
	private String editorial;
	
	//Sin autor
	public Libro(String titulo, Float precio, String isbn, String editorial) {
		//tiene que nacer el padre
		super(titulo, precio);// LLamar al constructor del padre
		
		//luego seteo los atributos del hijo.
		/*this.isbn = isbn
		 * this.editorioal = editorial; alt+Shift+m y lo inicializamos
		 */
		inicializar(isbn, editorial);
	
	}

	private void inicializar(String isbn, String editorial) {
		this.editorial = editorial;
		this.isbn = isbn;
	}
	
	//Con autor
	public Libro(String titulo, String autor, Float precio, String isbn, String editorial) {
		//Primero el padre
		super(titulo, autor, precio);
		/*this.isbn = isbn
		 * this.editorioal = editorial; alt+Shift+m y lo inicializamos
		 */
		inicializar(isbn, editorial);
	}


	//Getters / Setters
	//Alt+Shift+s
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	

	//Sobreescritura = polimorfismo con redefinicion
	public void displayHijo() {
		System.out.println("Libro");
	
		System.out.println("ISBN: "+this.isbn);
		System.out.println("Editorioal: "+this.editorial);
		
		
	}
	
	
	
}
