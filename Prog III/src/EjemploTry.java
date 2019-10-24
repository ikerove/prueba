import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fls = new FileInputStream (new File ("config.ini"))) {
			Properties p = new Properties;
			p.load(fls);
			System.out.println(p.getProperty("usuario"));
		}catch (FileNotFoundException e) {
			System.out.println("No se ha podido encontrar el fichero");
		}catch (IOException e) {
			System.out.println("No se ha podido abrir el fichero");
		}
	}

}
