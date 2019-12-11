package j33exceptionpropagation;

import java.io.FileNotFoundException;

//Exception propagation in Java with checked exception
public class ExceptionPropagation2 {

	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		System.out.println("called method1");
		try {
			method2();
		} catch (FileNotFoundException e) {
			System.out.println("Handling exception in method1");
			e.printStackTrace();
		}
	}

	private static void method2() throws FileNotFoundException {
		System.out.println("called method2");

		method3();
	}

	private static void method3() throws FileNotFoundException {
		System.out.println("called method3");
		throw new FileNotFoundException();
	}

}
