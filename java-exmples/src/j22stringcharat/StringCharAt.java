package j22stringcharat;

public class StringCharAt {

	public static void main(String[] args) {
		String str = "Example String";

		System.out.println("str: " + str);

		System.out.println("First character of the str : " + str.charAt(0));

		System.out.println("Fourth character of the str : " + str.charAt(3));

		System.out.println("Last character of the str : " + str.charAt(str.length() - 1));

//		IndexOutOfBoundsException
//		System.out.println(str.charAt(str.length()));
	}
}
