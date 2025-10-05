package com.tnsif.multithreading;

public class PriorityDemo extends Thread {
	public void run()
	{
		System.out.println("The running thread is :" +Thread.currentThread().getName());
		System.out.println("The running thread priority is :" +Thread.currentThread().getPriority());
		
	}
}
