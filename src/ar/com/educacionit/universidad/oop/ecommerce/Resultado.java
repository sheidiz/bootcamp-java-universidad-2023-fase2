package ar.com.educacionit.universidad.oop.ecommerce;

import java.time.LocalDate;

public class Resultado {

	protected String titulo;
	protected String imagen;
	protected Float precio;
	protected String autor;
	protected Integer cantidadVendidos;
	protected LocalDate fechaPublicacion;
	
	public Resultado(String titulo, String imagen, Float precio, String autor) 
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
	
	public Float getPrecio() {
		return this.precio;
	}
	
	public void actualizarPrecio(Float precio) {
		if(precio < 0) {
			this.precio = 0f;
		}else {
			this.precio = precio;
		}		
	}
	
	public String obtenerAutor() {
		return this.autor;
	}
	
	public Integer getCantidadVendidos() {
		return cantidadVendidos;
	}

	public void setCantidadVendidos(Integer cantidadVendidos) {
		this.cantidadVendidos = cantidadVendidos;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	@Override
	public String toString() {
		super.toString();
		return "{titulo=" + titulo + ", imagen=" + imagen + ", precio=" + precio + ", autor=" + autor + "}";
	}
	
}