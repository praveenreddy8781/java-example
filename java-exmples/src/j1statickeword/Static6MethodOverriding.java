package j1statickeword;

class Parent {
	public static void staticMethod() {
		System.out.println("Parent staticMethod");
	}
}

class Child extends Parent {
	public static void staticMethod() {
		System.out.println("Child staticMethod");
	}
}

public class Static6MethodOverriding extends Parent {

	public static void main(String[] args) {
		// Parent class Object with a reference of childclass
		Parent parent = new Child();
		// no rum time polymorphism parent class method will be called
		parent.staticMethod();
		
//		To call child class method
//		Child.staticMethod();
	}
}
