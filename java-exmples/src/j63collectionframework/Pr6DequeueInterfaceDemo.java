package j63collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Pr6DequeueInterfaceDemo {

	public static void main(String[] args) {

		Deque<String> dequeue = new ArrayDeque<String>();

		dequeue.add("E1");
		dequeue.add("E2");
		dequeue.add("E3");
		dequeue.add("E4");
		dequeue.add("E5");

		System.out.println("dequeue: " + dequeue);
//		Dequeue -> Queue->Collection->Iterable
//		It contains all the methods of queue and its own

//		addFirst("E")
		dequeue.addFirst("E");
		System.out.println("dequeue.addFirst(\"E\"): " + dequeue);

//		addLast("E6")
		dequeue.addLast("E6");
		System.out.println("dequeue.addLast(\"E6\"): " + dequeue);

//		descendingIterator()
		Iterator<String> dItr = dequeue.descendingIterator();
		System.out.println("dequeue.descendingIterator(): ");
		while (dItr.hasNext()) {
			System.out.print(dItr.next() + " ");
		}

		System.out.println();

//		element()
		String element = dequeue.element();
		System.out.println("element(): " + element);
		
//		getFirst()
		System.out.println("dequeue.getFirst(): " + dequeue.getFirst());
		
//		getLast()
		System.out.println("dequeue.getLast(): " + dequeue.getLast());
		
		
	}

}
