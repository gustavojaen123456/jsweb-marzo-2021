package ar.com.educacionit.clase3;

public class BuscadorMain {

	public static void main(String[] args) {
		
		//Instancio un buscador
		Buscador miBuscador = new Buscador();
		
		miBuscador.setClaveBusqueda("iron man");
		
		//ejecutar el metodo buscar
		miBuscador.buscar();
		
		System.out.println("Hemos encontrado "+miBuscador.getCantidadResultados()+" resultados para '"+miBuscador.getClaveBusqueda()+"'");
		
		if(miBuscador.hayResultados()){
			Articulo[] articulos = miBuscador.getResultados();
			
			//recorrer los articulos con un foreach
			//y presentarlos en consola
			/* dentro del for(posicion del articulo : array)*/
			for(Articulo articulo : articulos) {
				articulo.display();
				System.err.println("******************");
			}
		}
			
	}
		

}
