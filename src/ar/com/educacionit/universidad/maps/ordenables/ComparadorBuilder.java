package ar.com.educacionit.universidad.maps.ordenables;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import ar.com.educacionit.universidad.oop.ecommerce.Resultado;

public class ComparadorBuilder {

	//lo estatic se ejecuta antes que el constructor!
	private static Map<ComparadorEnum,Comparator<Resultado>> map;

	static {
		map = new HashMap<>();
		map.put(ComparadorEnum.MAS_RECIENTES, new MasRecientes());
		map.put(ComparadorEnum.MAS_VENDIDOS, new MasVendido());
		map.put(ComparadorEnum.MENOR_PRECIO, new MenorPrecio());
		map.put(ComparadorEnum.MAYOR_PRECIO, new MayorPrecio());
		//aca van los otros 
	}

	public final static Comparator<Resultado> getComparador(String key) {
		ComparadorEnum keyEnum = ComparadorEnum.valueOf(key);
		return getComparador(keyEnum);
	}

	public final static Comparator<Resultado> getComparador(ComparadorEnum key) {
		//guard
		if(!map.containsKey(key)) {
			throw new IllegalArgumentException("NO existe Comparador para"  + key);
		}

		return map.get(key);
	}

}