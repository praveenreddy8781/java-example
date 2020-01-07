package programs1arrays;

import java.util.Arrays;

public class Prog8EqualityCheckOf2Arrays {

	public static void main(String[] args) {
		int[] arrayOne = { 21, 57, 11, 37, 24 };

		int[] arrayTwo = { 21, 57, 11, 37, 24};

		boolean isEqual = false;

		isEqual = method1Iterative(arrayOne, arrayTwo);

		if (isEqual) {
			System.out.println("arrays are equal? : " + isEqual);
		} else {
			System.out.println("arrays are equal? : " + isEqual);
		}
		
		isEqual = method2UsingArraysEquals(arrayOne, arrayTwo);
		
		if (isEqual) {
			System.out.println("arrays are equal? : " + isEqual);
		} else {
			System.out.println("arrays are equal? : " + isEqual);
		}

	}

	private static boolean method2UsingArraysEquals(int[] arrayOne, int[] arrayTwo) {
		System.out.println("method2UsingArraysEquals:::");
		return Arrays.equals(arrayOne, arrayTwo);
	}

	private static boolean method1Iterative(int[] arrayOne, int[] arrayTwo) {
		System.out.println("method1Iterative:::");
		boolean flag = false;
		if (arrayOne.length == arrayTwo.length) {
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) {
					flag = false;
					break;
				} else {
					flag = true;
				}
			}
		} else {
			flag = false;
		}
		return flag;
	}

}
