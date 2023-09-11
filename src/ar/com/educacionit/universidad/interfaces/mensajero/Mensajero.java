package ar.com.educacionit.universidad.interfaces.mensajero;

public class Mensajero {

	private IMensaje mensajeria;//null

	/*
	//composicion
	public Mensajero(IMensaje mensajeria) {
		this.mensajeria = mensajeria;
	}
	*/
	
	//agregacion
	public void enviarMensaje(Mensaje msj) {
		if(mensajeria == null) {
			System.err.println("No hay mensajeria disponible!");
		}
		this.mensajeria.enviar(msj);
	}
	
	//agregacion
	public void setMensajeria(IMensaje mensajeria) {
		this.mensajeria = mensajeria;
	}
}