package ar.com.educacionit.universidad.interfaces.mensajero;

public abstract class Mensaje {
	//	clase que no se puede instanciar
	//Mensaje m = new Mensaje();
	
	//pero puedo crear / instanciar sub-clases/sub-tipos
	//Mensaje m = new SubTipoDeMensaje();
	
	protected String contenido;

//	public Mensaje(String contenido) {
//		this.contenido = contenido;
//	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String mensajeAEnviar) {
		this.contenido = mensajeAEnviar;		
	}
	
}