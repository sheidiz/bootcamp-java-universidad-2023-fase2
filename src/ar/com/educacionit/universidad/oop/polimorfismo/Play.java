package ar.com.educacionit.universidad.oop.polimorfismo;

public class Play extends Consola {

	private boolean tieneConexionAInternet;
	private int memoria;
	private boolean digital;
	private int version;//1 - 5
	private DiscoExterno discoExterno;//null

	//la Play debe tener su constructor
	//debe llamar al del padre 
	public Play(String serie, 
			String color, 
			int version, 
			boolean tieneConexion,
			int memoria,
			boolean digital
			) {

		//super: hace referencia al padre
		//super(): invocar al constructor de ese padre
		super(serie,"Sony","Play "+version, color);

		//seteo de atributos propios
		this.version = version;
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

	public int getVersion() {
		return version;
	}

	@Override
	public void play() {
		System.out.println("Juando con la Play");
	}

}