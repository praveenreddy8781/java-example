package j33exceptionpropagation;

//Exception propagation Java example with unchecked Exception
public class ExceptionPropagation1 {

	public static void main(String[] args) {
		method1();
		System.out.println("After Exception is caught!!!");
	}

	public static void method3() {
		System.out.println("called method3");
		int res = 7 / 0;
	}

	public static void method2() {
		System.out.println("called method2");
		method3();
		System.out.println("back to method2");
	}

	public static void method1() {
		System.out.println("called method1");
		try {
			method2();
			System.out.println("back to method1");
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
	}
}
