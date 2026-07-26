package com.anudip.session1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestIterator {

	public static void main(String[] args) {
		Vector<Integer> list = new Vector<Integer>();
		list.add(100);
		list.add(300);
		list.add(500);
		list.add(900);
		list.add(700);
		
		//using iterator
		Iterator<Integer> iterator = list.iterator();		
		while(iterator.hasNext()) {
			Integer obj = iterator.next();
			System.out.println(obj);
		}
		System.out.println("=========");
		//Using listiterator
		ListIterator<Integer> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("=========");
		ListIterator<Integer> listIterator2 = list.listIterator(5);
		while(listIterator2.hasPrevious()) {
			System.out.println(listIterator2.previous());
		}
		System.out.println("=========");
		//Using Enumeration
		Enumeration<Integer> elements = list.elements();
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		

	}

}
