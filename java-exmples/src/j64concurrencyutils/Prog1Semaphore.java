package j64concurrencyutils;

import java.util.concurrent.Semaphore;

class Shared {
	static int count = 0;
}

class IncThread implements Runnable {

	String name;
	Semaphore sem;

	public IncThread(String name, Semaphore sem) {
		this.name = name;
		this.sem = sem;
	}

	@Override
	public void run() {
		System.out.println("Starting: " + name);

		try {
			System.out.println(name + " is waiting for permit.");
			sem.acquire();
			System.out.println(name + " gets a permit");

//			Now access shared resource
			for (int i = 0; i <= 5; i++) {
				Shared.count++;
				System.out.println(name + ": " + Shared.count);
				Thread.sleep(2000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + " releases the permit");
		sem.release();
	}

}

class DecThread implements Runnable {

	String name;
	Semaphore sem;

	public DecThread(String name, Semaphore sem) {
		this.name = name;
		this.sem = sem;
	}

	@Override
	public void run() {
		System.out.println("starting " + name);

		try {
			System.out.println(name + " is waiting for permit.");
			sem.acquire();
			System.out.println(name + " gets a permit");

//			Now access shared resource
			for (int i = 0; i <= 5; i++) {
				Shared.count--;
				System.out.println(name + ": " + Shared.count);
				Thread.sleep(2000);
			}

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println(name + " releases the permit");
		sem.release();
	}

}

public class Prog1Semaphore {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(2);

		new Thread(new IncThread("A", semaphore)).start();
		new Thread(new DecThread("B", semaphore)).start();

	}
}
