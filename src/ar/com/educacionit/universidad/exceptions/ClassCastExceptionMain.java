package ar.com.educacionit.universidad.exceptions;

public class ClassCastExceptionMain {

	public static void main(String[] args) {

		String a = "hola";

		Object o = true;

		//error en tiempo de compilacion
		a = (String)o;

		System.out.println(a);
	}

}