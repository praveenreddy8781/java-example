package j61generics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Functional Interface
interface NumericFun {
	int func(int n);
}

//Functional Interface
interface DoubleFun {
	double func();
}

//Generic Functional Interface
interface GenricFun<T> {
	T func(T t);
}

//Generic Functional Interface
interface MinMax1<T extends Comparable<T>> {
	T min();

	T max();
}

interface GenricFileFun<T> {
	int func(T t) throws IOException;
}

public class ProgFinalVersionOfGenerics {

	int instanceVar = 10;

	static int staticVar = 10;

	static int evenOdd(NumericFun lambdaRef, int num) {
		return lambdaRef.func(num);
	}

	public static void main(String[] args) {

		int localVar = 10;

//		Lambda expression
		DoubleFun doubleFun = () -> Math.random() * 100;

		System.out.println("Printing random number: " + doubleFun.func());

//		Lambda block
		NumericFun factorialFun = (n) -> {
			int result = 1;

			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		};

		System.out.println("Factorial of 3 : " + factorialFun.func(3));

		System.out.println("Factorial of 5 : " + factorialFun.func(5));

//		Lambda block to find factorial using generic interface
		GenricFun<Double> factorialGenricFun = (n) -> {
			double result = 1;

			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		};

		System.out.println("Factorial of 3 using generic interface: " + factorialGenricFun.func(Double.valueOf(3)));

		System.out.println("Factorial of 5 using generic interface: " + factorialGenricFun.func(5d));

//		Lambda block to find reverse of a string using generic interface
		GenricFun<String> strRevFun = (str) -> {
			StringBuffer revStr = new StringBuffer();

			for (int i = str.length() - 1; i >= 0; i--) {
				revStr.append(str.charAt(i));
			}
			return revStr.toString();
		};

		System.out.println("Reverse Lambda using generic interface: " + strRevFun.func("Lambda"));

//		Passing lambda to a method
		int count = evenOdd((n) -> {
			if (n % 2 == 0) {
				return 1;
			} else {
				return 0;
			}
		}, 19);

		System.out.println("is 19 even : " + (count == 1 ? true : false));

//		or Passing functional interface ref to a method
		NumericFun evenOddFunIntrfcRef = (n) -> {
			if (n % 2 == 0) {
				return 1;
			} else {
				return 0;
			}
		};

		count = evenOdd(evenOddFunIntrfcRef, 10);
		System.out.println("is 10 even : " + (count == 1 ? true : false));

//		Lambda expression and exception
		GenricFileFun<String> readFileFun = (fileName) -> {

			int result = 0;

//			throwing unchecked exception (Hence it must be listed in the exception list of abstract method)
			if (fileName == null || fileName.equals("")) {
				throw new FileNotFoundException("File is not found in the specified directory");
			}

			try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

				String val = br.readLine();

//				throw unchecked exception
				if (Integer.valueOf(val) == 0) {
					throw new ArithmeticException("Divide by zero: file contains zero value");
				}

				result = 1000 / Integer.valueOf(val);

			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

			return result;
		};

		try {
			System.out.println("divisor is used from file and calculated result : "
					+ readFileFun.func("D:\\workspace\\java-example\\java-exmples\\test.txt"));
		} catch (IOException e) {

			e.printStackTrace();
		}

//		Expression and variable capture
		NumericFun numericFun = (n) -> {
			ProgFinalVersionOfGenerics obj = new ProgFinalVersionOfGenerics();

			obj.instanceVar = 100;
			System.out.println("instanceVar :: " + obj.instanceVar);

			staticVar = 100;
			System.out.println("staticVar :: " + staticVar);

//			localVar = 100; //Local variable localVar defined in an enclosing scope must be final or effectively final

			return n + obj.instanceVar + staticVar;
		};

		System.out.println("Expression and variable capture: " + numericFun.func(100));
	}
}
