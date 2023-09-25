package ar.com.educacionit.universidad.maps.ordenables;

import java.util.Comparator;

import ar.com.educacionit.universidad.oop.ecommerce.Resultado;

public class MayorPrecio implements Comparator<Resultado> {

	@Override
	public int compare(Resultado o1, Resultado o2) {
		return o2.getPrecio().compareTo(o1.getPrecio());
	}

}