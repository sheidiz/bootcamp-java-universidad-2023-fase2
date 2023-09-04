package ar.com.educacionit.universidad.oop.polimorfismo;

public class MainConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Play play1 = new Play("1324","gris",1,false,32,false);
		Play play2 = new Play("13245","negro",1,false,32,false);
		Play play5 = new Play("132456","blanco",1,true,64,true);
		
		Xbox360 xbox360 = new Xbox360("223456","negro",true,500,true);
		
		//ahora puedo invocar los metodos play de cada consola
		//play1.play();
		//play2.play();
		//play5.play();
		
		xbox360.play();
		Consola[] consolas = new Consola[] {play1,play2,play5,xbox360};
		for(Consola o : consolas) {
			//si justo aca quiero saber si es play o xbox
			//if(o instanceof Play p){
			if(o.getClass().isAssignableFrom(Play.class))
		}
		}
	}

}
