package ar.com.educacionit.universidad.interfaces.servicio;

public class Service {
	public static void main(String[] args) {
		
		String ws = "1";
		
		//crear el servicio de consulta
		IQuery query = ServiceBuilder.buildService(ws);
		
		//obtener el dto = User
		User user = query.find();
		
		//retornar al cliente la data
		System.out.println(user);
		
		//fin
	}
}
