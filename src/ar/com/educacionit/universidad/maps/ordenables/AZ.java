package ar.com.educacionit.universidad.maps.ordenables;

import java.util.Comparator;

import ar.com.educacionit.universidad.oop.ecommerce.Resultado;

public class AZ implements Comparator<Resultado> {
	public int compare(Resultado o1, Resultado o2) {
		//o2.getFechaPublicacion() - o1.getFechaPublicacion()
		return o2.obtenerTitulo().compareTo(o1.obtenerTitulo());
	}
}