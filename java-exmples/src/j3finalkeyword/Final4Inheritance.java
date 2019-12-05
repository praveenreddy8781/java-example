package j3finalkeyword;

//Final class can't be extended(modified)
//final class Parent {
//	public void method() {
//		System.out.println("Parent method()");
//	}
//}

class Parent {
	final public void method() {
		System.out.println("Parent method()");
	}
}

class Child extends Parent {

//	final methods cant be overridden
//	public void method() {
//		System.out.println("Parent method()");
//	}
}

public class Final4Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
