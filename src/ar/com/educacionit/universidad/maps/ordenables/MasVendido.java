package ar.com.educacionit.universidad.maps.ordenables;

import java.util.Comparator;

import ar.com.educacionit.universidad.oop.ecommerce.Resultado;

public class MasVendido implements Comparator<Resultado> {
	public int compare(Resultado o1, Resultado o2) {
		return o1.getCantidadVendidos().compareTo(o2.getCantidadVendidos());
	}
}