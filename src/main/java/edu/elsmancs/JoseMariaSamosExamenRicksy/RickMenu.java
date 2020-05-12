package edu.elsmancs.JoseMariaSamosExamenRicksy;

/**
 * Clase de tipo GuestDispatcher que maneja el expendedor
 * de menús para los invitados.
 * 
 * @author Jose María Samos Diago
 * @see GuestDispatcher
 *
 */

public class RickMenu implements GuestDispatcher {

	private int stock = 0;
	private final double itemCost;
	
	/**
	 * 
	 * @param stock Cantidad de stock que habrá disponible
	 * @param cost Coste de cada menú
	 */
	
	public RickMenu(int stock, double cost) {
		this.stock = stock;
		this.itemCost = cost;
	}
	
	/**
	 * Cobra el menú y reduce el stock ya que el menú
	 * vendido no esta disponible.
	 * Método de la interfaz GuestDispatcher
	 * 
	 * @param tarjetaDeCredito Tarjeta a la que se le cobrará el menú
	 */
	
	public void dispatch(CreditCard tarjetaDeCredito) {
		if (stock > 0 && tarjetaDeCredito.pay(itemCost)) {
			stock -= 1;
		}
	}
	
	/**
	 * 
	 * @return Devuelve el stock de menús dentro de la clase
	 */
	
	public int stock() {
		return stock;
	}
	
	@Override
	public String toString() {
		String texto = "stock: " + stock + "\ncost: " + itemCost;
		return texto;
	}

}
