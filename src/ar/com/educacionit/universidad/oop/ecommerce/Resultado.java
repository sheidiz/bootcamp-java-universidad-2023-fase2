package ar.com.educacionit.universidad.oop.ecommerce;

public class Resultado {

	protected String titulo;
	protected String imagen;
	protected float precio;
	protected String autor;
	
	public Resultado(String titulo, String imagen, float precio, String autor) 
	{
		this.titulo = titulo;
		this.imagen = imagen;
		this.precio = precio;
		this.autor = autor;
	}

	public String obtenerImagen() {
		//ya estoy dentro de la clase
		return this.imagen;
	}
	
	public void actualizarImagen(String imagen) {
		//aca aprovecho el encapsulamiento....
		if(imagen == null) {
			this.imagen = "http://sitio.com.ar/img.jpg";
		}else {
			this.imagen = imagen;
		}
	}
	
	public String obtenerTitulo() {
		return this.titulo;
	}
	
	public float obtenerPrecio() {
		return this.precio;
	}
	
	public void actualizarPrecio(float precio) {
		if(precio < 0) {
			this.precio = 0;
		}else {
			this.precio = precio;
		}		
	}
	
	public String obtenerAutor() {
		return this.autor;
	}

	@Override
	public String toString() {
		super.toString();
		return "{titulo=" + titulo + ", imagen=" + imagen + ", precio=" + precio + ", autor=" + autor + "}";
	}
	
}