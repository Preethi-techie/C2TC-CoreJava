package day4;

public class privateconstructorDemo { 
				// Can't create object with private constructor
				// MyClass m1=new MyClass();
	public static void main(String[]s) {
				
				Myclass m=Myclass.getObject();
				m.setId(10);
				
				Myclass m1=Myclass.getObject();
				
				System.out.println(m);
				System.out.println(m1);
				
			}

	}


