package programs1arrays;

public class Prog7SecondLargestNum {

	public static void main(String[] args) {
		int input[] = { 10, 5, 3, 4, 11, 12 };
		int size = input.length;

		int firstLargest = 0;
		int secondLargest = 0;

		if (input[0] > input[1]) {
			firstLargest = input[0];
			secondLargest = input[1];
		} else {
			secondLargest = input[0];
			firstLargest = input[1];
		}

		for (int i = 2; i < size; i++) {
			if (input[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = input[i];
			} else if (input[i] < firstLargest && input[i] > secondLargest) {
				secondLargest = input[i];
			}
		}

		System.out.println("Second Largest number is : " + secondLargest);
	}

}
