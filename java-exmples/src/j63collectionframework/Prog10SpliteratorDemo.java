package j63collectionframework;

import java.util.ArrayList;
import java.util.Spliterator;

public class Prog10SpliteratorDemo {

	public static void main(String[] args) {
		ArrayList<Double> vals = new ArrayList<Double>();

		vals.add(1.0);
		vals.add(2.0);
		vals.add(3.0);
		vals.add(4.0);
		vals.add(5.0);

//		use tryAdvance to display contents of val
		System.out.print("Contents of vals: \n");
		Spliterator<Double> spliterator = vals.spliterator();

		System.out.println("estimateSize of the spliterator : " + spliterator.estimateSize());
		System.out.println("getExactSizeIfKnown: " + spliterator.getExactSizeIfKnown());

//		System.out.println(spliterator.tryAdvance((n) -> System.out.println(n)));
//		System.out.println(spliterator.tryAdvance((n) -> System.out.println(n)));
// 		System.out.println(spliterator.tryAdvance((n) -> System.out.println(n)));
//		System.out.println(spliterator.tryAdvance((n) -> System.out.println(n)));
//		System.out.println(spliterator.tryAdvance((n) -> System.out.println(n)));
//		System.out.println(spliterator.tryAdvance((n) -> System.out.println(n)));

		while (spliterator.tryAdvance((n) -> System.out.println(n)))
			;

		System.out.println();

//		create a new list that contains sqrt
		ArrayList<Double> sqrs = new ArrayList<Double>();
		spliterator = vals.spliterator();
		while (spliterator.tryAdvance((n) -> sqrs.add(Math.sqrt(n))))
			;

//		Use forEachRemaining() to display contents sqrs
		System.out.println("Contents of sqrs: ");
		spliterator = sqrs.spliterator();
		spliterator.forEachRemaining((n) -> System.out.println(n));

//		System.out.println(spliterator.characteristics());
	}
}
