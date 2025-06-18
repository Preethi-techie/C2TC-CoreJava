package Dayfour;

public class Privateconstructordemo{
	public static void main(String s[]) {
		// Can't create object with private constructor
		// MyClass m1=new MyClass();
		
	    myclas m=myclas.getObject();
		m.setId(10);
		
		myclas m1=myclas.getObject();
		
		System.out.println(m);
		System.out.println(m1);
		
	}
}