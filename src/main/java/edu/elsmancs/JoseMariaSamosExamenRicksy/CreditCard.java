package edu.elsmancs.JoseMariaSamosExamenRicksy;

public class CreditCard {
	
	private final String owner;
	private final String number;
	private int credit = 0;
	private final String SYMBOL = "EZI";
	
	public CreditCard(String nombreOwner, String numeroTarjeta) {
		this.owner = nombreOwner;
		this.number = numeroTarjeta;
	}
}

	
