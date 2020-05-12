package edu.elsmancs.JoseMariaSamosExamenRicksy;

/**
 * Interfaz que deben implementar los servicios de la fiesta
 * para ser considerados como tal.
 * 
 * @author Jose María Samos Diago
 *
 */

public interface GuestDispatcher {
	
	/**
	 * Este método asigna un producto a una tarjeta de créditp y lo cobra.
	 * 
	 * @param tarjetaDeCredito La tarjeta de crédito donde se efectuará el cobro.
	 */
	
	public void dispatch(CreditCard tarjetaDeCredito);
	
}
