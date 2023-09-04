package ar.com.educacionit.universidad.oop.ecommerce;

public class Musica extends Resultado{
	private String selloDiscografico;
	private String formato;
	private String clasificacion;
	private String fechaPublicacion;
	private String[] listaDeTemas;
	
	public Musica(String titulo, String imagen, float precio, String autor, String selloDiscografico, String formato,
			String clasificacion, String fechaPublicacion, String[] listaDeTemas) {
		super(titulo, imagen, precio, autor);
		this.selloDiscografico = selloDiscografico;
		this.formato = formato;
		this.clasificacion = clasificacion;
		this.fechaPublicacion = fechaPublicacion;
		this.listaDeTemas = listaDeTemas;
	}

	public String getSelloDiscografico() {
		return selloDiscografico;
	}

	public String getFormato() {
		return formato;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public String[] getListaDeTemas() {
		return listaDeTemas;
	}
	
	
}
