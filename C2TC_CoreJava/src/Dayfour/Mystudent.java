package Dayfour;

public class Mystudent {
   public static void main(String[]args) {
	    Myclass st = Myclass.getObj();
	   
		   st.setId(101);
		   st.setName("Preethi");
		   System.out.println(st);
		   
		   Myclass st1 = Myclass.getObj();
		   System.out.println(st1);
	   }
	   
   }
