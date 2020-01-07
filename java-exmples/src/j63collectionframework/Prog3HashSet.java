package j63collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Prog3HashSet {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();

//		Adding elements
		hashSet.add("key1");
		hashSet.add("key2");
		hashSet.add("key3");
		hashSet.add("key4");

		hashSet.add("key4");

		hashSet.add(null);
		hashSet.add(null);

		System.out.println(hashSet);

		System.out.println("toStrig()" + hashSet.toString());

//		Get element
//		No get method

//		removing an element
		hashSet.remove("key1");

		System.out.println("After removing key1: " + hashSet);

//		search an element
		boolean flag = hashSet.contains("key4");

		System.out.println("hashset contains key4: " + flag);

//		convert to array
		String[] strArray = new String[hashSet.size()];
		hashSet.toArray(strArray);
		System.out.println("strArray: " + Arrays.toString(strArray));
		
//		retainAll
		System.out.println("Before retaining key4: " + hashSet);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("key4");
		hashSet.retainAll(al);
		
		System.out.println("After retaining key4: " + hashSet);
	}
}
