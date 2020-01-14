package j65streams;

import java.util.ArrayList;

public class Prog3ParallelStream {

	public static void main(String[] args) {
		
		ArrayList<Double> arrayList = new ArrayList<Double>();
		
		arrayList.add(7.0);
		arrayList.add(18.0);
		arrayList.add(10.0);
		arrayList.add(24.0);
		arrayList.add(17.0);
		arrayList.add(5.0);
		
		double productOfSqrt = arrayList.parallelStream().reduce(1.0, (a,b)-> a * Math.sqrt(b), (a, b) -> a*b);
		System.out.println("productOfSqrt: " + productOfSqrt);
		
//		using forEach
		System.out.println("Parallel Stream : forEach() ");
		arrayList.parallelStream().sorted().forEach((n) -> System.out.print(n + " "));

		System.out.println();
		
		System.out.println("Parallel Stream : forEachOrdered() ");
		arrayList.parallelStream().sorted().forEachOrdered((n) -> System.out.print(n + " "));
	}
}
