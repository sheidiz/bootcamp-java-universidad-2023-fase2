package ar.com.educacionit.universidad.oop.polimorfismo;

public class MainPostres {
	
	public static void main(String[] args) {

		Flan f = new Flan();
		Gelatina g = new Gelatina();

		//aca casi se da el polimorfismo
		f.temblar();
		g.temblar();

	}
}
