package ar.com.educacionit.universidad.oop.ecommerce;

public class Buscador {

	private String clave;
	private Resultado[] resultados;
	
	public Buscador() {
		//asi nace el buscador
		this.resultados = new Resultado[0];//f6|f8
		this.clave = "";//f6
	}//f7|f6|f5
	
	/*public Buscador(String clave, Resultado[] resultados) {
		
	}*/
	
	public void buscar() {
		
		//guard
		if(claveVacia()) {//f5
			System.out.println("no ingreso clave de busqueda");
			return;
		}
			
		//aca se llama metodo actualizarResultados(lista)
		//simular que la consulta encuentra 3 resultados
		//creando 3 objetos de la clase resultados
		Resultado res1 = new Libro("MARVEL STUDIOS EL DICCION...", "https:bla.com.ar/img1.jpg", 13973.25f, "BRAY, ADAM", "123456789",199,"sinopsis 123");
		Resultado res2 = new Musica("NUNCA CORRI SIEMPRE COBRE", "https:bla.com.ar/img2.jpg", 6999, "OYOLA, LEONARDO A.", "sello discografico", new String[] {"tema1","tema2"});
		Resultado res3 = new Pelicula("MARVEL: GUIA DE PERSONAJES I R", "https:bla.com.ar/img3.jpg", 9490, "CATAPULTA, LOS EDITORES DE","WARNER","BLUE RAY");
		//agregar los resultados al array resultados
		this.agregarResultado(res1);//f5
		this.agregarResultado(res2);
		this.agregarResultado(res3);
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getClave() {
		return this.clave;
	}
	
	private boolean claveVacia() {
		return "".equals(this.clave.trim());//ctrl+shift+i|f6
	}
	
	public void agregarResultado(Resultado res) {
		var aux = new Resultado[this.resultados.length + 1];
		
		for(int i=0;i<this.resultados.length;i++) {
			aux[i] = this.resultados[i];
		}
		aux[this.resultados.length] = res;
		
		setResultados(aux);
	}
	
	private void setResultados(Resultado[] res) {
		this.resultados = res;
	}
	
	public Resultado[] obtenerResultados() {
		return this.resultados;
	}
	
	private void actualizarResultados(Resultado[] res)  {
		if(res == null) {
			this.resultados = new Resultado[0];
		}else {
			this.resultados = res;
		}
	}
	
	public int getCantidad() {
		return this.resultados.length;
	}
}