package edu.elsmancs.JoseMariaSamosExamenRicksy;

/**
 * Clase de tipo GuestDispatcher que maneja el expendedor
 * de cristales para los invitados.
 * 
 * @author Jose María Samos Diago
 * @see GuestDispatcher
 *
 */

public class CrystalExpender implements GuestDispatcher {
	
	private int stock = 0;
	private final double itemCost;
	
	/**
	 * Constructor de la clase
	 * 
	 * @param stock Cantidad de cristales disponibles para la venta
	 * @param cost Coste de cada cristal
	 */
	
	public CrystalExpender(int stock, double cost) {
		this.stock = stock;
		this.itemCost = cost;
	}
	
	/**
	 * Cobra el cristal y reduce el stock ya que el cristal
	 * vendido no esta disponible.
	 * Método de la interfaz GuestDispatcher
	 * 
	 * @param tarjetaDeCredito Tarjeta que solicita el servicio
	 * @see GuestDispatcher
	 */
	
	public void dispatch(CreditCard tarjetaDeCredito) {
		if (stock > 0 && tarjetaDeCredito.pay(itemCost)) {
			stock -= 1;
		}
	}
	
	/**
	 * 
	 * @return Devuelve el stock de cristales dentro de la clase
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
