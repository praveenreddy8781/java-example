package j63collectionframework;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return o2.compareTo(o1);
	}

}

public class Prog13Comparator {

	public static void main(String[] arg0s) {

		MyComp comp = new MyComp();

		TreeSet<String> treeSet = new TreeSet<String>(comp);

//		TreeSet<String> treeSet = new TreeSet<String>(comp.reversed());

//		TreeSet<String> treeSet = new TreeSet<String>((o1, o2) -> o2.compareTo(o1));

		treeSet.add("C");
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("E");
		treeSet.add("F");
		treeSet.add("D");

		for (String element : treeSet) {
			System.out.println(element + " ");
		}

		System.out.println();
	}
}
