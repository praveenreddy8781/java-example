package j64concurrencyutils;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Prog9Callable {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);

		Future<Integer> f;
		Future<Double> f2;
		Future<Integer> f3;

		System.out.println("Starting");

		f = es.submit(new Sum(10));
		f2 = es.submit(new Hypot(3, 4));
		f3 = es.submit(new Factorial(5));

		try {
			System.out.println(f.get());
			System.out.println(f2.get());
			System.out.println(f3.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		es.shutdown();
		System.out.println("Done");
	}
}

class Sum implements Callable<Integer> {
	int stop;

	Sum(int v) {
		stop = v;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 1; i <= stop; i++) {
			sum += i;
		}

		return sum;
	}
}

class Hypot implements Callable<Double> {
	double side1, side2;

	public Hypot(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}

	@Override
	public Double call() throws Exception {
		return Math.sqrt((side1 * side1) + (side2 * side2));
	}
}

class Factorial implements Callable<Integer> {

	int stop;

	public Factorial(int v) {
		this.stop = v;
	}

	@Override
	public Integer call() throws Exception {
		int fact = 1;

		for (int i = 2; i <= stop; i++) {
			fact *= i;
		}

		return fact;
	}

}
