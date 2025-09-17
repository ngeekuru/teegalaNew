package com.tnsif.inheritance;

	class Base{
		public void hello()
		{
			System.out.println("this is Base");  //20
			
		}
	}
	class Derived extends Base{
		
		public void hello()
		{
			System.out.println("This is Derived");  //20
			
		}
	}
public class SuperKey {

	public static void main(String[] args) {
		
		Derived d = new Derived();
		d.hello();
	}
}
