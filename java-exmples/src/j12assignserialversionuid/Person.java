package j12assignserialversionuid;

import java.io.Serializable;

//Default serialVersionUID example
//if not added we get warning: The serializable class Person does not declare a static 
//final serialVersionUID field of type long
class Person implements Serializable {
	private int id;
	private String name;
	private int age;

//	add new field before deserializing
//	private String city;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}

}
