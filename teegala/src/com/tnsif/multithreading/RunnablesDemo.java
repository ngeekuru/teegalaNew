package com.tnsif.multithreading;

public class RunnablesDemo {

	public static void main(String[] args) {
		RunnableInf ri = new RunnableInf();
		Thread t1 = new Thread(ri);
		t1.start();
		

	}

}
