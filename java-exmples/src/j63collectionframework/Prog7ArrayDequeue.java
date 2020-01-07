package j63collectionframework;

import java.util.ArrayDeque;

public class Prog7ArrayDequeue {

	public static void main(String[] args) {

		ArrayDeque<String> stack = new ArrayDeque<String>();

		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		stack.push("F");

		System.out.println("Popping the stack: ");

		while (stack.peek() != null) {
			System.out.print(stack.pop() + " ");
		}

		ArrayDeque<String> queue = new ArrayDeque<String>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		queue.add("E");
		queue.add("F");

		System.out.println("\n poll from queue: ");

		while (queue.peek() != null) {
			System.out.print(queue.poll() + " ");
		}

	}

}
