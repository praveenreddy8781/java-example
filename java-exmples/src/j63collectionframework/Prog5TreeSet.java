package j63collectionframework;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Prog5TreeSet {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();

		treeSet.add("Element1");
		treeSet.add("Element2");
		treeSet.add("Element4");
		treeSet.add("Element5");
		treeSet.add("Element6");
		treeSet.add("Element7");

		treeSet.add("Element7");

//		treeSet.add(null); //Exception in thread "main" java.lang.NullPointerException

		System.out.println("treeSet: " + treeSet);

		String ceilingString = treeSet.ceiling("Element3");
		System.out.println("ceilingString of Element3: " + ceilingString);

		String floorString = treeSet.floor("Element3");
		System.out.println("floorString of Element3: " + floorString);

		String firstEle = treeSet.first();
		System.out.println("firstEle: " + firstEle);

		String lastELe = treeSet.last();
		System.out.println("lastELe: " + lastELe);

		Iterator<String> dItr = treeSet.descendingIterator();
		System.out.println("Iterate using descenting Iterator: ");
		while (dItr.hasNext()) {
			System.out.println(dItr.next());
		}

		Set<String> descSet = treeSet.descendingSet();
		System.out.println("descSet: " + descSet);

		SortedSet<String> headSet = treeSet.headSet("Element5");
		System.out.println("headSet of Element5: " + headSet);

		SortedSet<String> tailSet = treeSet.tailSet("Element5");
		System.out.println("tailSet of Element5: " + tailSet);

		System.out.println("treeSet: " + treeSet);
		SortedSet<String> subSet = treeSet.subSet("Element4", "Element7");
		System.out.println("subSet: " + subSet);

		System.out.println("Element5: " + treeSet.lower("Element5"));

		System.out.println("Element5: " + treeSet.higher("Element5"));
	}
}
