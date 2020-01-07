package j63collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pr3SetInterfaceDemo {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

//		set extends collection interface Hence it has all the methods of collection interface
//		boolean add(E)
		System.out.println("set.add(\"E1\"): " + set.add("E1"));
		set.add("E2");
		set.add("E3");
		set.add("E4");
		set.add("E5");
		set.add("E6");

//		Doesn't allow duplicate values
		System.out.println("add duplicate : set.add(\"E4\"): " + set.add("E4"));
		
//		Allow nulls
//		set.add(null);

//		display set values
		System.out.println("set: " + set);
		System.out.println("set.toString(): " + set.toString());

//		boolean contains(E), containsAll(c)
		System.out.println("set.contains(\"E5\"): " + set.contains("E5"));

//		using Iterator<E> iterator()
		System.out.println("using iterator()");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

//		remove(E), removeAll(c), removeIf(predicate)
		System.out.println("set.remove(\"E6\"): " + set.remove("E6"));
		System.out.println("set: " + set);

//		toArray()
		System.out.println("set.toArray(strArr): and get only numbers ");
		String[] strArr = new String[set.size()];
		set.toArray(strArr);
		for (String str : strArr) {
			System.out.println(str.charAt(str.length() - 1));
		}

//		No additional methods of its own
	}
}
