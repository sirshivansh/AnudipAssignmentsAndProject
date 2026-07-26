package com.anudip.session1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class FailSafevsFailFast {

	public static void main(String[] args) {
		//ArrayList<Integer> list = new ArrayList<Integer>();
		//CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		//HashSet<Integer> list = new HashSet<>();
//		CopyOnWriteArraySet<Integer> list = new CopyOnWriteArraySet<>();
//		list.add(100);
//		list.add(300);
//		list.add(500);
//		list.add(900);
//		list.add(700);
//		
//		System.out.println(list);
//		
//		//using iterator
//		Iterator<Integer> iterator = list.iterator();		
//		while(iterator.hasNext()) {
//			Integer obj = iterator.next();
//			System.out.println(obj);
//			list.add(1000);
//		}
		
		
		//HashMap<String, Integer> map = new HashMap<>();
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("one", 1000);
		map.put("two", 7000);
		map.put("three", 4000);
		map.put("four", 8000);
		
	
		Iterator<String> iterator2 = map.keySet().iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
			map.put("five", 500);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
