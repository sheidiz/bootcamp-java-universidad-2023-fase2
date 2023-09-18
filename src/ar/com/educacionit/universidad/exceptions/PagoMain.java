package ar.com.educacionit.universidad.exceptions;

import java.time.LocalDate;

public class PagoMain {

	public static void main(String[] args) {

		double montoAPagar = 15;
		String metodoDePagoSel = "MP";

		IMetodoPago metodoDePago = EnumMain.getMetodoEnum(metodoDePagoSel).getValor();

		if(metodoDePago instanceof MercadoPago mp) {
			((IConfigurable)metodoDePago).configurar(new String[]{"user", "password", "http://mercadopago.com.ar"});
		}

		//cuando quiera pagar pueden pasar varias cosas
		//1) se corta la conexion => NetworkException
		//2) no tiene saldo => SinSaldoException
		//3) Timeout => TimeoutException

		int reintentos = 3;
		ResultadoPago resultado = null;
		Pago pago = new Pago(montoAPagar, LocalDate.now(), ""+Math.random(), "vendedor","comprador"); 
		do {
			try {
				resultado = metodoDePago.pagar(pago);// OK
				//aca!!! se ejecuta => porque se pago correctamente!
			} catch (NetworkException | SinSaldoException e) {
				e.printStackTrace();
			} catch(TimeOutException te) {
				reintentos--;
			} /*finally {
				System.out.println("Se ejecuta siempre!! ya sea por try o catch");
			}*/
		}while(resultado ==null && reintentos > 0);

		//listo ya pago!!!
		System.out.println(resultado);
	}
}