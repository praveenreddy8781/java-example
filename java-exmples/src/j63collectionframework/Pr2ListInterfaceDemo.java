package j63collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Pr2ListInterfaceDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

//		As it extends collection: list contains all collection methods
//		add(e), addAll(c)
		list.add("Element1");
		list.add("Element3");
		list.add("Element2");
		list.add("Element5");
		list.add("Element4");
		list.add("Element6");

//		Accessed in sequential order: 
		System.out.println("Accessed in sequential oreder: " + list);

//		add duplicate elements:
		list.add("Element6");
		System.out.println("Added duplicate element: " + list);

//		Added null values
		System.out.println("Nulls allowed: " + list.add(null));
		System.out.println("list: " + list);

//		Methods specific to list
//		add(index, E)
		list.add(3, "Element7");
		System.out.println("list.add(3, \"Element7\"): " + list);

//		get(index)
		System.out.println("list.get(4): " + list.get(4));

//		indexOf(), lastIndexOf()
		System.out.println("list.indexOf(\"Element5\"): " + list.indexOf("Element5"));
		System.out.println(list.lastIndexOf("Element6"));

//		remove(index)
		System.out.println("list.remove(2): " + list.remove(2));

//		set(index, E)
		System.out.println("list.set(7, \"Elemenet8\"): " + list.set(7, "Element8"));
		System.out.println("list: " + list);

//		sort(comp)
		list.sort(Collections.reverseOrder());
		System.out.println("List after list.sort(Collections.reverseOrder()): " + list);

//		subList(start, end)
		List<String> subList = list.subList(3, 7);
		System.out.println("list.subList(3, 7): " + subList);

//		when we clear the sublist the elements will be deleted from the source list as well
		subList.clear();

		System.out.println("subList: " + subList);
		System.out.println("list: " + list);

//		iterator()
		System.out.println("Using iterator(): ");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		using listIterator()
		System.out.println("using listIterator() forward direction: ");
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("using listIterator() backward direction: ");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
