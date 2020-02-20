package edu.elsmancs.JoseMariaSamosExamenRicksy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {
	
	CreditCard tarjeta;
	
	@Before
	public void setup() {
		tarjeta = new CreditCard("Jose", "4916139711504546");
	}

	@Test
	public void crearTarjeta() {
		CreditCard tarjeta = new CreditCard("Nombre", "7115045464157894");
	}
	
	@Test
	public void tarjetaToString() {
		String expected = "Owner: Jose\nnumber: 4916139711504546\ncredit: 3000.0 EZI";
		String actual = tarjeta.toString();
		assertEquals(expected, actual);
	}
	
	@Test
	public void credit() {
		assertEquals(3000.0, tarjeta.credit(), 0);
	}
	
	@Test
	public void number() {
		assertEquals("4916139711504546", tarjeta.number());
	}
	
	@Test
	public void pay() {
		tarjeta.pay(1000.0);
		assertEquals(2000.0, tarjeta.credit(), 0);
	}

}
