package j23substring;

//substring()
//subSequence()
public class SubString {

	public static void main(String[] args) {

		String str = "Example String";

		System.out.println(str);

		System.out.println("getting string from str: " + str.substring(8));
		System.out.println("getting ample from str: " + str.substring(2, 7));

//		IndexOutOfBoundsException
//		System.out.println(str.substring(9, 17));

		String date = "06-17-2019";

		System.out.println("date: " + date.substring(date.indexOf('-') + 1, date.lastIndexOf('-')));

		CharSequence charSequence = str.subSequence(0, 7);
		System.out.println("charSequence: " + charSequence);
	}

}
