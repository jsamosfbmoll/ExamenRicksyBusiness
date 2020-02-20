package edu.elsmancs.JoseMariaSamosExamenRicksy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UfosParkTest {

    UfosPark ufos = null;
    String[] ovnis = { "unx", "dox", "trex" };

    @Before
    public void setup() {
    	ufos = new UfosPark();
		for (String ovni : ovnis) {
			ufos.add(ovni);
        }
    }
    
    /**
     * Testea el metodo añadir ovni 
     * a la flota de ufos
     */
    @Test
    public void addUfoTest() {
    	ufos.add("ovniInventado");
    }

    /**
     * Testea el metodo reservar ovni 
     * y cargar el pago en la tarjeta 
     * de crédito.
     * El crédito de la tarjeta varía.
     */
    @Test
    public void dispatchTest() {
    	CreditCard tarjeta = new CreditCard("Jose", "1234432156788765");
    	ufos.dispatch(tarjeta);
    	assertEquals("trex", ufos.getUfoOf("1234432156788765"));
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si no hay crédito suficiente en la tarjeta.
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchNoCreditTest() {
    	CreditCard tarjeta = new CreditCard("Jose", "4321432156788765");
    	tarjeta.pay(3000.0);
    	ufos.dispatch(tarjeta);
    	assertEquals(null, ufos.getUfoOf("4321432156788765"));
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si ya existe un ovni reservado para esa tarjeta.
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchUfoAlreadyReservedTest() {
    	CreditCard tarjeta = new CreditCard("Jose", "1234432156788765");
    	ufos.dispatch(tarjeta);
    	String ufo = ufos.getUfoOf(tarjeta.number());
    	ufos.dispatch(tarjeta);
    	assertEquals(ufo, ufos.getUfoOf("1234432156788765"));
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si no existe ninguno disponible (sin reservar).
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchNoUfoAvaliableTest() {
    	CreditCard tarjeta = new CreditCard("Jose", "8765567843211234");
    	CreditCard tarjetaDos = new CreditCard("Jose", "0098765434566543");
    	ufos.dispatch(tarjeta);
    	ufos.dispatch(tarjetaDos);
    	assertEquals(null, ufos.getUfoOf("1234567887654321"));
    }

    /**
     * Devuelve el UFO reservado para la tarjeta.
     */
    @Test
    public void getUfoOfTest() {
    	CreditCard tarjeta = new CreditCard("Jose", "8765567843211234");
    	ufos.dispatch(tarjeta);
    	assertEquals("trex", ufos.getUfoOf("8765567843211234"));
    }
}
