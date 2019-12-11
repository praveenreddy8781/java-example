package j32multiplecatchblockrestriction;

//Restriction with Multiple catch blocks in Java
public class MultipleCatchBlockRestriction {

	public static void main(String[] args) {
		calculate(0);

		calculate(1);
	}

	public static void calculate(int index) {
		int[] arr = { 0 };

		try {
			int result = 7 / arr[index];
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Genaric Exception");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero");
			e.printStackTrace();
		}

//		Unreachable catch block for ArithmeticException. It is already handled by the catch block 
//		for Exception
	}
}
