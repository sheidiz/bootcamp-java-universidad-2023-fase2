package ar.com.educacionit.universidad.oop.ecommerce;

public class Pelicula extends Resultado {
	private String productora;
	private String clasificacion;
	private String formato;
	private String categoria;
	private String fechaPublicacion;
	
	public Pelicula(String titulo, String imagen, float precio, String autor, String productora, String clasificacion,
			String formato, String categoria, String fechaPublicacion) {
		super(titulo, imagen, precio, autor);
		this.productora = productora;
		this.clasificacion = clasificacion;
		this.formato = formato;
		this.categoria = categoria;
		this.fechaPublicacion = fechaPublicacion;
	}
	
	public String getProductora() {
		return productora;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public String getFormato() {
		return formato;
	}
	public String getCategoria() {
		return categoria;
	}
	public String getFechaPublicacion() {
		return fechaPublicacion;
	}
	
}
