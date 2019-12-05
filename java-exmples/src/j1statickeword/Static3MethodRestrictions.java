package j1statickeword;

public class Static3MethodRestrictions {
	int i = 10;

	private static void staticMethod() {
		System.out.println("staticMethod called");

//		2. this or super can't be used in static method
//		System.out.println(this);
	}

	private void nonStaticMethod() {
		System.out.println("nonStaticMethod called");

		System.out.println(this);
	}

	public static void main(String[] args) {
//		1. static method can directly call the other static method
		staticMethod();

//		nonStaticMethod(); // Compile time error
//		System.out.println(i); // Compile time error
	}
}
