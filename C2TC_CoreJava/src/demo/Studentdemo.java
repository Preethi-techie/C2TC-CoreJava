package demo;

import Day1.Customer;

public class Studentdemo {
   public static void main(String[]args) {
	   Student stn = new Student();
	   stn.setId(101);
	   stn.setName("John");
	   stn.setAge(20);
	   
	   System.out.println(stn);
	   
		/*
		 * System.out.println("ID:" +stn.getId());//automatically calls toString()
		 * System.out.println("Name:" +stn.getName()); System.out.println("Age:"
		 * +stn.getAge());
		 */
	   
	   Customer c = new Customer();
	   c.setName("John");
	   System.out.println(c);
   }
}
 