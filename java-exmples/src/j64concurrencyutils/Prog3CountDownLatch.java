package j64concurrencyutils;

import java.util.concurrent.CountDownLatch;

public class Prog3CountDownLatch {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(5);

		System.out.println("Starting");

		new Thread(new Mythread(latch)).start();

		try {
			latch.await();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("Done");
	}
}

class Mythread implements Runnable {
	CountDownLatch latch;

	public Mythread(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			latch.countDown();
		}
	}
}