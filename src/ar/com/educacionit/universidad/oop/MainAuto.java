package ar.com.educacionit.universidad.oop;

public class MainAuto {

	public static void main(String[] args) {

		//forma de crear un objeto en java
		//Clase nombreDelObjeto = new Clase();
		Auto clio = new Auto(
				"renault",
				"clio mio",
				2016,
				"rojo",
				"ab123ar");
		
		Auto astra = new Auto(
				"renault",
				"clio mio",
				2016,
				"rojo",
				"ab123ar");
		
		//al mostrar un objeto por consola
		//veo su direccion de memoria
		
		System.out.println(clio.toString());		
		System.out.println(astra);
		
		//como saber si son iguales?
		System.out.println("iguales: " + (astra == clio) );
	
		Auto copiaDeClio = clio;
		System.out.println("iguales: " + (copiaDeClio == clio) );
				
		//copiaDeClio.velocidad = 1.0f;
		copiaDeClio.acelerar(1);		
		System.out.println(clio.toString());
		System.out.println(copiaDeClio.toString());
	}

}