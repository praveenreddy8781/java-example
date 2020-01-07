package programs1arrays;

import java.util.Arrays;

public class Prog4FindingEle {

	public static void main(String[] args) {
		int arr[] = { 77, 33, 44, 88, 9, 67, 13, 90, 9, 21 };
		int size = arr.length;

		int x = 9;

//		LinearSearch
		linearSearch(arr, size, x);

//		Binary Search
//		binarySearch(arr, size, x);

	}

	private static void binarySearch(int[] arr, int size, int x) {
		Arrays.sort(arr);

		int start = 0;
		int end = arr.length;

		while (start < end) {
			int mid = (start + end) / 2;

			if (x < arr[mid]) {
				end = mid - 1;
			} else if (x > arr[mid]) {
				start = mid + 1;
			} else {
				System.out.println("Found " + x + " at : " + mid);
				end = 0;
			}
		}
	}

	private static void linearSearch(int[] arr, int size, int x) {
		for (int i = 0; i < size; i++) {
			if (x == arr[i]) {
				System.out.println("Found " + x + " at : " + i);
			}
		}
	}
}
