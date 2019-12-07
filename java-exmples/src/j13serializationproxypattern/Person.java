package j13serializationproxypattern;

import java.io.Serializable;

class Person implements Serializable {
	private static final long serialVersionUID = 9140203997753929147L;

	private int id;
	private String name;
	private int age;

	public Person() {
		System.out.println("No arg constructor");
	}

	public Person(int id, String name, int age) {
		super();
		System.out.println("Person Arg constructor");

		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * writeReplace method for the proxy pattern
	 * 
	 * @return
	 */
	private Object writeReplace() {
		System.out.println("In writeReplace() method");
		return new PersonProxy(this);
	}

	// Nested static class - Proxy
	private static class PersonProxy implements Serializable {

		private static final long serialVersionUID = -5965328891170223339L;
		private String name;
		private int id;
		private int age;

		PersonProxy(Person p) {
			System.out.println("PersonProxy arg constructor");
			this.name = p.name;
			this.id = p.id;
			this.age = p.age;
		}

		// readResolve method for Person.PersonProxy
		private Object readResolve() {
			System.out.println("In readResolve() method");
			return new Person(id, name, age);// Uses public constructor
		}
	}
}
