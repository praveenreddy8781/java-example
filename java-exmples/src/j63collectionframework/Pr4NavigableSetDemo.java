package j63collectionframework;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Pr4NavigableSetDemo {

	public static void main(String[] args) {

		NavigableSet<String> navigableSet = new TreeSet<String>();

//		NavigableSet -> SortedSet -> Set -> Collection -> Iterable
//		NavigableSet contains all the methods of SortedSet and its own

//		adding elements
		navigableSet.add("E4");
		navigableSet.add("E1");
		navigableSet.add("E3");
		navigableSet.add("E2");
		navigableSet.add("E6");
		navigableSet.add("E5");
		navigableSet.add("E8");

//		doen't allow duplicates
		System.out.println("Duplicate navigableSet.add(\"E5\") : " + navigableSet.add("E5"));

		System.out.println("navigableSet: " + navigableSet);
		System.out.println("navigableSet.size(): " + navigableSet.size());

//		contains()
		System.out.println("navigableSet.contains(\"E10\"): " + navigableSet.contains("E10"));

//		NavigableSet methods

//		ceiling("E7")
		String ceiling = navigableSet.ceiling("E7");
		System.out.println("navigableSet.ceiling(\"E7\"): " + ceiling);

//		floor("E7")
		String floor = navigableSet.floor("E7");
		System.out.println("navigableSet.floor(\"E7\"): " + floor);

//		descendingIterator()
		System.out.println("navigableSet.descendingIterator(): ");
		Iterator<String> descItr = navigableSet.descendingIterator();
		while (descItr.hasNext()) {
			System.out.println(descItr.next());
		}

//		descendingSet()
		NavigableSet<String> descNavigableSet = navigableSet.descendingSet();
		System.out.println("navigableSet.descendingSet(): " + descNavigableSet);

//		headSet("E5")
		SortedSet<String> headSet = navigableSet.headSet("E5");
		System.out.println("navigableSet.headSet(\"E5\"): " + headSet);

//		navigableSet.headSet("E5", true)
		SortedSet<String> headSetInclusive = navigableSet.headSet("E5", true);
		System.out.println("navigableSet.headSet(\"E5\", true): " + headSetInclusive);

//		higher("E6")
		String higher = navigableSet.higher("E6");
		System.out.println("navigableSet.higher(\"E6\"): " + higher);

//		lower("E6")
		String lower = navigableSet.lower("E6");
		System.out.println("navigableSet.lower(\"E6\"): " + lower);

//		pollFirst()
		String pollFirst = navigableSet.pollFirst();
		System.out.println("navigableSet.pollFirst():" + pollFirst);

		System.out.println("navigableSet: " + navigableSet);

//		pollLast()
		String pollLast = navigableSet.pollLast();
		System.out.println("navigableSet.pollLast(): " + pollLast);

		System.out.println("navigableSet: " + navigableSet);

//		subSet("E4", "E7")
		SortedSet<String> subSet = navigableSet.subSet("E4", "E6");
		System.out.println("navigableSet.subSet(\"E4\", \"E6\"):" + subSet);

//		subSet("E4", true, "E7", true)
		SortedSet<String> subSetInclusive = navigableSet.subSet("E4", true, "E6", true);
		System.out.println("navigableSet.subSet(\"E4\", true, \"E6\", true): " + subSetInclusive);

//		tailSet("E6")
		SortedSet<String> tailSet = navigableSet.tailSet("E4");
		System.out.println("navigableSet.tailSet(\"E4\"): " + tailSet);

//		tailSet("E4", false)
		SortedSet<String> tailSetInclusive = navigableSet.tailSet("E4", false);
		System.out.println("navigableSet.tailSet(\"E4\", false): " + tailSetInclusive);
	}
}
