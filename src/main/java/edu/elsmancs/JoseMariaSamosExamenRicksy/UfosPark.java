package edu.elsmancs.JoseMariaSamosExamenRicksy;

import java.util.HashMap;

public class UfosPark implements GuestDispatcher {

	private final double fee = 500;
	private final HashMap<String, CreditCard> flota = new HashMap<String, CreditCard>();
	
	public void dispatch(CreditCard tarjetaDeCredito) {
		
	}

	public void add(String ovni) {
		flota.put(ovni, null);
	}
}
