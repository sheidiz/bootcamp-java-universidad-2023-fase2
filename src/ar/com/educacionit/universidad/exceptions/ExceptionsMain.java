package ar.com.educacionit.universidad.exceptions;

public class ExceptionsMain {

	public static void main(String[] args) {

		int val1 = 10;

		int val2 = 0;

		try {
			int res = dividir(val1,val2);

			System.out.println(res);
		}catch(Exception e) {
			//logica de control!
			e.printStackTrace();
		}

		//runtime exception = unchecked exceptions

		//java.lang.ArithmeticException:
	}

	public static int dividir(int a, int b) throws Exception{
		if(b == 0) {
			throw new Exception("No se puede divir por 0"); 
		}

		int res = a / b;

		return res;
	}

}