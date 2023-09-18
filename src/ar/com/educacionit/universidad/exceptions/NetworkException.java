package ar.com.educacionit.universidad.exceptions;

//nuestra primera exception=CheckedException

public class NetworkException extends Exception {

	private static final long serialVersionUID = -1003237484212756669L;

	//atributos propios
	private String estado;

	public NetworkException(String msj) {
		super(msj);
	}

	public void setEstado(String estado) {
		if(estado == null || "".equals(estado)) {
			this.estado = "N/A";	
		}else {
			this.estado = estado;
		}
	}

	public String getEstado() {
		return estado;
	}

}