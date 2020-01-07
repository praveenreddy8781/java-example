package j62lambdaexpressions;

//lambda expression without parameter
interface MyNumber {
	double getNum();
}

public class Prog1LambdaExpressionDemo {

	public static void main(String[] args) {

		MyNumber myNum1 = () -> 123.45;
		System.out.println("A fixed value: " + myNum1.getNum());

		myNum1 = () -> Math.random() * 100;
		System.out.println("Another random number: " + myNum1.getNum());

//		myNum1 = () -> "123.45"; //Type mismatch: cannot convert from String to double
	}
}
