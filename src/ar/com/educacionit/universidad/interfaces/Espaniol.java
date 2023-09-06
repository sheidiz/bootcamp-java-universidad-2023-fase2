package ar.com.educacionit.universidad.interfaces;

public class Espaniol extends IdiomaBase implements IIDioma{

	public Espaniol() {
		super("Español");
	}

	@Override
	public void decir(String algo) {
		System.out.println("Decir:" + algo);
	}

}