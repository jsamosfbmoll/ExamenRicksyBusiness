package edu.elsmancs.JoseMariaSamosExamenRicksy;

public class CrystalExpender implements GuestDispatcher {
	
	private int stock = 0;
	private final double itemCost;
	
	public CrystalExpender(int stock, double cost) {
		this.stock = stock;
		this.itemCost = cost;
	}
	
	public void dispatch(CreditCard tarjetaDeCredito) {
		String numeroTarjeta = tarjetaDeCredito.number();
		if (stock > 0 && tarjetaDeCredito.pay(itemCost)) {
			stock -= 1;
		}
	}
	
	public int stock() {
		return stock;
	}
	
	@Override
	public String toString() {
		String texto = "stock: " + stock + "\ncost: " + itemCost;
		return texto;
	}

}
