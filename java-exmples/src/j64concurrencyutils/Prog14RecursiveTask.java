package j64concurrencyutils;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Sum1 extends RecursiveTask<Double> {

	final int seqThreshold = 500;

	double[] data;

	int start, end;

	public Sum1(double[] vals, int s, int e) {
		data = vals;
		start = s;
		end = e;
	}

	@Override
	protected Double compute() {
		double sum = 0;

		if ((end - start) < seqThreshold) {
			for (int i = 0; i < end; i++)
				sum += data[i];
		} else {
			int middle = (start + end) / 2;

			Sum1 subTask1 = new Sum1(data, start, middle);
			Sum1 subTask2 = new Sum1(data, middle, end);

			subTask1.fork();
			subTask2.fork();

			sum = subTask1.join() + subTask2.join();
		}
		return sum;
	}
}

public class Prog14RecursiveTask {

	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();

		
		double[] nums = new double[5000];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (double) (((i % 2) == 0) ? i : -1);
		}

		Sum1 task = new Sum1(nums, 0, nums.length);

		double summation = forkJoinPool.invoke(task);

		System.out.println("Summation: " + summation);
	}
}
