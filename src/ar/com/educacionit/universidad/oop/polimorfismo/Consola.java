package ar.com.educacionit.universidad.oop.polimorfismo;

public class Consola {
	protected String serie;
	public String fabricante;
	protected String nombre;
	protected String color;
	
	
	public Consola(String serie, String fabricante, String nombre, String color) {
		super();
		this.serie = serie;
		this.fabricante = fabricante;
		this.nombre = nombre;
		this.color = color;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void play() {
		System.out.println("Jugando con la consola");
	}
	
}
