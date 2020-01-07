package j61generics;

class GenericSuper<T> {
	T ob;

	public GenericSuper(T ob) {
		this.ob = ob;
	}

	T getob() {
		return ob;
	}

}

class GenericSub<T, V> extends GenericSuper<T> {
	V ob2;

	public GenericSub(T ob, V ob2) {
		super(ob);
		this.ob2 = ob2;
	}

	V getob2() {
		return ob2;
	}
}

public class Prog8GenericSuperClass {

	public static void main(String[] args) {
		GenericSub<String, Integer> x = new GenericSub<String, Integer>("Value is: ", 99);

		System.out.print(x.getob());
		System.out.print(x.getob2());
	}

}
