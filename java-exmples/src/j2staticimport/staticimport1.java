package j2staticimport;
//accessing specific static variable of a class 

import static j2staticimport.StaticClass.*;

class StaticClass {
	public static final int COUNT = 1;

	public static int incrementCounter(int num) {
		return num + COUNT;
	}
}

public class staticimport1 {
	public static void main(String[] args) {
//		We have to use class name to access the static member's in other class
		System.out.println("Count : " + StaticClass.COUNT);
		System.out.println("incrementCounter : " + StaticClass.incrementCounter(100));

//		With static import feature
		System.out.println("Count : " + COUNT);
		System.out.println("incrementCounter : " + incrementCounter(100));
	}
}
