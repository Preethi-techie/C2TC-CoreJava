package Inheritance;

public class person {
	private int id;
	private String name;
	private String city;
	public person() {
		this.id=101;
		this.name="sunitha";
		this.city="chennai";
		
	}
	public person (int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public int getId() {
		return id;
	}	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	

}
