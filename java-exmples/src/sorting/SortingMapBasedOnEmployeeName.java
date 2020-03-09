package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class Employee1 {

	private int empId;
	private String name;
	private int age;

	public Employee1() {
	}

	public Employee1(int empId, String name, int age) {
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
}

public class SortingMapBasedOnEmployeeName {

	public static void main(String[] args) {
//		sorting map by employee name
		Employee1 employee1 = new Employee1(100, "Naveen", 25);
		Employee1 employee2 = new Employee1(104, "Akash", 24);
		Employee1 employee3 = new Employee1(102, "Akbar", 21);
		Employee1 employee4 = new Employee1(101, "Babar", 27);
		Employee1 employee5 = new Employee1(106, "Raj", 29);
		Employee1 employee6 = new Employee1(105, "John", 26);
		Employee1 employee7 = new Employee1(108, "Andy", 30);
		Employee1 employee8 = new Employee1(104, "Akash", 23);

		Map<Integer, Employee1> map = new TreeMap<Integer, Employee1>();
//		treeMap sorts by key but no by employee object which is a value

		map.put(2, employee1);
		map.put(4, employee2);
		map.put(1, employee3);
		map.put(10, employee4);
		map.put(5, employee5);
		map.put(7, employee6);
		map.put(6, employee7);
		map.put(8, employee8);

		System.out.println("Before sorting map by employee name: " + map);

		List<Map.Entry<Integer, Employee1>> list = new ArrayList<Map.Entry<Integer, Employee1>>(map.entrySet());

		list.sort(new Comparator<Map.Entry<Integer, Employee1>>() {

			@Override
			public int compare(Entry<Integer, Employee1> o1, Entry<Integer, Employee1> o2) {
				return o1.getValue().getName().compareTo(o2.getValue().getName());
			}

		});

//		System.out.println(list);

		Map<Integer, Employee1> map2 = new LinkedHashMap<Integer, Employee1>();

		for (Entry<Integer, Employee1> entry : list) {
			map2.put(entry.getKey(), entry.getValue());
		}

		System.out.println("After sorting map by employee name: " + map2);
	}

}
