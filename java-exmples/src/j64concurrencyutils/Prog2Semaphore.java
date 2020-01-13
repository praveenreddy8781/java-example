package j64concurrencyutils;

import java.util.concurrent.Semaphore;

class Q {
	int n;

//	start with consumer semaphore unavailable
	static Semaphore semCon = new Semaphore(0);
	static Semaphore semProd = new Semaphore(1);

	void get() {
		try {
			semCon.acquire();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Got: " + n);
		semProd.release();
	}

	void put(int n) {
		try {
			semProd.acquire();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		this.n = n;
		System.out.println("Put: " + n);
		semCon.release();
	}

}

class Producer implements Runnable {

	Q q;

	public Producer(Q q) {
		this.q = q;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			q.put(i);
		}
	}

}

class Consumer implements Runnable {

	Q q;

	public Consumer(Q q) {
		this.q = q;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			q.get();
		}
	}

}

public class Prog2Semaphore {

	public static void main(String[] args) {
		Q q = new Q();

		new Thread(new Consumer(q), "Consumer").start();
		new Thread(new Producer(q), "Producer").start();
	}

}
