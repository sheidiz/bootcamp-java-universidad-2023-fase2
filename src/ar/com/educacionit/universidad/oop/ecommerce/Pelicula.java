package ar.com.educacionit.universidad.oop.ecommerce;

public class Pelicula extends Resultado{

	private String productora;
	private String formato;

	public Pelicula(String titulo, 
			String imagen, 
			float precio, 
			String autor,
			String productora,
			String formato) {
		super(titulo, imagen, precio, autor);

		this.productora = productora;
		this.formato = formato;
	}

	public String getProductora() {
		return productora;
	}

	public String getFormato() {
		return formato;
	}

	@Override
	public String toString() {
		return super.toString() + 
		"Pelicula [productora=" + productora + ", formato=" + formato + "]";
	}

}