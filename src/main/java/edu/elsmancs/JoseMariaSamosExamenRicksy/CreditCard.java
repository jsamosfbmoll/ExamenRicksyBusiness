package edu.elsmancs.JoseMariaSamosExamenRicksy;

/**
 * Clase que representa una tarjeta de crédito que
 * permite saber el crédito disponible y contiene funciones
 * para el manejo del capital.
 * 
 * @author Jose María Samos Diago
 *
 */

public class CreditCard {
	
	private final String owner;
	private final String number;
	private double credit = 3000d;
	private final String SYMBOL = "EZI";
	
	/**
	 * Constructor de la clase en el que se asigna
	 * el propietario y el número de la tarjeta.
	 * 
	 * Ambos campos son inmodificables.
	 * 
	 * @param nombreOwner Nombre del propietario
	 * @param numeroTarjeta Número de la tarjeta
	 */
	
	public CreditCard(String nombreOwner, String numeroTarjeta) {
		this.owner = nombreOwner;
		this.number = numeroTarjeta;
	}
	
	/**
	 * 
	 * @return Este método devuelve el número de la tarjeta.
	 */
	
	public String number() {
		return this.number;
	}
	
	/**
	 * 
	 * @return La cantidad de crédito disponible.
	 */
	
	public double credit() {
		return this.credit;
	}
	
	/**
	 * Permite el pago de un servicio restando la cantidad
	 * de capital indicada y devuelve un valor booleano que indica
	 * si la operación se ha completado con éxito o no.
	 * 
	 * @param ezi Cantidad de monedas a restar.
	 * @return True si la transacción se ha completado satisfactoriamente,
	 * false en caso contrario.
	 */
	
	public boolean pay(double ezi) {
		if (ezi > credit) {
			return false;
		} else {
			credit -= ezi;
			return true;
		}
	}
	
	@Override
	public String toString() {
		String texto = "Owner: " + owner + "\nnumber: " + number
				+ "\ncredit: " + credit + " " + SYMBOL;
		return texto;
	}
}

	
