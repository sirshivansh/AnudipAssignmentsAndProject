package com.anudip.session4;

import java.util.HashMap;


public class HashCodeVsEquals {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String s1 = new String("k101");
		String s2 = new String("k101");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		map.put(s1, 100);
		map.put(s2, 300);
		System.out.println(map);
		
		HashMap<Person, Integer> map2 = new HashMap<Person, Integer>();
		Person p1 = new Person(101, "Ravi");
		Person p2 = new Person(101, "Ravi");
		map2.put(p1, 100);
		map2.put(p2, 300);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(map);
	}

}
