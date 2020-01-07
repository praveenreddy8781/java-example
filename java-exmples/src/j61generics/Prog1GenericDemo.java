package j61generics;

class Gen<T> {

	T obj;

	Gen(T obj) {
		this.obj = obj;
	}

	T getObj() {
		return obj;
	}

	void showType() {
		System.out.println("Type of T is: " + obj.getClass().getName());
	}
}

public class Prog1GenericDemo {

	public static void main(String[] args) {
		Gen<Integer> iob = new Gen<Integer>(88);
		iob.showType();

		int val = iob.getObj();
		System.out.println("value: " + val);

		System.out.println();

		Gen<String> strOb = new Gen<String>("Gerecis Test");
		strOb.showType();

		String str = strOb.getObj();
		System.out.println("value: " + str);
	}

}
