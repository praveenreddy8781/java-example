package j3finalkeyword;

import java.util.ArrayList;
import java.util.List;

//final list example
public class Final5List {

	public static void main(String[] args) {
//		create final list
		final List<String> list = new ArrayList<String>();

//		try to add items into list: it works
		list.add("Rama");
		list.add("Krishna");

//		print the list
		System.out.println(list);

//		try to modify the ref of list
//		This will result in an error as we are trying to change the reference 
//		list = new ArrayList<String>();
	}
}
