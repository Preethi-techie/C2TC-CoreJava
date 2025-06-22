package Day5hsa;

public class Address {
   private String street;
   private String state;
   private String city;
   private String postalcode;
   
   public Address() {//default construct
	   super();
   }
   //parameterised
   public Address(String street, String state, String city, String postalcode) {
	   this.street = street;
	   this.state = state;
	   this.city = city;
	   this.postalcode = postalcode;
	   }
   
   public String getStreet() {
	   return street;
   }
   public void setStreet(String street) {
	   this.street = street;
   }
   
   public String getState() {
	   return state;
   }
   public void setState(String city) {
	   this.state = state;
   }
   
   public String getCity() {
	   return city;
   }
   public void setCity(String city) {
	   this.city = city;
   }
   
   public String getPostalcode() {
	   return postalcode;
   }
   public void setPostalcode(String postalcode) {
	   this.postalcode = postalcode;
   }
}
