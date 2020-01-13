package j65streams;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Prog1StreamDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(7);
		arrayList.add(18);
		arrayList.add(10);
		arrayList.add(24);
		arrayList.add(5);
		
		System.out.println("Original list: " + arrayList);

//		Obtained a stream to array list
		Stream<Integer> stream = arrayList.stream();
		
//		get minValue
		Optional<Integer> minVal = stream.min(Integer::compare);
		System.out.println("minVal : " + minVal);
		
		stream = arrayList.stream();
//		get max value
		Optional<Integer> maxVal = stream.max(Integer::compare);
		System.out.println("maxVal : " + maxVal);
		
//		sort stream
		stream = arrayList.stream();
		Stream<Integer> sortedStream = stream.sorted();
		
		System.out.print("sortedStream: ");
		sortedStream.forEach((n) -> System.out.print(n + " "));
		
		System.out.println("\n Original list: " + arrayList);
		
//		filtering stream
		System.out.print("Odd values: ");
		Stream<Integer> oddValueStream = arrayList.stream().sorted().filter((n) -> (n%2) != 0).filter((n)-> n>5);
		oddValueStream.forEach((n) -> System.out.print(n));
	}
}
