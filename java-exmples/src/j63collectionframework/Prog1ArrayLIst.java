package j63collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Prog1ArrayLIst {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		System.out.println("Initial size of al: " + al.size());

//		Adding elements
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");

		System.out.println("size of al after additions: " + al.size());

//		Display the arraylist
		System.out.println("Contents of al: " + al);

//		remove elements from the arraylist
		al.remove("F");
		al.remove(2);

		al.ensureCapacity(20);

		al.trimToSize();

		System.out.println("size of al after deletions: " + al.size());

		System.out.println("Contents of al: " + al);

		al.set(3, "B1");

		System.out.println("size of al after modification: " + al.size());
		System.out.println("Contents of al: " + al);

		System.out.println("get 5th element: " + al.get(4));

		List<String> subList = al.subList(2, 4);
		System.out.println("subLIst: " + subList);
		System.out.println("Contents of al: " + al);

		subList.clear();
		System.out.println("After clearing subLIst: " + subList);
		System.out.println("Contents of al: " + al);

//		toArray()
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);

		System.out.println("Contents of numList: " + numList);

		Integer[] intArray = new Integer[numList.size()];
		intArray = numList.toArray(intArray);

		sumOfArrayElements(intArray);
	}

	private static void sumOfArrayElements(Integer[] intArray) {
		int sum = 0;

		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}

		System.out.println("sum of array elements : " + sum);
	}
}
