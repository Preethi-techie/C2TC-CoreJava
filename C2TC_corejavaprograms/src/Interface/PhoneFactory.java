package Interface;

public class PhoneFactory {
	public static Phone createPhone(String company) {
		if(company.equalsIgnoreCase("samsung"))
			return new Samsung();
		else if(company.equalsIgnoreCase("Jio"))
			return new Jio();
		return null;
	}
	

}
