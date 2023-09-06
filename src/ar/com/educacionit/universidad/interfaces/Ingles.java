package ar.com.educacionit.universidad.interfaces;

public class Ingles implements IIDioma {

	@Override
	public void decir(String algo) {
		System.out.println("Saying:" + algo);
	}

}