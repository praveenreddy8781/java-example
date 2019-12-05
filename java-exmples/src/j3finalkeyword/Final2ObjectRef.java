package j3finalkeyword;

//Final object reference

class SomeClass {
	int i = 10;
	String CITY = "CITY";
}

public class Final2ObjectRef {

	public static void main(String[] args) {
		final SomeClass obj = new SomeClass();

//		the members of the object can be changed
		obj.i = 100;
		obj.CITY = "Bangalore";

		System.out.println("i: " + obj.i + "CITY: " + obj.CITY);

//		the final local variable obj cannot be assigned. It must be blank and not using a compound assignment
//		obj = null;
	}
}
