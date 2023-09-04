package ar.com.educacionit.universidad.oop.ecommerce;

public class MainResultados {

	public static void main(String[] args) {

		Buscador buscador = new Buscador();// f5|f6

		String claveBuscadaPorElUsuario = "iron man";
		buscador.setClave(claveBuscadaPorElUsuario);
		buscador.buscar();// f5

		System.out.println(
				"Hemos Encontrado " + buscador.getCantidad() + " Resultados Para '" + buscador.getClave() + "'");
		// recorro los resultados

		Resultado[] res = buscador.obtenerResultados();
		for (Resultado resultado : res) {
			System.out.println(resultado);
		}
	}

}