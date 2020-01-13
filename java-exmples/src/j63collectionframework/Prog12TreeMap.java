package j63collectionframework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Prog12TreeMap {

	public static void main(String[] args) {
		TreeMap<String, Double> treeMap = new TreeMap<String, Double>();

		treeMap.put("key1", 3434.34);
		treeMap.put("key2", 123.22);
		treeMap.put("key3", 1378.00);
		treeMap.put("key4", 99.22);
		treeMap.put("key5", -19.08);

		Set<Map.Entry<String, Double>> entries = treeMap.entrySet();

		for (Map.Entry<String, Double> entry : entries) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}
}
