package com.anudip.session4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapInCollection {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("k101", 100);
		map.put("k102", 200);
		System.out.println(map);
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry:entrySet) {
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		
		System.out.println("-----------");
		Set<String> keySet = map.keySet();
		for(String key:keySet) {
			System.out.println("Key: "+key);
		}
		
		System.out.println("-----------");
		Collection<Integer> values = map.values();
		for(int value:values) {
			System.out.println("Value: "+value);
		}
		

		
		
	}

}
