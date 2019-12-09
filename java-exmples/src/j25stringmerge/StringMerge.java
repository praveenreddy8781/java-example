package j25stringmerge;

import java.util.ArrayList;
import java.util.List;

public class StringMerge {

	public static void main(String[] args) {
//		If you have 3 string variables which you want to join with space in between or with '-' 
//		in between then it can be done using the following Java code -
		String s1 = "An";
		String s2 = "Example";
		String s3 = "String";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		String strMergedWithSpace = String.join(" ", s1, s2, s3);
		System.out.println("strMergedWithSpace: " + strMergedWithSpace);

		String strMergedWithHyphen = String.join("-", s1, s2, s3);
		System.out.println("strMergedWithHyphen: " + strMergedWithHyphen);

//		If you have 3 string variables day, month and year which you want to join to 
//		create a date in format dd/mm/yyyy, then using join() method you can do it as follows.
		String dd = "26";
		String mm = "06";
		String yyyy = "2019";

		System.out.println(dd);
		System.out.println(mm);
		System.out.println(yyyy);

		String date = String.join("/", dd, mm, yyyy);
		System.out.println("date in dd/mm/yyyy: " + date);

//		If you have list of Strings then you can use the second join method (where Iterable is passed as 
//		parameter) to join all the strings with in the list.

		List<String> list = new ArrayList<String>();
		list.add("An");
		list.add("example");
		list.add("string");

		String listToStr = String.join(",", list);
		System.out.println("listToStr: " + listToStr);
	}
}
