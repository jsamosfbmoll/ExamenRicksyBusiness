package edu.elsmancs.JoseMariaSamosExamenRicksy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CrystalExpenderTest {

	CrystalExpender cristal;
	
	@Before
	public void setup() {
		cristal = new CrystalExpender(5, 50.0);
	}
	
	@Test
	public void dispatch() {
		CreditCard tarjeta = new CreditCard("Jose", "4321123443215678");
		cristal.dispatch(tarjeta);;
	}
	
	@Test
	public void toStringTest() {
		assertEquals("stock: 5\ncost: 50.0", cristal.toString());
	}
	
	@Test
	public void stock() {
		assertEquals(5, cristal.stock());
		cristal.dispatch(new CreditCard("David", "3443211267765445"));
		assertEquals(4, cristal.stock());
	}

}
