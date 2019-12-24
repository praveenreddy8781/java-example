package immutableclass;

import java.util.ArrayList;
import java.util.List;

final class Employee {
	final private Integer id;
	final private String name;
	
//	Mutable field
	final private StringBuffer city;
	
	final private Address address;
	
	final private List<String> skils;

	public Employee(Integer id, String name, StringBuffer city, Address address,List<String> skils) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.address = address;
		this.skils = skils;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

//	return String instead StringBuffer to make immutable
	public String getCity() {
		return city.toString();
	}

//	need to create a defensive copy or create a clone to make immutable
	public Address getAddress() throws CloneNotSupportedException {
//		Address address = new Address();
//		address.setAddr(this.address.getAddr());
//		address.setHno(this.address.getHno());
		return (Address) address.clone();
	}

	public List<String> getSkils() {
		ArrayList<String> skills = new ArrayList<String>(skils);
		return skills;
	}
}

public class ImmutableClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		StringBuffer city = new StringBuffer("Bangalore");
		
		Address address = new Address(110, "Vinajnagar");
		
		ArrayList<String> skills = new ArrayList<String>();
		skills.add("java");
		skills.add("sql");
		skills.add("angular");
		
		Employee employee1 = new Employee(1, "Anksuh", city, address, skills);
		
		System.out.println(employee1.getId());
		System.out.println(employee1.getName());
		System.out.println(employee1.getCity());
//		System.out.println(employee1.getAddress().append(" rural"));
		
		System.out.println(employee1.getAddress().getAddr());
		employee1.getAddress().setAddr("Kengeri");
		System.out.println(employee1.getAddress().getAddr());
		
		System.out.println(employee1.getSkils());
		employee1.getSkils().add("sap");
		System.out.println(employee1.getSkils());
		
	}
}
