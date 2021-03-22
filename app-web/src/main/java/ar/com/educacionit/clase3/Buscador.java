package ar.com.educacionit.clase3;

public class Buscador {

	//atributos
	private String claveBusqueda;
	private Integer cantidadResultados;
	private Articulo[] resultados; //Articulo.java

	
	//constructor
	public Buscador () {
		this.resultados = new Articulo[0];
		this.cantidadResultados = 0;
		this.claveBusqueda = "";
	}
	
	public void buscar() {
		// aqui iria el SQL 
		/*
		 * ej select * from articulos where titulo like '%this.claveBusqueda%';
		 * 
		 * Esto devolveria un array. En este caso lo hacemos manual String[]
		 */
		Libro libro = new Libro("Tony Star Iron man", "Scott Dan", 830f, "12345698", "Panini");
		libro.setImagenPpal("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcT95Db6V4jzEkaZjnWEV5n0qHu1a2InkUgafj3lWQDRxQIxYvL3");
		
		Libro libro2 = new Libro("Invencible Iron Man", "Brian Michel", 1525f, "5645623", "Ovni Press");
		libro.setImagenPpal("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcT95Db6V4jzEkaZjnWEV5n0qHu1a2InkUgafj3lWQDRxQIxYvL3");
		
		Pasatiempo pasatiempo = new Pasatiempo("Ironman 15 cm", 117.99f, "Hasbro", "4561234");
		pasatiempo.setImagenPpal("https://s2.thcdn.com/productimg/1600/1600/12231564-1574691876703918.jpg");
		String[] imagenesExtrasPasatiempo = new String[] {
			"https://s2.thcdn.com/productimg/1600/1600/12231564-1574691876703918.jpg",
			"https://s2.thcdn.com/productimg/1600/1600/12231564-1574691876703916.jpg",
			"https://s2.thcdn.com/productimg/1600/1600/12231564-1574691876703918.jpg"
		};
		pasatiempo.setImagenesExtras(imagenesExtrasPasatiempo);
		
		
		Articulo[] resultados = new Articulo[] {
				libro,
				libro2,
				pasatiempo,
				new Musica("Ironman 15 cm","Brian Michel", 1125f, "Sony", 
						new String[] { //Lista de temas
								"1-Shoot oto Thrill",
								"2-Shoot oto Thrill",
								"3-Shoot oto Thrill",
								"4-Shoot oto Thrill"
						}),
				new Pelicula("IronMan 3", 830f, "Warner", "Todo Publico") 
		};
		
		this.resultados = resultados;
		this.cantidadResultados = resultados.length;
		
	}
	
	//devuelve la clave de busqueda. Si no la hay devuelve un string vacio
	public String getClaveBusqueda() {
		//devuelve clave de busqueda. si es null devuelve un string vacio
		return this.claveBusqueda;	
	}
	
	public void setClaveBusqueda(String claveBuscada) {	
		this.claveBusqueda = claveBuscada.toUpperCase();
	}
	
	public Integer getCantidadResultados() {
		return this.resultados.length;//tamaño del vector
	}
	
	public Articulo[] getResultados() {
		return this.resultados;		
	}
	
	public boolean hayResultados() {
		return this.cantidadResultados > 0;
	}

}
