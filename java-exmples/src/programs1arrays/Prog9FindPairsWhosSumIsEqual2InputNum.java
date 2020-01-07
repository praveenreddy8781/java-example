package programs1arrays;

import java.util.Arrays;

public class Prog9FindPairsWhosSumIsEqual2InputNum {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 7, 11, 9, 13, 8, 12 };

//		new int[] {4, 6, 5, -10, 8, 5, 20}, 10
//		
//		new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20
//		
//		new int[] {12, 13, 10, 15, 8, 40, -15}, 25
//		
//		new int[] {12, 23, 10, 41, 15, 38, 27}, 50
	        
		int size = arr.length;

		int inputSum = 20;

//		for loops: O(n^2)
		method1UsingBruteForce(arr, size, inputSum);

//		Alternate method: O(nlogn) : works only for sorted arrays
		method2AlternateMethod(arr, size, inputSum);
	}

	private static void method2AlternateMethod(int[] arr, int size, int inputSum) {
		System.out.println("method2AlternateMethod::: O(nlogn)");
		Arrays.sort(arr);

		int i = 0 ;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] == inputSum) {
				System.out.println(arr[i] + " + " + arr[j] + " = " + inputSum);
				i++;
				j--;
			} else if (arr[i] + arr[j] < inputSum) {
				i++;
			} else if (arr[i] + arr[j] > inputSum){
				j--;
			}
		}
	}

	private static void method1UsingBruteForce(int[] arr, int size, int inputSum) {
		System.out.println("method1UsingBruteForce::: O(n^2)");
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				int num1 = arr[i];
				int num2 = arr[j];
				int sum = num1 + num2;

				if (sum == inputSum) {
					System.out.println(num1 + " + " + num2 + " = " + sum);
				}
			}
		}
	}
}
