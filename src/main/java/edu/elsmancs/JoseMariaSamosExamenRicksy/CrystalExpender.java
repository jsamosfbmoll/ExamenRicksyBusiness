package edu.elsmancs.JoseMariaSamosExamenRicksy;

public class CrystalExpender implements GuestDispatcher {
	
	private int stock = 0;
	private final double itemCost;
	
	public CrystalExpender(int stock, double cost) {
		this.stock = stock;
		this.itemCost = cost;
	}
	
	public void dispatch(CreditCard tarjetaDeCredito) {
		
	}

}
