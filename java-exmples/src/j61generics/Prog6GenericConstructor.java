package j61generics;

class GenCons {

	private double val;

	public <T extends Number> GenCons(T arg) {
		this.val = arg.doubleValue();
	}

	void showVal() {
		System.out.println("val: " + val);
	}
}

public class Prog6GenericConstructor {

	public static void main(String[] args) {
		GenCons test = new GenCons(100);
		GenCons test2 = new GenCons(123.5F);
		
//		GenCons test3 = new GenCons("999");

		test.showVal();
		test2.showVal();
	}
}
