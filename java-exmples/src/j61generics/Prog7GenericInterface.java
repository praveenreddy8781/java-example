package j61generics;

interface MinMax<T extends Comparable<T>> {
	T min();

	T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T> {

	T[] vals;

	public MyClass(T[] vals) {
		this.vals = vals;
	}

	@Override
	public T min() {
		T v = vals[0];

		for (int i = 0; i < vals.length; i++) {
			if (vals[i].compareTo(v) < 0) {
				v = vals[i];
			}
		}

		return v;
	}

	@Override
	public T max() {
		T v = vals[0];

		for (int i = 0; i < vals.length; i++) {
			if (vals[i].compareTo(v) > 0) {
				v = vals[i];
			}
		}

		return v;
	}

}

public class Prog7GenericInterface {

	public static void main(String[] args) {

		Integer[] nums = { 3, 6, 2, 8, 6 };
		Character[] chars = { 'b', 'r', 'p', 'w' };

		MyClass<Integer> iob = new MyClass<Integer>(nums);
		MyClass<Character> cob = new MyClass<Character>(chars);

		System.out.println("Max value in nums: " + iob.max());
		System.out.println("Min value in nums: " + iob.min());

		System.out.println("Max value in cob: " + cob.max());
		System.out.println("Min value in cob: " + cob.min());
	}

}
