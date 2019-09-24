import javax.swing.JFrame;

public class Main extends JFrame {
	
	
	private static final long serialVersionUID =1L;
	public Main() {
	this.setSize(200, 300);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	//this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setVisible(true);
	this.setTitle("Titulonuevo");
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma = new Main();
		System.out.println("Hola mundo desde Java");
	}

}
