import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class PeersonaEjemplo {
	private String nombre;
	private String apellido;
	
	
	public PeersonaEjemplo(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}

	public String getNombreCompleto() {
		return apellido + "," + nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p = 
				
	}

}
