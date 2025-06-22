package Day5hierarchical;

public class HierarchicalDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person p;
		employee e;
		p = new Person("Dhruv", "Mumbai");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		e = new employee("Nikhil", "Mumbai", 101, 67000, "Sales");
		if (e instanceof employee) {
		System.out.println("Employee Details "+e);
		}

		p = new Student("Pankaj", "Pune", "FE", 88);
		if (p instanceof Student) {
			System.out.println("Student Details "+p);
		}
	}

}
