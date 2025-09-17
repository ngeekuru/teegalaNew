package com.tnsif.tkr2;
class key1{
	int a=50;
}
class Keys extends key1{
	int a=10;  //instance
	public void show()
	{
		int a=20;
		System.out.println(a); //20
		System.out.println(this.a); //10
		System.out.println(super.a);
	}
}
public class Thiskey {

	public static void main(String[] args) {
		
		Keys k = new Keys();
		k.show();

	}

}
