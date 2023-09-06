package ar.com.educacionit.universidad.interfaces;

public class MainInterfaces {

	public static void main(String[] args) {

		IIDioma idioma = new Ingles();

		var persona = new Persona("carlos", idioma);

		String palabra = "hola";

		persona.decir(palabra);

		//persona.decir(palabra);

		persona.decir(palabra, new Espaniol());

		//aprende un nuevo idioma
		idioma = new Espaniol();

		persona.aprender(idioma);

		persona.decir(palabra, new Espaniol());
	}

}