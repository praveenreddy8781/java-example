package j64concurrencyutils;

import java.util.concurrent.Phaser;

public class Prog6Phaser {

	public static void main(String[] args) {
		Phaser phaser = new Phaser(1);

		int curPhase;

		System.out.println("Starting");

		new Mythread2(phaser, "A").start();
		new Mythread2(phaser, "B").start();
		new Mythread2(phaser, "C").start();

//		Wait for all thread to complete phase one
		curPhase = phaser.getPhase();
		phaser.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " complete");

//		Wait for all threads to complete phase two
		curPhase = phaser.getPhase();
		phaser.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " complete");

//		Wait for all threads to complete phase three
		curPhase = phaser.getPhase();
		phaser.arriveAndAwaitAdvance();
		System.out.println("Phase " + curPhase + " complete");

//		deregister the main thread
		phaser.arriveAndDeregister();

		if (phaser.isTerminated()) {
			System.out.println("The phaser is terminated");
		}

	}

}

class Mythread2 extends Thread {

	Phaser phsr;
	String name;

	public Mythread2(Phaser phsr, String name) {
		super(name);
		this.phsr = phsr;
		this.name = name;
		phsr.register();
	}

	@Override
	public void run() {
		System.out.println("Thread " + name + " Begining phase one");
		phsr.arriveAndAwaitAdvance();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("Thread " + name + " Begining phase Two");
		phsr.arriveAndAwaitAdvance();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("Thread " + name + " Begining phase Three");
		phsr.arriveAndDeregister();
	}

}
