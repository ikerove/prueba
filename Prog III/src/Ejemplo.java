import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Unido a clase Alumno
public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a = new Alumno();
		a.setNombre("Iker");
		a.setApellido("Rodriguez");
		
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File("datos.bin")))) {
			os.writeObject(a);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el fichero");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido serializar el objeto");
		}
	}

}
