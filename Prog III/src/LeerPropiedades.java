import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LeerPropiedades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		
		
		try {
			FileInputStream fis = new FileInputStream (new File ("config.ini"));
			
			try {
				p.load(fis);
				
				System.out.println(p.getProperty("carpeta"));
				System.out.println(p.getProperty("usuario"));
						
			} catch (IOException e) {
				System.out.println("No se ha podido leer el fichero" + e.getMessage());
			}finally {
				try {
					fis.close();
				} catch (IOException e) {
					
				}
			}
		}catch (FileNotFoundException e) {
			System.out.println("No se ha podido encontrar el fichero" + e.getMessage());
		}
	}

}
