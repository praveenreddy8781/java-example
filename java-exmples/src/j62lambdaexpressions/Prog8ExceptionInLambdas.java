
package j62lambdaexpressions;

interface DoubleNUmericArrayFunc {
	double fun(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
	public EmptyArrayException() {
		super("Array is empty");
	}
}

public class Prog8ExceptionInLambdas {

	int num = 10;
	
	public static void main(String[] args) {

		double[] values = { 1.0, 2.0, 3.0, 4.0 };

		DoubleNUmericArrayFunc avreage = (n) -> {
			double sum = 0;
			if (n.length == 0) {
				throw new EmptyArrayException();
			}

			for (int i = 0; i < n.length; i++) {
				sum += i;
			}
			return sum / n.length;
		};

		try {
			System.out.println("The avreage is: " + avreage.fun(values));
		} catch (EmptyArrayException e) {
			e.printStackTrace();
		}
	}

}
