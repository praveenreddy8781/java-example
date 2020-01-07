package j62lambdaexpressions;

interface NumericFact {
	int fact(int n);
}

public class Prog4BlockLambdas {

	public static void main(String[] args) {
		NumericFact factorial = (n) -> {
			int result = 1;

			for (int i = 1; i <= n; i++) {
				result = i * result;
			}

			return result;
		};

		System.out.println("Factorial of 3: " + factorial.fact(3));
		System.out.println("Factorial of 5: " + factorial.fact(5));
	}
}
