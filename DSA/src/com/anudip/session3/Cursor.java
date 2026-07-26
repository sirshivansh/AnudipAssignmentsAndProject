package com.anudip.session3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Cursor {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(300);
		list.add(200);
		list.add(500);
		list.add(400);
		
		//using for each loop
		for(Integer num:list) {
			System.out.println(num);
		}
		
		//using Iterator
		System.out.println("============");
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			Integer obj = iterator.next();
			System.out.println(obj);
		}
		
		//using ListIterator
		System.out.println("============");
		ListIterator<Integer> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("============");
		ListIterator<Integer> listIterator2 = list.listIterator(list.size());
		while(listIterator2.hasPrevious()) {
			System.out.println(listIterator2.previous());
		}
	}

}
