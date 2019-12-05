package j1statickeword;

public class Static2Method {

	public static void staticMethod() {
		System.out.println("sataticMethod called");
	}

	public static void main(String[] args) {
//		static method is called usng class name
		Static2Method.staticMethod();

	}
}
