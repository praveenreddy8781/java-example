package j26stringmatches;

import java.util.Arrays;
import java.util.List;

public class StringMatches {

	public static void main(String[] args) {

////	If you have a list of cities and you want to print only those cities that start with “L”
//		then you can pass a regex in matches() method to match that pattern.
		List<String> strList = Arrays.asList("Chicago", "London", "Lisbon", "Mumbai");

		for (String str : strList) {
			if (str.matches("L.*")) {
				System.out.println(str);
			}
		}

//		Let's say there is a String array with some strings and you want to match and print only those 
//		strings which doesn't contain any digit or special character. Then using matches method and providing 
//		a regular expression [a-z]+ which will match one or more chars it can be done as follows.
		System.out.println("Only words");
		String[] words = { "a123", "*67t", "test", "54&ty" };
		for (String word : words) {
			if (word.matches("[a-z]+")) {
				System.out.println(word);
			}
		}

//		In the same scenario as example 2 if you want to get only those string which are alphanumeric 
//		(i.e. no special characters) then using String matches() method it can be done as
		System.out.println("words without special characters");
		for (String word : words) {
			if (word.matches("\\w+")) {
				System.out.println(word);
			}
		}
	}
}
