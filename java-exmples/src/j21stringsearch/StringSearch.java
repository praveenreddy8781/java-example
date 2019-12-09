package j21stringsearch;

//indexOf() and lastIndexOf()
//contains() 
public class StringSearch {

	public static void main(String[] args) {
//		Searching for character in a String using indexOf() and lastIndexOf() methods
		String date = "12/01/2016";

		System.out.println(date);

		System.out.println("indexOf('/'): " + date.indexOf('/'));

		System.out.println("month: " + date.substring(0, date.indexOf('/')));

		System.out.println("year: " + date.substring(date.lastIndexOf('/') + 1, date.length()));

		String path = "home/index/test.html";
		String middleStr = path.substring(path.indexOf('/') + 1, path.lastIndexOf('/'));
		System.out.println("middleStr: " + middleStr);

//		Searching for substring in a String using indexOf() and lastIndexOf() methods
		String str = "This is a test String to test searching in String";
		System.out.println("str: " + str);

		System.out.println("First occurrence of String test is at index- " + str.indexOf("test"));

		System.out.println("Last occurrence of String test is at index- " + str.lastIndexOf("test"));

		System.out.println("First occurrence of String test after index 15- " + str.indexOf("test", 15));

		String str1 = "Contains example";
		String str2 = "example";
		System.out.println("str1.contains(str2): " + str1.contains(str2));

		String str3 = "Contains example";
		String str4 = "Example";

		System.out.println("str3.contains(str4): " + str3.contains(str4));

		System.out.println(
				"str3.toLowerCase().contains(str4.toLowerCase()): " + str3.toLowerCase().contains(str4.toLowerCase()));
	}
}
