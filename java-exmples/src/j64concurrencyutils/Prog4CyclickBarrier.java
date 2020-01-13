package j64concurrencyutils;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Mythread1 implements Runnable {

	CyclicBarrier cb;
	String name;

	public Mythread1(CyclicBarrier cb, String name) {
		this.cb = cb;
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name);
		try {
			cb.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}

class BarAction implements Runnable {

	@Override
	public void run() {
		System.out.println("Barrier Reached!");
	}

}

public class Prog4CyclickBarrier {

	public static void main(String[] args) throws InterruptedException {
		CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

		System.out.println("Starting");

		Thread t1 = new Thread(new Mythread1(cb, "A"));
		Thread t2 = new Thread(new Mythread1(cb, "B"));
		Thread t3 = new Thread(new Mythread1(cb, "C"));

		Thread t4 = new Thread(new Mythread1(cb, "X"));
		Thread t5 = new Thread(new Mythread1(cb, "Y"));
		Thread t6 = new Thread(new Mythread1(cb, "Z"));

		t1.start();
		Thread.sleep(100);
		t2.start();
		Thread.sleep(100);
		t3.start();
		Thread.sleep(100);
		t4.start();
		Thread.sleep(100);
		t5.start();
		Thread.sleep(100);
		t6.start();
		Thread.sleep(100);

	}

}
