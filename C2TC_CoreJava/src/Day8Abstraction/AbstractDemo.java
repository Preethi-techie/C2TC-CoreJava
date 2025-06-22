package Day8Abstraction;

public class AbstractDemo {
	public static void main(String[] args) {
		Square sq=new Square();
		Rectangle r1=new Rectangle();
		sq.calArea();
		r1.calArea();
		r1.show();
		
		System.out.println("------------------------------------------------");
		//Runtime Polymorphism / Dynamic binding / late binding
		//Ex: Method Overriding
		Rectangle shape;// invoked Square class calArea()
		
		shape=new Rectangle(10,20);
		
		shape.calArea(); // invoked Rectangle class calArea()
		shape.show();
		
		
		
		
		

	}

}
