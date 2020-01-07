package j62lambdaexpressions;

//lambda expression with 2 parameter
interface NumericTest2 {
	boolean test(int a, int b);
}

public class Prog3LambdaExpressionDemo {

	public static void main(String[] args) {

		NumericTest2 isFactor = (a, b) -> (a % b) == 0;

		if (isFactor.test(10, 2)) {
			System.out.println("2 is a factor of 10");
		}

		if (!isFactor.test(10, 3)) {
			System.out.println("3 is not factor of 10");
		}
	}
}
