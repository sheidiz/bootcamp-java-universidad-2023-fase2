package ar.com.educacionit.universidad.maps.ordenables;

import java.util.Comparator;

import ar.com.educacionit.universidad.oop.ecommerce.Resultado;

public class MasRecientes implements Comparator<Resultado> {
	public int compare(Resultado o1, Resultado o2) {
		//o2.getFechaPublicacion() - o1.getFechaPublicacion()
		return o2.getFechaPublicacion().compareTo(o1.getFechaPublicacion());
	}
}