package com.pavanilearning.inteface;

public abstract interface Distributor {

	public static final String name = "defaultValue";

	void getName();

	public abstract String getAllNames();

	String getAllNames1(); // complier will read it as by default public abstract.

}
