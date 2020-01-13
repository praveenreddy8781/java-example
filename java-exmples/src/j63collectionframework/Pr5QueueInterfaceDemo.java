package j63collectionframework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Pr5QueueInterfaceDemo {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
//	Queue -> Collection -> Iterable
//		Queue contains all the methods from Collection, Iterable interface and have its own methods

		queue.add("E1");
		queue.add("E2");
		queue.add("E3");
		queue.add("E4");
		queue.add("E5");

		System.out.println("queue: " + queue);

//		Methods of Queue
//		element()
		String element = queue.element();
		System.out.println("queue.element(): " + element);
		System.out.println("queue: " + queue);

//		offer("E6")
		queue.offer("E6");
		System.out.println("queue.offer(\"E6\"): " + queue);

//		peek()
		String peek = queue.peek();
		System.out.println("queue.peek(): " + peek);
		System.out.println("queue: " + queue);

//		poll()
		String poll = queue.poll();
		System.out.println("queue.poll(): " + poll);
		System.out.println("queue: " + queue);

//		remove()
		String elementRemoved = queue.remove();
		System.out.println("queue.remove(): " + elementRemoved);
		System.out.println("queue: " + queue);
	}

}
