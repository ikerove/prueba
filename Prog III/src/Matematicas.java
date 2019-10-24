
public class Matematicas implements Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sumar(int a, int b) {
		// TODO Auto-generated method stub
		return  a + b;
	}

	@Override
	public int restar(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public int multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public boolean esPar(int a) {
		// TODO Auto-generated method stub
		if(a % 2 == 0) 
		return true;
		else
		return false;
		
	}
	
	public double cuadrado(int a) {
		return a*a;
	}

}
