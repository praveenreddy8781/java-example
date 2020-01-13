package j64concurrencyutils;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Transform extends RecursiveAction {

	int seqThreshold;

	double[] data;

	int start, end;

	public Transform(double[] vals, int s, int e, int t) {
		data = vals;
		start = s;
		end = e;
		seqThreshold = t;
	}

	@Override
	protected void compute() {
		if ((end - start) < seqThreshold) {
			for (int i = start; i < end; i++) {
				if ((data[i] % 2) == 0) {
					data[i] = Math.sqrt(data[i]);
				} else {
					data[i] = Math.cbrt(data[i]);
				}
			}
		} else {
			int middle = (start + end) / 2;

			invokeAll(new Transform(data, start, middle, seqThreshold), new Transform(data, middle, end, seqThreshold));
		}
	}
}

public class Prog13ForkJoinExperiment {

	public static void main(String[] args) {

		int pLevel;
		int threshold;

		if (args.length != 2) {
			System.out.println("Invalid args");
			return;
		}

		pLevel = Integer.parseInt(args[0]);
		threshold = Integer.parseInt(args[1]);

		Long beginT, endT;

		ForkJoinPool forkJoinPool = new ForkJoinPool(pLevel);

		double[] nums = new double[100000];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (double)i;
		}

		Transform task = new Transform(nums, 0, nums.length, threshold);
		
		beginT = System.nanoTime();
		
		forkJoinPool.invoke(task);
		
		endT = System.nanoTime();
		
		System.out.println("Level of paralellism: " + pLevel);
		System.out.println("Sequential threshold: " + threshold);
		System.out.println("Elaspsed Time : " + (endT - beginT) + " ns");
		
		System.out.println();
	}

}
