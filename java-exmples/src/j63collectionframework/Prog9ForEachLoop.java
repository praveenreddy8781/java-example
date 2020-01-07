package j63collectionframework;

import java.util.ArrayList;

public class Prog9ForEachLoop {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("Element1");
		al.add("Element2");
		al.add("Element3");
		al.add("Element4");
		al.add("Element5");
		al.add("Element6");
		al.add("Element7");

//		use for loop to display the values
		System.out.print("Contents of array list: ");
		for (String val : al) {
			System.out.print(val + " ");
		}

		System.out.println();

//		Concat the values using foreach
		String res = "";
		for (String val : al) {
			res += val;
		}

		System.out.print("After concatination: " + res);
	}

}
