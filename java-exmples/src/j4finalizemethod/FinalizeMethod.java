package j4finalizemethod;

class Parent {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("cleaning up resources used by Parent class object!!!");
		super.finalize();
	}
}

public class FinalizeMethod extends Parent {

	int i = 0;

	public FinalizeMethod(int i) {
		this.i = i;
	}

	public void someMethod() {
		System.out.println("Child calls someMethod : " + i);
	}

	public static void main(String[] args) {
//		create an object
		FinalizeMethod f = new FinalizeMethod(10);

		f.someMethod();

		// setting object reference as null so it is
		// eligible for garabge collection
		f = null;

		// Calling System.gc() to run garbage collector
		System.gc();
	}

	@Override
	protected void finalize() throws Throwable {

		try {
			System.out.println("cleaning up resources used by child class object!!!");
		} finally {
//			cleanup 
			super.finalize();
		}
	}

}
