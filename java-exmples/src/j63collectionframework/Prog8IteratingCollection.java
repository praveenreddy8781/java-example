package j63collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Prog8IteratingCollection {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Element1");
		al.add("Element2");
		al.add("Element3");
		al.add("Element4");
		al.add("Element5");
		al.add("Element6");
		al.add("Element7");

		System.out.print("Original contents: ");
//		Iterator
		Iterator<String> iterator = al.iterator();
//		while (iterator.hasNext()) {
//			String ele = iterator.next();
//			System.out.print(ele + " ");
//		}

		iterator.forEachRemaining((str) -> System.out.print(str + " "));

		System.out.println();

//		ListIterator: modify collection
		ListIterator<String> listIterator = al.listIterator();
		while (listIterator.hasNext()) {
			String element = listIterator.next();
			listIterator.set(element + "+");
		}

		System.out.print("Modified contents of al: ");
		iterator = al.iterator();
		while (iterator.hasNext()) {
			String ele = iterator.next();
			System.out.print(ele + " ");
		}

		System.out.println();

//		Display the list backword
		System.out.print("Display the list backward: ");

		while (listIterator.hasPrevious()) {
			String element = listIterator.previous();
			System.out.print(element + " ");
		}
	}
}
