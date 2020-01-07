package j63collectionframework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Prog6PriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

		priorityQueue.add("Element1");
		priorityQueue.add("Element3");
		priorityQueue.add("Element4");
		priorityQueue.add("Element2");
		priorityQueue.add("Element5");

		priorityQueue.add("Element5");

//		priorityQueue.add(null); //Exception in thread "main" java.lang.NullPointerException

		System.out.println("priorityQueue: " + priorityQueue);

//		Iterating
		Iterator<String> itr = priorityQueue.iterator();
		System.out.println("Iterating : order is undefined");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("offer Element6: " + priorityQueue.offer("Element6"));

		System.out.println("priorityQueue: " + priorityQueue);

		System.out.println("element: " + priorityQueue.element());

		System.out.println("priorityQueue: " + priorityQueue);

		System.out.println("peek: " + priorityQueue.peek());

		System.out.println("priorityQueue: " + priorityQueue);

		System.out.println("poll : " + priorityQueue.poll());

		System.out.println("priorityQueue: " + priorityQueue);

		System.out.println("remove : " + priorityQueue.remove());

		System.out.println("priorityQueue: " + priorityQueue);
	}
}
