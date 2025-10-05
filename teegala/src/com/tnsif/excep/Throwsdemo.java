package com.tnsif.excep;

class Sample{
	public void show() throws Exception
	{
		String s =null;
		throw new NullPointerException("NoNullValues");
	}
}
public class Throwsdemo {

	public static void main(String[] args) throws Exception {
		Sample s1 = new Sample();
		s1.show();

	}

}
