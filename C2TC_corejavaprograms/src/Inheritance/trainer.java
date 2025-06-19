package Inheritance;

public class trainer extends person {
	private String designation;
	private String location;
	public trainer() {                  //default constructor
		super();                        // calling base class constructor
		this.designation ="program trainer";
		this.location ="chennai";
	}
	public trainer(int id,String name,String city,String designation,String location) {
		super(id,name,city);  //calls the base class parameterized constructor
		this.designation=designation;
		this.location=location;
		
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "trainer [id:"+getId()+" name:"+getName()+" city:"+getCity()+" designation:"+getDesignation()+" location="+getLocation()+"]";
	}
	
	

}
