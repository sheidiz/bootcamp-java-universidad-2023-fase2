package ar.com.educacionit.universidad.interfaces.mensajero;

public class MensajeriaBuilder {

	public static IMensaje buildMensajeria (String tipo) {
		
		if(tipo == null) {
			System.err.println("No se ha especificado tipo");
			return null;
		}
		
		IMensaje mensajeria;
		
		switch (tipo) {
			case "sms": 
				mensajeria = new SMS();
				break;
			case "filesystem": 
				mensajeria = new FileSystem(); 
				break;
			case "email": 
				mensajeria = new Email(); 
				break;
			default: 
				mensajeria = new Consola();
		}
		
		return mensajeria;
	}

	public static Mensaje buildMensaje(String tipo, String origen, String destino, String path, String mensajeAEnviar) {
		
		Mensaje mensaje;
		
		switch (tipo) {
			case "sms": 
				mensaje = new Network(path, destino, origen);
				break;
			case "filesystem": 
				mensaje = new FS(destino, path);//la mas especifica
				break;
			case "email": 
				mensaje = new Network(path, destino, origen);
				break;
			default: 
				mensaje = new Default();
		}
		
		mensaje.setContenido(mensajeAEnviar);
		
		return mensaje;
	}

}