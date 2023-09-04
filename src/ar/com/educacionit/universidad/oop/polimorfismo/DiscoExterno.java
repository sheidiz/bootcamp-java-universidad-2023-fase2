package ar.com.educacionit.universidad.oop.polimorfismo;

public class DiscoExterno {

	private String nombre;
	private int capacidad;//

	public DiscoExterno(String nombre, int capacidad) {
		this.nombre = nombre;
		this.capacidad = capacidad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	//polimorfismo
	public String toString() {
		return "DiscoExterno [nombre=" + nombre + ", capacidad=" + capacidad + "]";
	}

}