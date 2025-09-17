package com.tnsif.Constrct;

class Sample{
	int x=1,y=2,z=3;
	 Sample()
	 {
		System.out.println("This is constructor"); 
	 }
	 public void show()
	 {
		 int volume = x*y*z;
		 System.out.println(volume);
	 }
}
public class Construct {

	public static void main(String[] args) {
		Sample s= new Sample();
		s.show();
	}

}
