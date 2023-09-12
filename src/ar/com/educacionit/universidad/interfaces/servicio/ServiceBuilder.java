package ar.com.educacionit.universidad.interfaces.servicio;

public class ServiceBuilder {

	/*ENUMS...*/
	public static IQuery buildService(String ws) {
		if(ws == null) {
			System.err.println("Error no definio ws");
		}

		IQuery query;

		switch (ws) {
			case "1": {			
				query = new DBQuery();
				break;
			}
			case "2": {			
				query = new RestQuery();
				break;
			}
			case "3": {			
				query = new FileQuery();
				break;
			}
		default:
			query = null;
		}

		return query;
	}

}