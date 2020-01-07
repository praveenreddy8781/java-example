package j61generics;

class NonGen {
	int num;

	public NonGen(int num) {
		this.num = num;
	}

	int getNum() {
		return num;
	}
}

class GenClass<T> extends NonGen {

	T obj;

	public GenClass(T obj, int num) {
		super(num);
		this.obj = obj;
	}

	T getob() {
		return obj;
	}

}

public class Prog9GenericSubClass {

	public static void main(String[] args) {
		GenClass<String> test = new GenClass<String>("Hello", 47);

		System.out.println(test.getob());
		System.out.println(test.getNum());
	}

}
