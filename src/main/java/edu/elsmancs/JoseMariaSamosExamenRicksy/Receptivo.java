package edu.elsmancs.JoseMariaSamosExamenRicksy;

import java.util.ArrayList;

public class Receptivo {

	private final ArrayList<GuestDispatcher> dispatchers = new ArrayList<GuestDispatcher>();

	public void registra(GuestDispatcher dispatcher) {
		dispatchers.add(dispatcher);
	}
}
