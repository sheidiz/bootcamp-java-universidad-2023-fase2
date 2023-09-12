package ar.com.educacionit.universidad.interfaces.servicio;

public class DBQuery implements IQuery {

	@Override
	public User find() {
		System.out.println("Consultando base de datos de usuarios...");

		var user = new User();

		return null;
	}

}