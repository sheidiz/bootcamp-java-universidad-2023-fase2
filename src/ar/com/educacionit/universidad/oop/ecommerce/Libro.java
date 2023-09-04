package ar.com.educacionit.universidad.oop.ecommerce;

public class Libro extends Resultado {
	private String editorial;
	private int nroPaginas;
	private String idioma;
	private String fechaPublicacion;
	public Libro(String titulo, String imagen, float precio, String autor, String editorial, int nroPaginas,
			String idioma, String fechaPublicacion) {
		super(titulo, imagen, precio, autor);
		this.editorial = editorial;
		this.nroPaginas = nroPaginas;
		this.idioma = idioma;
		this.fechaPublicacion = fechaPublicacion;
	}
	public String getEditorial() {
		return editorial;
	}
	public int getNroPaginas() {
		return nroPaginas;
	}
	public String getIdioma() {
		return idioma;
	}
	public String getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
}
