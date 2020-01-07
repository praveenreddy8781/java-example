package j62lambdaexpressions;

interface StringFunc {
	String func(String str);
}

public class Prog5BlockLambdas {

	public static void main(String[] args) {

		StringFunc revString = (str) -> {
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
