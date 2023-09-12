package ar.com.educacionit.universidad.interfaces.kpis;

public class CantidadTotal implements IKpi{

	@Override
	public Result execute(Turno[] turnos) {
		return new Result("Cantidad Total", turnos.length);
	}
}