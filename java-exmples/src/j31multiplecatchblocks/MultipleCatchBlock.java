package j31multiplecatchblocks;

//Multiple catch blocks Java example
public class MultipleCatchBlock {

	public static void main(String[] args) {

		calculate(0);

		calculate(1);
	}

	public static void calculate(int index) {
		int[] arr = { 0 };

		try {
			int result = 7 / arr[index];
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero");
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException");
			e.printStackTrace();
		}
	}
}
