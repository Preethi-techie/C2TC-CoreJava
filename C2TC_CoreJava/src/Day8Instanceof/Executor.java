package Day8Instanceof;

public class Executor {
	private static final String Phonefactory = null;

	public static void main(String args[]) {
		
		Phone p1 = Phonefactory.createPhone("Samsung"); 
		p1.call();
		p1.sms();
		p1 = Phonefactory.createPhone("Jio"); 
		p1.call();
		p1.sms();
	}
}