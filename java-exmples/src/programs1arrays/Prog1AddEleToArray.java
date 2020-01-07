package programs1arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog1AddEleToArray {

	public static void main(String[] args) {
		Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

////		1. Method
////		 arr[10] = 11;
//
////		 create a new array with the size n+1
//		int[] newArr = new int[arr.length + 1];
//
////		copy old array to new array
//		for (int i = 0; i < arr.length; i++) {
//			newArr[i] = arr[i];
//		}
//		
////		add new element
//		newArr[arr.length] = 11;
//
//		for (int ele : newArr) {
//			System.out.println(ele);
//		}
//		

//		2. Method
		List<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(arr));
		arrlist.add(11);
		
		arr = arrlist.toArray(arr);
		
		for (int ele : arr) {
			System.out.println(ele);
		}
	}
}
