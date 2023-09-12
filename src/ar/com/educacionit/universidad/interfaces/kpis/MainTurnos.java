package ar.com.educacionit.universidad.interfaces.kpis;

import java.util.Scanner;

public class MainTurnos {

	public static void main(String[] args) {

		Turno[] turnos = GeneradorTurnos.generar();

		IKpi[] kpis = GeneradorKPIs.buildKpis();

		Scanner teclado = new Scanner(System.in);

		for (var turno : turnos) {

			System.out.println("Gestionar turno!");

			int opcion;
			do {
				System.out.println("1- Atender");
				System.out.println("2- Finalizar Turno");
				System.out.println("3- Derivar");
				opcion = teclado.nextInt();

				IGestiones gestor;
				switch (opcion) {
				case 1:
					gestor = new AtenderTurno();
					break;
				case 2:
					gestor = new FinalizarTurno();
					break;
				case 3:
					gestor = new DerivarTurno();
					break;
				default:
					gestor = null;
					break;
				}
				((GestionBase)gestor).setTurno(turno);
				gestor.gestionar();
			}while(opcion <1 || opcion > 3  );			
		}

		teclado.close();
		for(var kpi : kpis) {
			Result res = kpi.execute(turnos);
			System.out.println(res.getText()  + " - " + res.getValue());
		}
	}

}