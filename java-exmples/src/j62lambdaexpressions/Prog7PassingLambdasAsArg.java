package j62lambdaexpressions;

interface StringFun {
	String func(String n);
}

public class Prog7PassingLambdasAsArg {

	public static void main(String[] args) {
		String inStr = "Lambdas add power to java";
		String outStr;

		outStr = strOperation((str) -> str.toUpperCase(), inStr);

		System.out.println("The string in uppercase : " + outStr);

		outStr = strOperation((str) -> {
			String result = "";
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != ' ') {
					result += str.charAt(i);
				}
			}
			return result;
		}, inStr);

		System.out.println("The string with space removed : " + outStr);

		outStr = strOperation((str) -> {
			String result = "";

			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		}, inStr);

		System.out.println("The string reversed : " + outStr);

	}

	static String strOperation(StringFun sf, String str) {
		return sf.func(str);
	}
}
