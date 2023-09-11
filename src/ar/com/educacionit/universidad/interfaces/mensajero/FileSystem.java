package ar.com.educacionit.universidad.interfaces.mensajero;

public class FileSystem implements IMensaje {

	@Override
	public void enviar(Mensaje msj) {
		Storage storageDentoDelMsj = ((Storage)msj);
		FS fileSystemDentroDelStorage = (FS)storageDentoDelMsj;
		
		//¿garantiza que no haya error dentro?
		
		System.out.println("grabando mensaje en disco:" + storageDentoDelMsj.getContenido() + ""
				+ fileSystemDentroDelStorage.getPath());
	}

}