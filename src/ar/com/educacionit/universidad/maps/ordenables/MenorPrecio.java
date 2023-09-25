package ar.com.educacionit.universidad.maps.ordenables;

import java.util.Comparator;

import ar.com.educacionit.universidad.oop.ecommerce.Resultado;

public class MenorPrecio implements Comparator<Resultado> {

	@Override
	public int compare(Resultado o1, Resultado o2) {
		return o1.getPrecio().compareTo(o2.getPrecio());
	}

}