import java.io.Serializable;

public class Alumno implements Serializable {
	 
	private static final long serialVersionUID = 78974;
	
	private String nombre;
	 private String apellido;
	 //aaaaaaaaa
	 
	 public Alumno() {}
	 
	



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
