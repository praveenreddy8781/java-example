package j63collectionframework;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Tcom implements Comparator<String> {

	@Override
	public int compare(String aStr, String bStr) {
		int i, j, k;

		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');

		k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));

		if (k == 0) {
			return aStr.compareToIgnoreCase(bStr);
		} else {
			return k;
		}
	}

}

public class Prog13Comparator2 {

	public static void main(String[] args) {
		TreeMap<String, Double> treeMap = new TreeMap<String, Double>(new Tcom());

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
