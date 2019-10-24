import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	private Matematicas c;
	
	@Before
	public void setUP() {
		Matematicas c = new Matematicas();
		System.out.println("Se ha llamado al SetUp");
		
	}
	
	

	@Test
	public void testSumar() {
		Matematicas c = new Matematicas();
		assertEquals(5, c.sumar(2, 3));
	}
	
	@Test
	public void testRestar() {
		Matematicas c = new Matematicas();
		assertEquals(2, c.restar(4, 2));
	}
	
	@Test
	public void testMultiplicar() {
		Matematicas c = new Matematicas();
		assertEquals(8, c.multiplicar(2, 4));
		
		
	}
	
	@Test
	public void testEsPar() {
		Matematicas c = new Matematicas();
		assertTrue(c.esPar(2));
		assertFalse(c.esPar(3));
	}
	
	@Test
	public void testCuadrado() {
		
		assertEquals(9,0, c.cuadrado(3), 0.00001);
	}
	
}
