package Day6StaticVariable;

public class Employee{
	// Declare instance variables.
	private String name;
	private int id;
	
	// TNS which is common for all the objects.
	static String companyName = "TNS";

	// parameter constructor
	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company= "+companyName+"]";
	}

}