package j61generics;

class Stats1<T extends Number> {
	T[] nums;

	public Stats1(T[] nums) {
		this.nums = nums;
	}

	double avreage() {
		double sum = 0.0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i].doubleValue();
		}

		return sum / nums.length;
	}

	boolean isAvgSame(Stats1<?> ob) {
		if (avreage() == ob.avreage()) {
			return true;
		} else {
			return false;
		}
	}
}

public class Prog3WildCardParameters {

	public static void main(String[] args) {
		Integer[] inums = { 1, 2, 3, 4, 5 };
		Stats1<Integer> iob = new Stats1<Integer>(inums);
		System.out.println("iob avreage is : " + iob.avreage());

		Double[] dnums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats1<Double> dob = new Stats1<Double>(dnums);
		System.out.println("dob avreage is : " + dob.avreage());

		Float[] fnums = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
		Stats1<Float> fob = new Stats1<Float>(fnums);
		System.out.println("fob avreage is : " + fob.avreage());

		System.out.println("avreage of iob and dob");

		if (iob.isAvgSame(dob)) {
			System.out.println(" are the same");
		} else {
			System.out.println(" differ");
		}

		System.out.println("avreage of iob and fob");

		if (iob.isAvgSame(fob)) {
			System.out.println(" are the same");
		} else {
			System.out.println(" differ");
		}
	}
}
