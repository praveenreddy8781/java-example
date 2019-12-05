package j3finalkeyword;

//final method parameter

public class Final3MethodParams {
	public void method(final int id, final String name) {
//		Can't modify final parameter's
//		id = 101;
//		name = "Krishna";

		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Final3MethodParams obj = new Final3MethodParams();

		obj.method(10, "Ram");

	}

}
