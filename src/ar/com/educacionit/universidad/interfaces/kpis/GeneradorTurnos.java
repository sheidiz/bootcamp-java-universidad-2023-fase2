package ar.com.educacionit.universidad.interfaces.kpis;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class GeneradorTurnos {

	public static Turno[] generar() {

		String dni;
		String tipoTramite;
		int sucursal;

		Scanner teclado = new Scanner(System.in);

		/*ArrayList<Turno> turnos
		turnos.add()		
		
		let turnos = [];
		turnos.push()
		*/
		ArrayList<Turno> turnos = new ArrayList<>();

		//cargar turnos mienstras no indique dni = 0
		System.out.println("Ingrese DNI");
		dni = teclado.next();
		while(!dni.trim().equals("0")) {

			System.out.println("Tipo de tramite");
			tipoTramite = teclado.next();

			System.out.println("Ingrese Sucursal");
			sucursal = teclado.nextInt();

			LocalDateTime now = LocalDateTime.now();//fecha de ahora!!!
			Turno turno = new Turno(dni, tipoTramite, now, sucursal);

			turnos.add(turno);

			System.out.println("Ingrese DNI");
			dni = teclado.next();
		}

		teclado.close();

		return turnos.toArray(new Turno[turnos.size()]);
	}
}