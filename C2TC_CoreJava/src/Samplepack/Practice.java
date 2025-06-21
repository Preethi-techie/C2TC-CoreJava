package Samplepack;

public class Practice{
    private int id;
    private String name;
    private String city;
    
    public Practice(){
    	this.id = 101;
    	this.name = "Preethi";
    	this.city = "Chennai";
    }
    
    public Practice(int id, String name, String city) {
    	this.id=id;
    	this.name=name;
    	this.city=city;
    }
    
    //getter and setter
    public int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id = id;
    }
    
    public String getName() {
    	return name;
    }
    public void setId(String id) {
    	this.name = name;
    }
    
    public String city() {
    	return city;
    }
    public void setCity(String city) {
    	this.city = city;
    }
    
    //@override
    public String toString() {
    	return "Practice[id= " + id + ", name= " + name + ", city = " + city + "]";
    }
 
}
