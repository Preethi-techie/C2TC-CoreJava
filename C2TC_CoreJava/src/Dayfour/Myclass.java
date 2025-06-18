package Dayfour;

public class Myclass {
   private static Myclass s1 = new Myclass();
   public static Myclass getObj() {
	return s1;
}

   private int id;
   private Myclass() {
	// TODO Auto-generated constructor stub
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

private String name;

@Override
public String toString() {
	return "Myclass [id=" + id + ", name=" + name + "]";
}
   
   

    
   
   
}
