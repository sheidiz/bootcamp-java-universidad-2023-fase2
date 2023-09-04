package ar.com.educacionit.universidad.ciclos;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {

		// ingresar la cantidad de pedidos y su valor
		// calcular el promedio de los pedidos

		Scanner teclado = new Scanner(System.in);// leer desde teclado
		System.out.println("Ingrese la cantidad de pedidos");

		int cantidadPedidos = teclado.nextInt();// enteros
		/*
		 * 1 > 100 2 > 200 3 > 400 ------ promedio = 100+200+400/ 3
		 */

		System.out.println(cantidadPedidos);
		float total = 0;

		for (int i = 0; i < cantidadPedidos; i++) {
			System.out.println("Ingrese el costo del pedido: " + (i+1) );
			total += teclado.nextFloat();// $175.5
		}
		
		//cierro el teclado!!!
		teclado.close();
		
		float promedio = total / cantidadPedidos;
		System.out.println("El promedio del costo de los pedidos es:" + promedio);
	}

}