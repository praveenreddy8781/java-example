package j63collectionframework;

import java.util.SortedSet;
import java.util.TreeSet;

public class Pr3SortedSetDemo {

	public static void main(String[] args) {

		SortedSet<String> sortedSet = new TreeSet<String>();

//		SortedSet extends set interface 
//		SortedSet->set->Collection->Iterable
//		sortedSet contains all the methods from Collection, Iterable interfaces and its own methods

//		add(E), addAll(c)
		sortedSet.add("E5");
		sortedSet.add("E3");
		sortedSet.add("E2");
		sortedSet.add("E1");
		sortedSet.add("E7");
		sortedSet.add("E6");

//		display elements of sortedSet
		System.out.println("sortedSet: " + sortedSet);

//		Allow one null value
//		System.out.println("Allow null sortedSet.add(null): " + sortedSet.add(null));
//		System.out.println("sortedSet: " + sortedSet);

//		sortedset methods
//		comparator()
		System.out.println("sortedSet.comparator(): " + sortedSet.comparator());

//		E first()
		System.out.println("sortedSet.first(): " + sortedSet.first());

//		E last()
		System.out.println("sortedSet.last(): " + sortedSet.last());

		System.out.println("sortedSet: " + sortedSet);

//		SortedSet<E> headSet(end)
		SortedSet<String> headSet = sortedSet.headSet("E6");
		System.out.println("sortedSet.headSet(\"E6\"): " + headSet);

//		SortedSet<E> tailSet(srt)
		SortedSet<String> tailSet = sortedSet.tailSet("E3");
		System.out.println("sortedSet.tailSet(\"E3\"): " + tailSet);

//		subSet(start, end)
		SortedSet<String> subSet = sortedSet.subSet("E2", "E6");
		System.out.println("sortedSet.subSet(\"E2\", \"E6\")" + subSet);

//		headSet(), tailSet(), subSet() elements are being referred by the the source sortedset
		System.out.println("headSet.clear(): ");
		headSet.clear();

		System.out.println("headSet: " + headSet);
		System.out.println("tailSet: " + tailSet);
		System.out.println("subSet: " + subSet);

		System.out.println("sortedSet: " + sortedSet);
	}
}
