package programs1arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog5RemovingSpecifiedELe {

	public static void main(String[] args) {
		int[] arr = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
		int key = 3;

//		1st Method
		
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != key) {
				arr[index++] = arr[i];
			}
		}

		arr = Arrays.copyOf(arr, index);
		System.out.println(Arrays.toString(arr));
		
//		2nd Method
		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for(Integer ele:arr) {
//			if(ele != key) {
//				list.add(ele);
//			}
//		}
//		
//		Object[] newArr = list.toArray();
//		System.out.println(Arrays.toString(newArr));
	}

}
