package edu.elsmancs.JoseMariaSamosExamenRicksy;

import java.util.ArrayList;

/**
 * Esta clase se encarga de vender los servicios a los invitados,
 * utiliza la interfaz GuestDispatcher
 * 
 * @author Jose María Samos Diago
 *
 */

public class Receptivo {

	private final ArrayList<GuestDispatcher> dispatchers = new ArrayList<GuestDispatcher>();

	/**
	 * Método que registra objetos con la interfaz GuestDispatcher implementada
	 * 
	 * @param dispatcher Objeto GuestDispatcher para registrar
	 * @see GuestDispatcher
	 */
	
	public void registra(GuestDispatcher dispatcher) {
		dispatchers.add(dispatcher);
	}
	
	/**
	 * Por cada tarjeta de crédito que se usa en este método le vende o asigna
	 * los servicios que están registrados
	 * 
	 * @param tarjetaDeCredito Tarjeta de crédito a la que se le cobrará los servicios
	 */
	
	public void dispatch(CreditCard tarjetaDeCredito) {
		for (GuestDispatcher dispatcher : dispatchers) {
			dispatcher.dispatch(tarjetaDeCredito);
		}
	}
}
