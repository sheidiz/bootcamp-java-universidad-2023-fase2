package ar.com.educacionit.universidad.interfaces.mensajero;

public class SMS implements IMensaje {

	//aca puedo tener la cantidad de atributos que necesite
	private String numeroDestino;
	private String numeroOrigen;
	
	
	
	@Override
	public void enviar(Mensaje msj) {
		System.out.println("Enviando mensaje de texto:" + msj);
	}

}