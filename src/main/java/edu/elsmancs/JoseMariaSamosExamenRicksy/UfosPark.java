package edu.elsmancs.JoseMariaSamosExamenRicksy;

import java.util.HashMap;

public class UfosPark implements GuestDispatcher {

	private final double fee = 500;
	private final HashMap<String, String> flota = new HashMap<String, String>();
	
	private boolean ufosLibres() {
		return flota.containsValue(null);
	}
	
	private boolean ufoYaAlquilado(String numeroTarjeta) {
		return flota.containsValue(numeroTarjeta);
	}
	
	private void asignarUfo(String numeroTarjeta) {
		for (String ovni : flota.keySet()) {
			if (flota.get(ovni) == null) {
				flota.put(ovni, numeroTarjeta);
			}
		}
	}
	
	public void dispatch(CreditCard tarjetaDeCredito) {
		String numeroTarjeta = tarjetaDeCredito.number();
		if (ufosLibres() && !ufoYaAlquilado(numeroTarjeta)) {
			if (tarjetaDeCredito.pay(fee)) {
				asignarUfo(numeroTarjeta);
			}
		}
	}
	
	public String getUfoOf(String cardNumber) {
		if (ufoYaAlquilado(cardNumber)) {
			for (String ovni : flota.keySet()) {
				if (flota.get(ovni) == cardNumber) {
					return ovni;
				}
			}
		} else {
			return null;
		}
		return null;
	}

	public void add(String ovni) {
		flota.put(ovni, null);
	}
	
	@Override
	public String toString() {
		return flota.keySet().toString();
	}
}
