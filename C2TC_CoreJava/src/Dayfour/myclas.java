package Dayfour;
public class myclas{
	private static myclas obj=new myclas();
	private int id;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	private myclas() {
		System.out.println("MyClass object created");		
	}
	
	public static myclas getObject() //factory method
	{
		return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
}
