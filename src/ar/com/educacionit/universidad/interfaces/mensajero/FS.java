package ar.com.educacionit.universidad.interfaces.mensajero;

public class FS extends Storage {

	private String path;
	
	public FS(String contenido,String path) {
		super(contenido);
		this.path = path;
	}

	public String getPath() {
		return path;
	}
	
//	private void setPath(String path) {
//		this.path = path;
//	}
	
}