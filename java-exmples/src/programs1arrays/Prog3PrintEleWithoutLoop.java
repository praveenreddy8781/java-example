package programs1arrays;

import java.util.Arrays;

public class Prog3PrintEleWithoutLoop {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(Arrays.toString(arr));

//		print(arr, 0);
	}

	private static void print(int[] arr, int index) {
		if (index < arr.length) {
			System.out.println(arr[index]);
			index = index + 1;
			print(arr, index);
		}
	}
}
