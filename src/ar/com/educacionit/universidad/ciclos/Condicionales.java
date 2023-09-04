package ar.com.educacionit.universidad.ciclos;

public class Condicionales {

	public static void main(String[] args) {
		boolean llueve = true;
		if(llueve) { //llueve == true
			System.out.println("llueve");
		}else {
			System.out.println("no llueve");
		}
		
		//if/elseif..../else
		int edad = 18;
		if(edad == 18) {
			System.out.println("18");			
		}else if(edad ==35) {
			System.out.println("35");
		}else if(llueve) {
			System.out.println("llueve");
		}else if(edad > 36 && edad <= 37) {
			System.out.println("> 36 <=37");
		}else {
			System.out.println("Ninguna");
		}
		
		//switch
		int nota = 6;
		switch (nota) {
			case 4: {
				System.out.println("A");
				break;
			}
			case 9:
			case 10: {
				System.out.println("18");
				break;
			}
			default: {
				System.out.println("default");
			}				
		}
		
		String aprobado = (nota >=7) ? "aprobado" : "reprobado";
		System.out.println(aprobado);
		
	}
}