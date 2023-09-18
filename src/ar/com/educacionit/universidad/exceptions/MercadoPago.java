package ar.com.educacionit.universidad.exceptions;

public class MercadoPago implements IMetodoPago, IConfigurable {

	private String urlMp;
	private String user;
	private String password; 

	public MercadoPago() {
	}

	public MercadoPago(String urlMp, String user, String password) {
		this.urlMp = urlMp;
		this.user = user;
		this.password = password;
	}

	public ResultadoPago pagar(Pago pago) throws NetworkException, SinSaldoException, TimeOutException {

		System.out.println("Conectando a mercado pago..." + urlMp);
		System.out.println("Usuario:" + user);

		System.out.println("realizando pago...");

		if(pago.getMonto() > 10 && pago.getMonto() < 20) {
			throw new TimeOutException();
		}

		if(pago.getMonto() > 20 && pago.getMonto() < 40) {
			throw new SinSaldoException();
		}

		if(pago.getMonto() > 40 && pago.getMonto() < 50) {
			throw new NetworkException("Error al consultar el servidor de MP");
		}

		System.out.println("conexion ok...");
		System.out.println("pago realizado...");

		return new ResultadoPago(true, "PAGO_EXITOSO");
	}

	@Override
	public void configurar(String... args) {
		if(args.length ==0 || args.length > 3) {
			throw new IllegalArgumentException("Argumentos invalidos");
		}
		this.user = args[0];
		this.password = args[1];
		this.urlMp = args[2];
	}
}