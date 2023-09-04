package ar.com.educacionit.universidad.oop.polimorfismo;

//inmutable, nace con dos atributos y no se modifica mas
public class DiscoExterno {
	private String nombre;
	private int capacidad;
	
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

	@Override
	public String toString() {
		return "DiscoExterno [nombre=" + nombre + ", capacidad=" + capacidad + "]";
	}
	
}
