package ar.com.educacionit.universidad.exceptions;

import java.util.Scanner;

public class EnumMain {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Seleccione metodo de pago"
				+ "MP -> MERCADO PAGO"
				+ "TC -> TARJETA DE CREDITO"
				+ "TD -> TARJETA DE DEBITO"
				+ "TRA -> TRANSFERENCIA");

		String metodoDesdeFrontend = teclado.next();

		MetodoPagoEnum elEnum =  getMetodoEnum(metodoDesdeFrontend);
		IMetodoPago metodoDePagoImpl =  elEnum.getValor();

		teclado.close();
		System.out.println(metodoDePagoImpl);
	}

	public static MetodoPagoEnum getMetodoEnum (String metodoDelFronted) {
		if(metodoDelFronted == null) {
			throw new IllegalArgumentException(metodoDelFronted + " no es valido");
		}

		MetodoPagoEnum metodoEnum = null;
		switch(metodoDelFronted) {
			case "MP":
				metodoEnum = MetodoPagoEnum.MERCADO_PAGO; break;
			case "TC":
				metodoEnum = MetodoPagoEnum.TARJETA_CREDITO; break;
			case "TD":
				metodoEnum = MetodoPagoEnum.TARJETA_DEBITO; break;
			case "TRA":
				metodoEnum = MetodoPagoEnum.TRANSFERENCIA;
		}

		if(metodoEnum == null) {
			throw new IllegalArgumentException(metodoDelFronted + " no es valido");
		}

		return metodoEnum;
	}

	public static IMetodoPago getMetodo(MetodoPagoEnum _metodoEnum) {
		// null y MERCADO_PAGO, TARJETA_CREDITO, TARJETA_DEBITO, TRANSFERENCIA
		if(_metodoEnum == null) {
			throw new IllegalArgumentException("MetodoEnum no es valido");
		}

		return _metodoEnum.getValor();
	}
}