package ar.com.educacionit.universidad.oop;

public class Auto {

	/*atributos*/
	String marca;
	String modelo;
	int anio;
	String color;
	String patente;
	float velocidad;
	
	/* Contructor: 
	 * lo primero que se ejecuta
	 * cuando nace un auto
	 */
	public Auto(
			String marca, 
			String modelo, 
			int anio, 
			String color, 
			String patente) {
		//this hace referencia a todo lo que tiene la clase
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.color = color;
		this.patente = patente;
		//cuando nace un auto, su velocidad es 0
		this.velocidad = 0;
	}
	
	//alt+shit+s
	
	/*metodos*/
	void acelerar() {
		
	}
	
	void frenar() {
		
	}
	void encender() {
		
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", color=" + color + ", patente="
				+ patente + ", velocidad=" + velocidad + "]";
	}
	
	//cambiar el coportamiento por defecto de
	//el metodo toString()
	
}