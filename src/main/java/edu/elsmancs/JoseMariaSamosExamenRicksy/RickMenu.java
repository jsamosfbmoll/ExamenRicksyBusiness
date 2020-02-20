package edu.elsmancs.JoseMariaSamosExamenRicksy;

public class RickMenu implements GuestDispatcher {

	private int stock = 0;
	private final double itemCost;
	
	public RickMenu(int stock, double cost) {
		this.stock = stock;
		this.itemCost = cost;
	}
	
	public void dispatch(CreditCard tarjetaDeCredito) {
		
	}

}
