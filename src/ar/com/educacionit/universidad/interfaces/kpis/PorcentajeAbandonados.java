package ar.com.educacionit.universidad.interfaces.kpis;

public class PorcentajeAbandonados implements IKpi {
	public Result execute(Turno[] turnos) {
		int abandonados = 0;
		for (var iKpi : turnos) {
			abandonados += iKpi.getFechaAbandono() != null ? 1 : 0;
		}
		return new Result("Abandonados", abandonados);
	}
}
