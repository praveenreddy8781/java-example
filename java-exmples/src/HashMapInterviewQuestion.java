
class Employee {
	private Integer id;
	private String name;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (id != other.id)
//			return false;
//		return true;
//	}
}

public class HashMapInterviewQuestion {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "ankush");
		Employee employee2 = new Employee(1, "ankush");

		System.out.println(employee1);
		System.out.println(employee2);

		java.util.HashMap<Employee, Integer> hashMap = new java.util.HashMap<Employee, Integer>();

		hashMap.put(employee1, 1);
		hashMap.put(employee2, 1);

		System.out.println(hashMap);
	}
}
