package j62lambdaexpressions;

interface StringFunc1 {
	String func(String str);
}

class MyStringOps {
	static String strReverse(String str) {
		String result = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
	
	String strReverse2(String str) {
		String result = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}
}

public class Prog9MethodReferenceToStaticOrInstanceMethod {

	public static void main(String[] args) {
		String inStr = "Lambdas add power to java";
		String outStr = "";

//		Method ref to static method
		outStr = stringOp(MyStringOps::strReverse, inStr);
		
//		Method ref to instance method
//		outStr = stringOp(new MyStringOps()::strReverse2, inStr);

		System.out.println("Original string :" + inStr);
		System.out.println("Reversed string :" + outStr);
	}

	private static String stringOp(StringFunc1 sf, String inStr) {
		return sf.func(inStr);
	}
}
