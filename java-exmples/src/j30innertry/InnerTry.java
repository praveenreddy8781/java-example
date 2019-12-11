package j30innertry;

//Java nested try statement example

//the better way to design nested try statements in Java exception handling is to look 
//for the code sections which are more likely to throw any specific exception and wrap 
//those specific blocks in a try-catch block that can handle that exception and overall 
//code can be wrapped in more general try-catch block.
public class InnerTry {
	public static void main(String[] args) {
		try {
			System.out.println("Outer try block");
			try {
				System.out.println("Inner try block");

				int a = 7;
				int b = 0;

				if (a > 7)
					throw new IllegalArgumentException();

				int r = a / b;
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException caught");
			} finally {
				System.out.println("Inner finally block");
			}
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException caught");
		} finally {
			System.out.println("Outer finally block");
		}
	}
}
