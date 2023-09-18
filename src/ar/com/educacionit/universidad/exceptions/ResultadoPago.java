package ar.com.educacionit.universidad.exceptions;

public class ResultadoPago {
	private boolean estado;
	private String descripcion;
	
	public ResultadoPago(boolean estado, String descripcion) {
		this.estado = estado;
		this.descripcion = descripcion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
