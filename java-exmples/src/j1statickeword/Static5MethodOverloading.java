package j1statickeword;

public class Static5MethodOverloading {

	public static void staticMethod() {
		System.out.println("staticMethod called 1");
	}

//	Duplicate method staticMethod() in type StaticMethodOverloading
//	not overridden method
//	public static int staticMethod() {
//		System.out.println("staticMethod called 1");
//		return 0;
//	}

//	Duplicate method staticMethod() in type StaticMethodOverloading
//	Two methods with one as static and one normal instance method are also not considered to be overloaded methods
//	public static  staticMethod() {
//		System.out.println("staticMethod called 1");
//	}
	
	public static void staticMethod(int i) {
		System.out.println("staticMethod called 2: " + i);
	}
	
	public static void staticMethod(int i, int j) {
		System.out.println("staticMethod called 3: " + i + " " + j);
	}
	
	public static void staticMethod(Integer i) {
		System.out.println("staticMethod called 4: " + i);
	}
	
	public static void staticMethod(String s) {
		System.out.println("staticMethod called 5: " + s);
	}
	
	public static void main(String[] args) {
		
		Static5MethodOverloading.staticMethod();
		
		Static5MethodOverloading.staticMethod(100);
		
		Static5MethodOverloading.staticMethod(100, 200);
		
		Static5MethodOverloading.staticMethod(Integer.valueOf(200));
		
		Static5MethodOverloading.staticMethod("static");

	}

}
