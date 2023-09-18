package ar.com.educacionit.universidad.exceptions;

public interface IMetodoPago {
	public ResultadoPago pagar(Pago pago) throws NetworkException,SinSaldoException, TimeOutException;
}
