import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		int n  = 5;
		int k = 3;
		
		int arr[] = {25,5,17,10,45};
		List<Integer> mainList = new ArrayList<Integer>(arr.length);
		
		List<Integer> intList = new ArrayList<Integer>(arr.length);
		for (int i : arr)
		{
		    intList.add(i);
		    mainList.add(i);
		}
		
		Collections.sort(intList);
		Collections.sort(intList, Collections.reverseOrder());
		
		System.out.println(intList);
		
		List<Integer> highestScores = intList.subList(0, k);
		
		System.out.println(highestScores);
		
		int[] result  = new int[k];
		int indx = 0;
		for(int val: highestScores) {
			int index = mainList.indexOf(val) + 1;
			result[indx] = index;
			
			indx++;
		}
		
		System.out.println(Arrays.toString(result));
	}
}
