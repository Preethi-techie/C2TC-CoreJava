package polymorphism;

public class example {
	public static void main(String[]args) {
		System.out.println("1.addition : "+OverloadingExample.addition(6.5f, 4.5f));
		System.out.println("1.addition : "+OverloadingExample.addition(2, 3.5f));
		System.out.println("1.addition : "+OverloadingExample.addition(2, 3));
		System.out.println("1.addition : "+OverloadingExample.addition("hello", "world"));
	}
	Person p1=new Person();
	System.out.println(p1);
	p1=new Person(101,"hema");
	System.out.println(p1);
	p1=new Person(102,"sunitha","bangalore");
	System.out.println(p1);

}
