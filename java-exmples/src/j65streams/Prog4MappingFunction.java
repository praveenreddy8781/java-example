package j65streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Prog4MappingFunction {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(7);
		arrayList.add(18);
		arrayList.add(10);
		arrayList.add(24);
		arrayList.add(17);
		arrayList.add(5);

//		map the square root of the elements in arraylist to a new stream
		Stream<Double> sqrtStrm = arrayList.stream().map((a) -> Math.sqrt(a));

//		Find the product of square roots
		double productOfSqrt = sqrtStrm.reduce(1.0, (a, b) -> a * b);
		System.out.println("productOfSqrt: " + productOfSqrt);

	}

}
