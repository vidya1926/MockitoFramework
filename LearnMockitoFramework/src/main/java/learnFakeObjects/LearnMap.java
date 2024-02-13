package learnFakeObjects;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {

		Map<String, Integer> mapData = new HashMap<String, Integer>();

		mapData.put("Vidya", 1);
		mapData.put("Saravana", 2);
		mapData.put("Aravind", 3);

		System.out.println(mapData);
		System.out.println("*****************************");

		Map<String, Integer> orderMap = new LinkedHashMap<String, Integer>();
		orderMap.put("Vidya", 1);
		orderMap.put("Saravana", 2);
		orderMap.put("Aravind", 3);

		System.out.println(orderMap);
		System.out.println("*****************************");

		Map<String, Integer> asciMap = new TreeMap<String, Integer>();

		asciMap.put("Vidya", 1);
		asciMap.put("Saravana", 2);
		asciMap.put("Aravind", 3);

		System.out.println(asciMap);
		System.out.println("*****************************");

	}

}
