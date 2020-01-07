package programs1arrays;

import java.util.HashSet;

public class Prog6FindDuplicates {

	public static void main(String[] args) {
		String[] strArray = { "Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC" };
		int size = strArray.length;

		method1UsingForLoops(strArray, size);

		method2UsingHashSet(strArray, size);
	}

	private static void method2UsingHashSet(String[] strArray, int size) {
		System.out.println("method2UsingHashSet::");
		HashSet<String> hashSet = new HashSet<String>();

		for (String str : strArray) {
			if (!hashSet.add(str)) {
				System.out.println("Duplicate is: " + str);
			}
		}
	}

	private static void method1UsingForLoops(String[] strArray, int size) {
		System.out.println("method1UsingForLoops::");
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (strArray[i].equals(strArray[j])) {
					System.out.println("Duplicate is: " + strArray[i]);
					break;
				}
			}
		}
	}

}
