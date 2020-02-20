package edu.elsmancs.JoseMariaSamosExamenRicksy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReceptivoTest {

	@Test
	public void crearReceptivo() {
		Receptivo receptivo = new Receptivo();
	}
	
	@Test
	public void registrar() {
		Receptivo receptivo = new Receptivo();
		UfosPark ufos = new UfosPark();
		CrystalExpender cristal = new CrystalExpender(7, 2);
		receptivo.registra(ufos);
		receptivo.registra(cristal);
	}
	
	@Test
	public void dispatch() {
		Receptivo receptivo = new Receptivo();
		receptivo.dispatch(new CreditCard("David", "7676767654545454"));
	}

}
