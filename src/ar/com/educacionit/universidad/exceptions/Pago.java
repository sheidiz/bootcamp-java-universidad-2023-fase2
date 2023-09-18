package ar.com.educacionit.universidad.exceptions;

import java.time.LocalDate;

public class Pago {
	private double monto;
	private LocalDate fechaPago;
	private String nroTrx;
	private String vendedor; 
	private String comprador;

	public Pago(double monto, LocalDate fechaPago, String nroTrx, String vendedor, String comprador) {
		this.monto = monto;
		this.fechaPago = fechaPago;
		this.nroTrx = nroTrx;
		this.vendedor = vendedor;
		this.comprador = comprador;
	}

	public double getMonto() {
		return monto;
	}

	public LocalDate getFechaPago() {
		return fechaPago;
	}

	public String getNroTrx() {
		return nroTrx;
	}

	public String getVendedor() {
		return vendedor;
	}

	public String getComprador() {
		return comprador;
	}

}