package ar.com.educacionit.universidad.interfaces.kpis;

public class Atendidos implements IKpi {

	@Override
	public Result execute(Turno[] turnos) {
		// sheila
		int atendidos = 0;
		for (var turno : turnos) {
			if (turno.getFechaAtencion() != null) {
				atendidos++;
			}
		}
		return new Result("Atendidos", atendidos);
	}

}