package j64concurrencyutils;

import java.util.concurrent.locks.ReentrantLock;

class Shared1 {
	static int count = 0;
}

class LockThread implements Runnable {

	String name;
	ReentrantLock reentrantLock;

	public LockThread(String name, ReentrantLock lock) {
		this.reentrantLock = lock;
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Starting " + name);

		try {
			reentrantLock.lock();
			System.out.println(name + " is locking count.");

			Shared1.count++;
			System.out.println(name + " : Shared1.count : " + Shared1.count);

			System.out.println(name + " is sleeping");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		} finally {
			System.out.println(name + " is unlocking count");
			reentrantLock.unlock();
		}
	}
}

public class Prog10LockDemo {

	public static void main(String[] args) {
		ReentrantLock reentrantLock = new ReentrantLock();

		new Thread(new LockThread("A", reentrantLock)).start();
		new Thread(new LockThread("B", reentrantLock)).start();
	}
}
