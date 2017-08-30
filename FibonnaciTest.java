import static org.junit.Assert.*;

import org.junit.Test;

public class FibonnaciTest {

	@Test
	public void testStartingNumbers() {
		Fibonnaci fib = new Fibonnaci();
		
		assertEquals(0, fib.fibonnaci(0));
		assertEquals(1, fib.fibonnaci(1));
	}
	@Test
	public void testFirstFive() {
		Fibonnaci fib = new Fibonnaci();
		
		assertEquals(1, fib.fibonnaci(2));
		assertEquals(2, fib.fibonnaci(3));
		assertEquals(3, fib.fibonnaci(4));
		assertEquals(5, fib.fibonnaci(5));
		assertEquals(8, fib.fibonnaci(6));
	}

}
