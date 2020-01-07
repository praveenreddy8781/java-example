package j62lambdaexpressions;

interface SomeFunc<T> {
	T func(T str);
}

public class Prog6GenericFunctionalInterface {

	public static void main(String[] args) {
		SomeFunc<Integer> factorial = (n) -> {
			int result = 1;

			for (int i = 1; i <= n; i++) {
				result = i * result;
			}

			return result;
		};

		System.out.println("Factorial of 3: " + factorial.func(3));
		System.out.println("Factorial of 5: " + factorial.func(5));

		SomeFunc<String> revString = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}

			return result;
		};

		System.out.println("Lambda reversed is : " + revString.func("Lambda"));
		System.out.println("Lambda reversed is : " + revString.func("Expressions"));
	}
}
