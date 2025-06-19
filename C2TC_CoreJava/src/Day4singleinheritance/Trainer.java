package Day4singleinheritance;

public class Trainer extends Person {
   private String designation;
   private String location;
   
 
   public String getDesignation() {//getter and setter
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

public Trainer() {//default constructor
	super();//calling base class constructor
	this.designation="Program Trainer";
	this.location="Chennai";
}
  //parameterized
public Trainer(int id, String name, String city, String designation, String location) {
	super(id,name,city);//cang base class paramterized
	this.designation=designation;
	this.location=location;
	
	
	
}
@Override
public String toString() {
	return "Trainer[id:"+getId()+" Name:"+getName()+""+ "city:"+getCity()+" desigantion="+ designation +", location=" + location + "]";
}
}





   
   
  

