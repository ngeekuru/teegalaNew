package com.tnsif.interfaces;

public interface Interfacedemo {
	
	int a=10;
	void show();
}

class Samp implements Interfacedemo{
	public void show()
	{
		System.out.println("This is implementing class");
	}
}