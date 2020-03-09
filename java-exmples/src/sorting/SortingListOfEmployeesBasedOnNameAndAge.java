package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {

	private int empId;
	private String name;
	private int age;

	public Employee() {
	}

	public Employee(int empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		int count = name.compareTo(o.getName());

		if (count != 0) {
			return count;
		}

		return age - o.getAge();
	}
}

public class SortingListOfEmployeesBasedOnNameAndAge {

	public static void main(String[] args) {

//		sort list by employee name and age
		Employee employee1 = new Employee(100, "Naveen", 25);
		Employee employee2 = new Employee(104, "Akash", 24);
		Employee employee3 = new Employee(102, "Akbar", 21);
		Employee employee4 = new Employee(101, "Babar", 27);
		Employee employee5 = new Employee(106, "Raj", 29);
		Employee employee6 = new Employee(105, "John", 26);
		Employee employee7 = new Employee(108, "Andy", 30);
		Employee employee8 = new Employee(104, "Akash", 23);

		List<Employee> list = new ArrayList<Employee>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		list.add(employee7);
		list.add(employee8);

		System.out.println("Before sorting list by employee name: " + list);

		Collections.sort((List<Employee>) list);

		System.out.println("After sorting list by employee name: " + list);

	}

}
