package ar.com.educacionit.universidad.exceptions;

public enum MetodoPagoEnum {

	MERCADO_PAGO("MP",new MercadoPago()), 
	TARJETA_CREDITO("TC", new TarjetaCredito()), 
	TARJETA_DEBITO("TD", new TarjetaDebito()), 
	TRANSFERENCIA("TRA", new Transferencia())
	;

	private String key;
	private IMetodoPago valor;

	private MetodoPagoEnum(String key, IMetodoPago valor) {
		this.valor = valor;
	}

	public String getKey() {
		return key;
	}

	public IMetodoPago getValor() {
		return valor;
	}

}