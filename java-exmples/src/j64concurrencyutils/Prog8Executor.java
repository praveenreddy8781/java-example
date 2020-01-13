package j64concurrencyutils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Prog8Executor {
	public static void main(String[] args) {
		CountDownLatch cdl = new CountDownLatch(5);
		CountDownLatch cdl2 = new CountDownLatch(5);
		CountDownLatch cdl3 = new CountDownLatch(5);
		CountDownLatch cdl4 = new CountDownLatch(5);

		ExecutorService es = Executors.newFixedThreadPool(2);

		System.out.println("Starting");

//		starts the threads 
		es.execute(new Mythread4("A", cdl));
		es.execute(new Mythread4("B", cdl2));
		es.execute(new Mythread4("C", cdl3));
		es.execute(new Mythread4("D", cdl4));
		
		try {
			cdl.await();
			cdl2.await();
			cdl3.await();
			cdl4.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		es.shutdown();

		System.out.println("Done");
	}
}

class Mythread4 implements Runnable {
	String name;
	CountDownLatch latch;

	public Mythread4(String name, CountDownLatch latch) {
		this.latch = latch;
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + ": " + i);
			latch.countDown();
		}
	}

}