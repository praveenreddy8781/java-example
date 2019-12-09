package j24stringsplit;

public class StringSplit {

	public static void main(String[] args) {
		String str = "split example    program";

		System.out.println(str);
		String[] strArray = str.split("\\s+");

		System.out.println("Words in strArray: " + strArray.length);
		for (String word : strArray) {
			System.out.println(word);
		}

//		split month , date and year from string
		String dateStr = "20/01/2016";
		System.out.println("dateStr: " + dateStr);

		String[] dateArray = dateStr.split("/");
		String month = dateArray[0];
		String date = dateArray[1];
		String year = dateArray[2];

		System.out.println("month: " + month);
		System.out.println("date: " + date);
		System.out.println("year: " + year);
		
//		if i just want to get the month
		String[] monthOnly = dateStr.split("/", 2);
//		System.out.println("monthOnly: " + monthOnly.length);
		System.out.println("monthOnly: " + monthOnly[0]);
	}
}
