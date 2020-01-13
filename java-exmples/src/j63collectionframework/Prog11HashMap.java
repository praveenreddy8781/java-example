package j63collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Prog11HashMap {

	public static void main(String[] args) {

		HashMap<String, Double> hashMap = new HashMap<String, Double>();

//		put elements 
		hashMap.put("key1", 3434.34);
		hashMap.put("key2", 123.22);
		hashMap.put("key3", 1378.00);
		hashMap.put("key4", 99.22);
		hashMap.put("key5", -19.08);

//		get entries
		Set<Map.Entry<String, Double>> set = hashMap.entrySet();

		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}

		System.out.println();

		double balance = hashMap.get("key1");
		hashMap.put("key1", balance + 1000);

		System.out.println("key1's new balance: " + hashMap.get("key1"));

//		putIfAbsent
		System.out.println("hashMap.putIfAbsent(\"key6\", 4521.215): " + hashMap.putIfAbsent("key6", 4521.215));
		System.out.println("hashMap: " + hashMap);

//		containsKey("key7")
		System.out.println("hashMap.containsKey(\"key7\"): " + hashMap.containsKey("key7"));

//		containsValue(4434.34)
		System.out.println("hashMap.containsValue(4434.34): " + hashMap.containsValue(4434.34));
		
//		getOrDefault("key8", 999.99)
		System.out.println("hashMap.getOrDefault(\"key8\", 999.99): " + hashMap.getOrDefault("key8", 999.99));
		
//		keySet()
		Set<String> keySet = hashMap.keySet();
		System.out.println("Using keySet(): ");
		Iterator<String> itr = keySet.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		System.out.println();
	}
}
