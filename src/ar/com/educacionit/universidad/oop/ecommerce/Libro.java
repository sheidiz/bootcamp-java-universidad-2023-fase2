package ar.com.educacionit.universidad.oop.ecommerce;

public class Libro extends Resultado {

	private String isbn;
	private int numeroPaginas;
	private String sinopsis;

	public Libro(String titulo, String imagen, float precio, String autor, 
			String isbn, int numeroPaginas,String sinopsis) {
		super(titulo, imagen, precio, autor);
		this.isbn = isbn;
		this.numeroPaginas = numeroPaginas;
		this.sinopsis = sinopsis;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	@Override
	public String toString() {
		return super.toString() + 
		"Libro [isbn=" + isbn + ", numeroPaginas=" + numeroPaginas + ", sinopsis=" + sinopsis + "]";
	}

}