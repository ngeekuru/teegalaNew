package com.tnsif.inheritance;

class Hello{
	int x=20;
	public void demo()
	{
		int x=30;
		System.out.println(x);  //30
		System.out.println(this.x); //20
	}
}
public class ThisKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h = new Hello();
		h.demo();
	}

}
