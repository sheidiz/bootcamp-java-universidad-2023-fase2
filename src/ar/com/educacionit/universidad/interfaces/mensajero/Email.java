package ar.com.educacionit.universidad.interfaces.mensajero;

public class Email implements IMensaje {

	@Override
	public void enviar(Mensaje msj) {
		System.out.println("Enviando email:" + msj);
	}

}