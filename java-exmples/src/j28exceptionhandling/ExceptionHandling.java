package j28exceptionhandling;

//Exception Handling sample example
public class ExceptionHandling {

	public static void main(String[] args) {
//		throwing to the caller i.e jvm
//		method1();

		try {
//			Handling the exception using try catch block and printing the exception details
//			next statements gets executed
			method1();
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println("Divide by zero");
		} finally {
			System.out.println("Finally block executed");
		}

		System.out.println("After exception is thrown");
	}

	public static void method1() throws Exception {
//		throwing to the caller
		method2();
	}

	public static void method2() throws Exception {

//		int a = 2;

		int a = 1;
		int b = 10;

//		Preparing an exception object and throwing to the caller
		if (a == 0)
			throw new Exception("a = 0 in method2 : java.lang.ArithmeticException: / by zero");

		int result = b / a;

		System.out.println(result);
	}

}
