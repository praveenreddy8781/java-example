package j29finallyblock;

public class FinallyBlock {

	public static void main(String[] args) {
		int i = displayValue();

		System.out.println("value of i = " + i);

	}

	public static int displayValue() {
		try {
			System.out.println("In try block");

//			System.exit(0);

//			if(true)
//			throw new Exception();

			return 1;

		} catch (Exception e) {
			System.out.println("In catch block");
			return 2;
		} finally {
			System.out.println("In finally block");
			return 3;
		}
	}
}
