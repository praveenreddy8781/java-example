package j34throw;

//Java example program using throw keyword
public class ThrowDemo {

	public static void main(String[] args) {
		try {
			displayValue();
			System.out.println("if exception it does get executed");
		} catch (NullPointerException e) {
			System.out.println("Exception caught in main()");
			e.printStackTrace();
		}

		System.out.println("After handling the exception");

	}

	private static void displayValue() {
		try {
//			Create a new one using the new operator.
			throw new NullPointerException();
//			throw new ArithmeticException();//Unreachable code
		} catch (NullPointerException e) {
			System.out.println("Exception caught in displayValue()");
//			By using the Exception parameter of catch block.
			throw e;
		}
	}
}
