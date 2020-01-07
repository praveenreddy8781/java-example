package j61generics;

class Stats<T extends Number> {
	T[] nums;

	public Stats(T[] nums) {
		this.nums = nums;
	}

	double avreage() {
		double sum = 0.0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i].doubleValue();
		}

		return sum / nums.length;
	}
}

public class Prog3UpperBound {

	public static void main(String[] args) {
		Integer[] inums = { 1, 2, 3, 4, 5 };
		Stats1<Integer> iob = new Stats1<Integer>(inums);
		System.out.println("iob avreage is : " + iob.avreage());

		Double[] dnums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats1<Double> dob = new Stats1<Double>(dnums);
		System.out.println("dob avreage is : " + dob.avreage());
		
//		Stats<String> stats = new Stats<String>(nums);
//		Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number> of the type Stats<T>

	}

}
