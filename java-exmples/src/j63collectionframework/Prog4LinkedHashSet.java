package j63collectionframework;

import java.util.LinkedHashSet;

public class Prog4LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhashSet = new LinkedHashSet<String>();

//		Adding elements
		lhashSet.add("key1");
		lhashSet.add("key2");
		lhashSet.add("key3");
		lhashSet.add("key4");

		lhashSet.add("key4");

		lhashSet.add(null);
		lhashSet.add(null);

		System.out.println(lhashSet);

		System.out.println("toStrig()" + lhashSet.toString());
	}
}
