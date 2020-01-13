package j64concurrencyutils;

import java.util.concurrent.atomic.AtomicInteger;

class Shared2 {
	static AtomicInteger ai = new AtomicInteger(0);
}

class AtomThread implements Runnable {
	String name;

	public AtomThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Starting " + name);

		for (int i = 0; i <= 3; i++) {
			System.out.println(name + " got: " + Shared2.ai.getAndSet(i));
		}
	}
}

public class Prog11AtomicOperattion {

	public static void main(String[] args) throws InterruptedException {
		new Thread(new AtomThread("A")).start();
		Thread.sleep(100);
		new Thread(new AtomThread("B")).start();
		Thread.sleep(100);
		new Thread(new AtomThread("C")).start();
	}
}
