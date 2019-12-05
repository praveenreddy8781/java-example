package j1statickeword;

class Employee {
	int id;
	String name;
	String dept;

//	is used to create a constants
//	static final String COMPANY_NAME = "Apple";
//	same copy will be used by all the object
	static String COMPANY_NAME = "Apple";
	
//	counter at class level
	static int count = 0;

	Employee(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		
		count++;
	}

	public void displayData() {
		System.out.println("EmpId = " + id + " name= " + name + " dept = " + dept + " company = " + COMPANY_NAME);
	}

}

public class Static1Variable {

	public static void main(String[] args) {
		Employee employee1 = new Employee(10, "Rama", "IT");
		Employee employee2 = new Employee(11, "Krishna", "Finance");

//		Static variable can be accessed by class name directly
		System.out.println(Employee.COMPANY_NAME);

		Employee.COMPANY_NAME = "Samsung";

//		all objects use the same copy of static variable
		employee1.displayData();

		employee2.displayData();
		
//		static counter at class level
		System.out.println("No of Employye Objects created? " + Employee.count);

	}

}
