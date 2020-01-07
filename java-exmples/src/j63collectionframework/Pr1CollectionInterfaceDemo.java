package j63collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class Pr1CollectionInterfaceDemo {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList<String>();
		System.out.println("Initial collection: " + collection);

//		to add elements: add(), addAll()
		boolean flag = collection.add("Element1");

		System.out.println("collection.add(\"Element1\"): " + flag);

		collection.add("Element2");
		collection.add("Element3");
		collection.add("Element4");
		collection.add("Element5");
		collection.add("Element6");

		System.out.println("After adding elements in collection: " + collection);
		System.out.println("collection.size(): " + collection.size());

//		contains(), containsAll()
		System.out.println("collection.contains(\"Element4\"): " + collection.contains("Element4"));

		Collection<String> collection2 = new ArrayList<String>();
		collection2.add("Element1");
		collection2.add("Element2");
		collection2.add("Element3");
		collection2.add("Element4");
		collection2.add("Element5");
//		collection2.add("Element6");
//		collection2.add("Element7");
		
		System.out.println("collection2: " + collection2);
		
		System.out.println("collection.containsAll(collection2): " + collection.containsAll(collection2));

//		equals() from Object
		System.out.println("collection.equals(collection2): " + collection.equals(collection2));

//		forEach() from Iterable
		System.out.print("Using forEach(): ");
		collection.forEach((str) -> System.out.print(str + " "));

//		getClass() from Object
		System.out.println("\ncollection.getClass(): " + collection.getClass());

//		hashCode() from Object
		System.out.println("collection.hashCode(): " + collection.hashCode());
		System.out.println("collection2.hashCode(): " + collection2.hashCode());

//		isEmpty()
		System.out.println("collection.isEmpty(): " + collection.isEmpty());

//		iterator()
		System.out.print("Using Iterator: ");
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

//		remove() , removeAll(), removeIf()
		System.out.println("\ncollection.remove(\"Element1\"): " + collection.remove("Element1"));
		System.out.println("collection: " + collection);
		
		System.out.println("collection.removeAll(collection2): " + collection.removeAll(collection2));
		System.out.println("collection: " + collection);

		Predicate<String> predicate = (str) -> {
			return str.endsWith("6");
		};
		System.out.println("removeIf(): " + collection.removeIf(predicate));

		System.out.println("collection: " + collection);

//		Again add few elements
		collection.add("Element2");
		collection.add("Element3");
		collection.add("Element4");

		System.out.println("Added few elements");
		System.out.println("collection: " + collection);
		System.out.println("collection2: " + collection2);

//		retainAll()
		System.out.println("collection2.retainAll(collection): " + collection2.retainAll(collection));

		System.out.println("collection: " + collection);
		System.out.println("collection2: " + collection2);

//		spliterator()

//		toArray(), toArray(arr)
		Object[] objects = collection.toArray();
		System.out.println("toArray(): " + Arrays.toString(objects));

		String[] strings = new String[collection.size()];
		System.out.println("collection.toArray(strings): " + Arrays.toString(collection.toArray(strings)));

//		toString()
		System.out.println("collection.toString(): " + collection.toString());

//		clearing elements from the collection
		collection.clear();
		System.out.println("After clearing elements from collection: " + collection);
		System.out.println("size of the collection: " + collection.size());

	}
}
