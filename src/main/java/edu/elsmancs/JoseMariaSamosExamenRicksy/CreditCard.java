package edu.elsmancs.JoseMariaSamosExamenRicksy;

public class CreditCard {
	
	private final String owner;
	private final String number;
	private double credit = 3000d;
	private final String SYMBOL = "EZI";
	
	public CreditCard(String nombreOwner, String numeroTarjeta) {
		this.owner = nombreOwner;
		this.number = numeroTarjeta;
	}
	
	public String number() {
		return this.number;
	}
	
	public double credit() {
		return this.credit;
	}
	
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

	
