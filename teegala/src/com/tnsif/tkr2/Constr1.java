package com.tnsif.tkr2;

class Sample{
	Sample(int a,int b){
		System.out.println("This is constuctor");
		
	}
	public void show1()
	{
		System.out.println("This is method");
	}
}
public class Constr1 {

	public static void main(String[] args) {
		
		Sample ob = new Sample(10,20);
		ob.show1();
	}

}
