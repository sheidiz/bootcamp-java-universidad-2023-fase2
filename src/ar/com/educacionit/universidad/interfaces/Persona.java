package ar.com.educacionit.universidad.interfaces;

import java.util.Arrays;

public class Persona {

	private String nombre;
	private IIDioma idiomaNativo;
	private IIDioma[] otrosIdiomas;

	public Persona(String nombre, IIDioma idiomaNativo) {
		setNombre(nombre);
		setIdiomaNativo(idiomaNativo);	
		setOtrosIdiomas(new IIDioma[0]);
	}

	//alt+shist+s
	public void setNombre(String nombre) {
		if(nombre == null) {
			System.err.println("Debe tener un nombre");
		}
		this.nombre = nombre;
	}

	public void setIdiomaNativo(IIDioma idiomaNativo) {
		if(idiomaNativo == null) {
			System.err.println("Debe hablar un idioma");
		}
		this.idiomaNativo = idiomaNativo;
	}

	public void setOtrosIdiomas(IIDioma[] idiomas) {
		this.otrosIdiomas = idiomas;
	}

	public String getNombre() {
		return nombre;
	}

	public IIDioma getIdiomaNativo() {
		return idiomaNativo;
	}

	public IIDioma[] getOtrosIdiomas() {
		return otrosIdiomas;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", idiomaNativo=" + idiomaNativo + ", otrosIdiomas="
				+ Arrays.toString(otrosIdiomas) + "]";
	}

	public void decir(String palabra) {
		this.idiomaNativo.decir(palabra);
	}

	public void decir(String palabra,IIDioma idioma) {
		if(idioma == null || !sabeHablaIdioma(idioma) ) {
			if(idioma instanceof IdiomaBase aux)
				System.err.println(this.nombre +  " No sabe hablar... en " + aux.getDescripcion());
			else
				System.err.println(this.nombre +  " No sabe hablar... en " + idioma.getClass().getSimpleName());
			return;
		}
		idioma.decir(palabra);
	}

	public boolean sabeHablaIdioma(IIDioma idioma) {
		if(this.idiomaNativo.getClass().isAssignableFrom(idioma.getClass())) return true;

		boolean habla = false;
		for(int i=0; !habla && i < this.otrosIdiomas.length;i++) { 	
			habla = this.otrosIdiomas[i].getClass().isAssignableFrom(idioma.getClass());
		}

		return habla;
	}

	public void aprender(IIDioma idioma) {
		if(idioma == null) {
			System.err.println("Idioma nulo");
			return;
		}

		if(this.idiomaNativo.getClass().isAssignableFrom(idioma.getClass())) {
			System.out.println("Ya habla " + idioma.getClass());
			return;
		}

		for(IIDioma aux : this.otrosIdiomas) {			
			if(aux.getClass().isAssignableFrom(idioma.getClass())) {
				System.out.println("Ya habla " + idioma.getClass());
				return;
			}
		}

		IIDioma[] aux = new IIDioma[this.otrosIdiomas.length + 1];
		for (int i = 0; i < this.otrosIdiomas.length ; i++) {
			aux[i] = this.otrosIdiomas[i];
		}
		aux[this.otrosIdiomas.length] = idioma;
		this.setOtrosIdiomas(aux);
	}

}