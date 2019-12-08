package j17stringcreation;

public class StringCreationTypes {

	public static void main(String[] args) {
//		using new operator
		String s1 = new String("abc");
		System.out.println("s1 using new operator: " + s1);

		String s2 = new String("abc");
		System.out.println("s2 using new operator: " + s1);

		if (s1 == s2) {
			System.out.println("s1 and s2 are same");
		} else {
			System.out.println("s1 and s2 are not same");
		}

//		using string literal(preferred)
		String s3 = "test";
		System.out.println("s3 using string literal: " + s3);

		String s4 = "test";
		System.out.println("s4 using string literal: " + s4);

		if (s3 == s4) {
			System.out.println("s3 and s4 are same");
		} else {
			System.out.println("s3 and s4 are not same");
		}
	}
}
