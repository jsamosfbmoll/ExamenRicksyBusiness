package edu.elsmancs.JoseMariaSamosExamenRicksy;

import java.util.HashMap;

/**
 * Clase de tipo GuestDispatcher que maneja el servicio
 * de alquiler de ufos para la fiesta.
 * 
 * @author Jose María Samos Diago
 * @see GuestDispatcher
 *
 */

public class UfosPark implements GuestDispatcher {

	private final double fee = 500;
	private final HashMap<String, String> flota = new HashMap<String, String>();
	
	/**
	 * 
	 * @return True si hay ufos disponibles para alquilar
	 */
	
	private boolean ufosLibres() {
		return flota.containsValue(null);
	}
	
	/**
	 * Comprueba si la tarjeta ya tiene un ufo alquilado
	 * 
	 * @param numeroTarjeta Tarjeta que se debe comprobar
	 * @return True si larjeta ya tiene el servicio
	 */
	
	private boolean ufoYaAlquilado(String numeroTarjeta) {
		return flota.containsValue(numeroTarjeta);
	}
	
	/**
	 * Asigana el ufo a la tarjeta que se le indica
	 * 
	 * @param numeroTarjeta Tarjeta a la que se le asigna el ufo
	 */
	
	private void asignarUfo(String numeroTarjeta) {
		for (String ovni : flota.keySet()) {
			if (flota.get(ovni) == null) {
				flota.put(ovni, numeroTarjeta);
				break; //Break para que deje de asignar ovnis
			}
		}
	}
	
	/**
	 * Cobra el ufo y lo asigna llamando al método privado asignarUfo
	 * Método de la interfaz GuestDispatcher
	 * 
	 * @param tarjetaDeCredito Tarjeta que solicita el servicio
	 * @see asignarUfo
	 */
	
	public void dispatch(CreditCard tarjetaDeCredito) {
		String numeroTarjeta = tarjetaDeCredito.number();
		if (ufosLibres() && !ufoYaAlquilado(numeroTarjeta)) {
			if (tarjetaDeCredito.pay(fee)) {
				asignarUfo(numeroTarjeta);
			}
		}
	}
	
	/**
	 * Devuelve el ovni (o ufo) que se ha asignado a una tarjeta
	 * 
	 * @param cardNumber Tarjeta que se quiere consultar
	 * @return null en case de no estar contratado el servicio por la tarjeta
	 * o el ovni en caso de encontrarlo
	 */
	
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
	
	/**
	 * Añade ovnis a la flota de ovnis (o ufos)
	 * 
	 * @param ovni ufo que se quiere añadir
	 */

	public void add(String ovni) {
		flota.put(ovni, null);
	}
	
	@Override
	public String toString() {
		return flota.keySet().toString();
	}
}
