package FunctionalInterface;

public class FunctionalInterface {
	public static void main(String[]args) {
		GreetClass g = new GreetClass();
			System.out.println(g.greet());
			


			Greet g1 = () -> {
				return "Good Afternoon";
			};

		 System.out.println(g1.greet());

		
	}
	}


