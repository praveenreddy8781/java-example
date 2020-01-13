package j63collectionframework;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

class CompLastNames implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int i, j;

		i = o1.lastIndexOf(' ');
		j = o2.lastIndexOf(' ');

		return o1.substring(i).compareToIgnoreCase(o2.substring(j));
	}

}

class CompFirstName implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareToIgnoreCase(o2);
	}

}

public class Prog13Comparator3 {

	public static void main(String[] args) {
		CompLastNames compLastNames = new CompLastNames();
		Comparator<String> compareLastThenFirstName = compLastNames.thenComparing(new CompFirstName());

		TreeMap<String, Double> treeMap = new TreeMap<String, Double>(compareLastThenFirstName);

		treeMap.put("John Doe", 3434.34);
		treeMap.put("Tom Smith", 123.22);
		treeMap.put("Jane Baker", 1378.00);
		treeMap.put("Tod Hall", 3434.34);
		treeMap.put("Ralph Smith", -19.00);

		Set<Map.Entry<String, Double>> entries = treeMap.entrySet();

		for (Entry<String, Double> entry : entries) {
			System.out.println();
			System.out.print(entry.getKey() + " ");
			System.out.print(entry.getValue() + " ");
		}
	}

}
