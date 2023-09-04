package ar.com.educacionit.universidad.ciclos;

import java.util.Arrays;

public class Ciclos {

	public static void main(String[] args) {
		//for( ; ; )
		for(int i=0; i<10;i++) {// 0 9
			// System.out.println(i);
		}
		
		//while (cilo infinito)
		int i=0;
		while (i<10) {
			//System.out.println(i);
			i++;
		}
		
		//do-while
		var j=0;
		do {
			System.out.println(j++); 
		}while(j<10);
		
		//arrays
		int[] edades = {0,2,4,5,6,9};//1 forma: cargo los valores
		int[] edades2 = new int[6];//  2 defino solo el tamaño
		//edades.push();//no existe esto en java
		 
		for(int v : edades ) {//no necesitamos el indice
			//copiar dentro de segundo array
			System.out.println(v);
		}
		
		for(i=0;i<edades2.length;i++) {
			edades2[i] = edades[i];
		}
		
		// Arrays.copyOf(edades2, 0); investigar los metodos de array!!!
				
	}
}