package j19stringimmutability;

public class StringImmutable {

	public static void main(String[] args) {
		String str = "hello";
		str.concat("world");
		System.out.println("Value of str- " + str);
	}
}
