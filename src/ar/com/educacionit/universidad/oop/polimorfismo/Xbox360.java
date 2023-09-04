package ar.com.educacionit.universidad.oop.polimorfismo;

public final class Xbox360 extends Consola {
	
	private boolean tieneConexionAInternet;
	private int memoria;
	private boolean digital;
	private DiscoExterno discoExterno;
	
	//la play debe tener su constructor
	//debe llamar al del padre
	public Xbox360(String serie, 
			String color, 
			boolean tieneConexion, 
			int memoria, 
			boolean digital) {
		//super: hace referencia al padre
		//super(): invocar al constructor de ese padre
		super(serie,"Microsoft","Xbox360 ",color);
		
		//seteo de atributos propios
		this.tieneConexionAInternet = tieneConexion;
		this.digital = digital;
	}

	public DiscoExterno getDiscoExterno() {
		return discoExterno;
	}

	public void setDiscoExterno(DiscoExterno discoExterno) {
		this.discoExterno = discoExterno;
	}

	public boolean isTieneConexionAInternet() {
		return tieneConexionAInternet;
	}



	public int getMemoria() {
		return memoria;
	}

	public boolean isDigital() {
		return digital;
	}


}
