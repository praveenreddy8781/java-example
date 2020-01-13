package j64concurrencyutils;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class SqrtTransform extends RecursiveAction {

	final int seqThreshold = 1000;

	double[] data;

	int start, end;

	public SqrtTransform(double[] vals, int s, int e) {
		data = vals;
		start = s;
		end = e;
	}

	@Override
	protected void compute() {
		if ((end - start) < seqThreshold) {
			for (int i = start; i < end; i++) {
				data[i] = Math.sqrt(data[i]);
			}
		} else {
			int mid = (start + end) / 2;

			invokeAll(new SqrtTransform(data, start, mid), new SqrtTransform(data, mid, end));
		}
	}

}

public class Prog12ForkJoinDemo {

	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool();

		double[] nums = new double[100000];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (double) i;
		}

		System.out.println("A portion of original sequence: ");

		for (int i = 0; i < 10; i++)
			System.out.print(nums[i] + " ");
		System.out.println();

		SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

		forkJoinPool.invoke(task);

		System.out.println("A portion of transformed sequence: (to four decimal plcaes)");

		for (int i = 0; i < 10; i++) {
			System.out.format("%.4f ", nums[i]);
		}
		System.out.println();
	}
}
