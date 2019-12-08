package j20stringcomparision;
//string comparision
//equals() and equalsIgnoreCase()
// compareTo() and compareToIgnoreCase()
//startsWith() and endsWith()
//regionMatches()
public class StringComparisiom {
	public static void main(String[] args) {
		String str = "This is a test string";
		String str1 = new String("This");

		System.out.println("String for comparision using  equals() and equalsIgnoreCase() -- " + str.substring(0, 4));

		System.out.println(str.substring(0, 4).equals("This"));

		System.out.println(str.substring(0, 4).equals("this"));

		System.out.println(str.substring(0, 4).equalsIgnoreCase("this"));

		System.out.println(str1.equalsIgnoreCase("this"));

		System.out.println("String for comparision using  compareTo() and compareToIgnoreCase() -- ");

		String str2 = "run";
		String str3 = new String("run");
		String str4 = "gun";
		String str5 = "sun";

		String str6 = "Run";

//		str2.compareTo(str3) == 0
		if (str2.compareTo(str3) == 0) {
			System.out.println("str2 is equal to str3");
		} else {
			System.out.println("str2 is not equal to str3");
		}

		// str2 > str4 so returns positive integer
		System.out.println("str2.compareTo(str4): " + str2.compareTo(str4));

//		str2.compareTo(str4) > 0
		if (str2.compareTo(str4) > 0) {
			System.out.println("str2 is greater to str4");
		} else {
			System.out.println("str2 is not lesser than str4");
		}

		// str2 < str5 so returns negative integer
		System.out.println("str2.compareTo(str5): " + str2.compareTo(str5));

		System.out.println("str2.compareTo(str6): " + str2.compareTo(str6));
		System.out.println("str2.compareToIgnoreCase(str6): " + str2.compareToIgnoreCase(str6));
		
		System.out.println("String for compareTo using  startsWith() and endsWith() -- ");
		
		System.out.println("str.startsWith(\"This\"): " + str.startsWith("This"));
		
		System.out.println("str.startsWith(\"test\", 8): " + str.startsWith("test", 10));
		
		// returns false
		System.out.println("str.endsWith(\"test\"): " + str.endsWith("test"));
		  
		System.out.println("str.endsWith(\"string\"): " + str.endsWith("string"));
		
		System.out.println("String for compareTo using  regionMatches() -- ");
		
		String str7 = "This is an example string";
		String str8 = new String("example");
		String str9 = "Example"; 
		
		System.out.println("str7.regionMatches(11, str8, 0, str8.length()): " + str7.regionMatches(11, str8, 0, str8.length()));
		System.out.println("str7.regionMatches(11, str9, 0, str9.length()): " + str7.regionMatches(11, str9, 0, str9.length()));
		System.out.println("str7.regionMatches(true, 11, str9, 0, str9.length()): " + str7.regionMatches(true, 11, str9, 0, str9.length()));
	}
}
