package Day8ImplementingInterface;

import Day8FunctionalInterfaces.GreetInterface;
import Day8FunctionalInterfaces.Greetclass;

public class Account{

	public static void main(String[] args) {
		Greetclass g = new Greetclass();
		System.out.println(g.greet());

		//using Lambda Expression
		GreetInterface g1 = () -> {
			return "Good Afternoon";
		};

		System.out.println(g1.greet());
	}
}