package com.tnsif.interfaces;

public class MainClass {

	public static void main(String[] args) {
		jio j = new jio();
		j.call();
		j.sms();
		
		samsung sm = new samsung();
		sm.call();
		sm.sms();

	}

}
