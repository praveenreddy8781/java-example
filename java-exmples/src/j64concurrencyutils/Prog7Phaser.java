package j64concurrencyutils;

import java.util.concurrent.Phaser;

class MyPhaser extends Phaser {
	int numPhases;

	public MyPhaser(int parties, int numPhases) {
		super(parties);
		this.numPhases = numPhases - 1;
	}

//	Override onAdvance() to execute the
//	specified number of phases
	@Override
	protected boolean onAdvance(int phase, int registeredParties) {
		System.out.println("Phase " + phase + " completed. \n");
		if (phase == numPhases || registeredParties == 0)
			return true;

		return false;
	}

}

public class Prog7Phaser {

	public static void main(String[] args) {
		MyPhaser phaser = new MyPhaser(1, 4);

		System.out.println("Starting\n");

		new Thread(new Mythread3(phaser, "A")).start();
		new Thread(new Mythread3(phaser, "B")).start();
		new Thread(new Mythread3(phaser, "C")).start();

		while (!phaser.isTerminated()) {
			phaser.arriveAndAwaitAdvance();
		}

		System.out.println("The phaser is terminated");
	}
}

class Mythread3 implements Runnable {

	Phaser phsr;
	String name;

	public Mythread3(Phaser phsr, String name) {
		this.phsr = phsr;
		this.name = name;
		phsr.register();
	}

	@Override
	public void run() {
		while (!phsr.isTerminated()) {
			System.out.println("Thread" + name + " Begining phase " + phsr.getPhase());
			phsr.arriveAndAwaitAdvance();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
