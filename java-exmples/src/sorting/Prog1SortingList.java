package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prog1SortingList {

	public static void main(String[] args) {
//		When we have a list with unordered names in ArrayList
		List<String> list = new ArrayList<String>();

		list.add("Naveen");
		list.add("Akash");
		list.add("Akbar");
		list.add("Babar");
		list.add("Raj");
		list.add("John");

		System.out.println("Before sort list: " + list);

		Collections.sort(list);

		System.out.println("Before sort list: " + list);
	}
}
