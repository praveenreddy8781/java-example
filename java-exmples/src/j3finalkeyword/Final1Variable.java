package j3finalkeyword;

//final variable in Java
public class Final1Variable {
//	final int MAX_VALUE = 10;
	final int MAX_VALUE;

	public Final1Variable() {
		MAX_VALUE = 100;
	}

	public static void main(String[] args) {
		Final1Variable obj = new Final1Variable();

//		The final field Final1Variable.MAX_VALUE cannot be assigned
//		obj.MAX_VALUE = 100;

		System.out.println(obj.MAX_VALUE);
	}
}
