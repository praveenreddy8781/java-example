package j65streams;

import java.util.ArrayList;
import java.util.Optional;

public class Prog2ReductionOperation {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(7);
		arrayList.add(18);
		arrayList.add(10);
		arrayList.add(24);
		arrayList.add(17);
		arrayList.add(5);

		System.out.println("Original list: " + arrayList);
		
		System.out.println("using sequential stream");
		Optional<Integer> productObj = arrayList.stream().reduce((a, b)-> a);
		
		if(productObj.isPresent()) {
			System.out.println("prodcut as optional :" + productObj);
		}
		
		int product = arrayList.stream().reduce(1, (a, b)-> a*b);
		System.out.println("prodcut as int :" + product);
		
		System.out.println("using parallel stream");
		
		int prod = arrayList.parallelStream().reduce(1, (a,b)-> a*b, (a,b)-> a*b);
		System.out.println("prod as int :" + prod);
	}

}
