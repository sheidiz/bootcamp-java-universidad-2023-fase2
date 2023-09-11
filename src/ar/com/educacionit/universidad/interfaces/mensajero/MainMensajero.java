package ar.com.educacionit.universidad.interfaces.mensajero;

//APLICACION DE CONSOLA
//UN API REST
public class MainMensajero {

	// eso va bien en C,C++
	public static void main(String[] args) {
		String mensajeAEnviar = "Quiero comer pizza de jamon y morron";
		
		String origen= "origen bla";
		String destino = "destino bla";
		String path = "path bla";
		
		// validar mensaje!!!

		DB db = new DB();
		String tipo = db.getTipo();

		IMensaje mensajeria = MensjeriaBuilder.buildMensajeria(tipo);
		Mensaje mensaje = MensjeriaBuilder.buildMensaje(tipo,origen,destino,path,mensajeAEnviar);
		
		Mensajero mensajero = new Mensajero();
		mensajero.setMensajeria(mensajeria);
		mensajero.enviarMensaje(mensaje);
	}

}