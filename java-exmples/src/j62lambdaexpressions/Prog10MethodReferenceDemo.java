package j62lambdaexpressions;

interface MyFun<T> {
	boolean func(T v1, T v2);
}

class HighTemp {
	private int hTemp;

	public HighTemp(int ht) {
		hTemp = ht;
	}

	boolean sameTemp(HighTemp ht2) {
		return hTemp == ht2.hTemp;
	}

	boolean lessThanTemp(HighTemp ht2) {
		return hTemp < ht2.hTemp;
	}
}

public class Prog10MethodReferenceDemo {

	static <T> int counter(T[] vals, MyFun<T> f, T v) {
		int count = 0;

		for (int i = 0; i < vals.length; i++) {
			if (f.func(vals[i], v))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int count;

		HighTemp[] weekDayHighs = { new HighTemp(89), new HighTemp(82), new HighTemp(90), new HighTemp(89),
				new HighTemp(89), new HighTemp(91), new HighTemp(84), new HighTemp(83), };

		count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));

		System.out.println(count + " days had a high of 89");

		count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
		System.out.println(count + " days had a less than high of 89");
	}

}
