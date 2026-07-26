package com.anudip.session4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;


public class FindFrequencyUsingCollections {

	public static void main(String[] args) {
		
		String str = "aa bb cc aa cc bb aa cc cc";
		
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		ArrayList<String> list = new ArrayList<>();
		for(String word:arr) {
			list.add(word);
		}
		
		LinkedHashSet<String> set = new LinkedHashSet<String>(list);
		System.out.println(set);
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for(String key:set) {
			map.put(key, Collections.frequency(list, key));
		}
		System.out.println(map);
		
		System.out.println("===============");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+" occured "+ entry.getValue()+ " times");
		}
		
		System.out.println("==============="
				+ "");
		ArrayList<Map.Entry<String, Integer>> sortedList = new ArrayList<>(entrySet);
		Collections.sort(sortedList, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o1.getValue() - o2.getValue();
			}
			
		});
		
		for (Map.Entry<String, Integer> entry : sortedList) {
			System.out.println(entry.getKey()+" occured "+entry.getValue()+" times");
		}
		
	}

}
