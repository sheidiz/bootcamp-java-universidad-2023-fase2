package ar.com.educacionit.universidad.interfaces.mensajero;

public class Consola implements IMensaje {

	@Override
	public void enviar(Mensaje msj) {
		System.out.println("Default:" + msj);
	}

}