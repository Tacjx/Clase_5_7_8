package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	public void test() {
		Descuento test= new Descuento();
		double desc=test.descuento(150);
		double expected=118.5;
		assertEquals(expected,desc);
	
	}

}
