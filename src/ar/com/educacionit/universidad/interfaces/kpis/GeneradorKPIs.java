package ar.com.educacionit.universidad.interfaces.kpis;

public class GeneradorKPIs {

	public static IKpi[] buildKpis() {
		IKpi[] kpis = new IKpi[] { 
				new CantidadTotal(), 
				new Atendidos(), 
				new PorcentajeAtendidos(),
				new PorcentajeAbandonados() 
			};
		return kpis;
	}
}

