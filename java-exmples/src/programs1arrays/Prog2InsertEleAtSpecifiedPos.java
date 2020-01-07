package programs1arrays;

public class Prog2InsertEleAtSpecifiedPos {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int pos = 5;

		int x = 55;
//		create a new array
		int[] newArr = new int[arr.length + 1];

//		copy all ele from old array till specified pos
		for (int i = 0; i < arr.length + 1; i++) {

			if (i < pos - 1) {
				newArr[i] = arr[i];
			} else if (i == pos - 1) {
				newArr[i] = x;
			} else {
				newArr[i] = arr[i - 1];
			}
		}

		for (int ele : newArr) {
			System.out.println(ele);
		}
	}

}
