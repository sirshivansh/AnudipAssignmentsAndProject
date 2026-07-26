package com.anudip.session6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeFailFast {
	
	public static void main(String[] args) {
		// Fail-Fast Example using ArrayList
		System.out.println("=== Fail-Fast Example (ArrayList) ===");
		ArrayList<Integer> failFastList = new ArrayList<>();
		failFastList.add(100);
		failFastList.add(200);
		failFastList.add(300);
		
		try {
			Iterator<Integer> iterator = failFastList.iterator();
			while(iterator.hasNext()) {
				Integer obj = iterator.next();
				System.out.println(obj);
				failFastList.add(400); // ConcurrentModificationException
			}
		} catch(Exception e) {
			System.out.println("Exception caught: " + e.getClass().getSimpleName());
		}
		
		// Fail-Safe Example using CopyOnWriteArrayList
		System.out.println("\n=== Fail-Safe Example (CopyOnWriteArrayList) ===");
		CopyOnWriteArrayList<Integer> failSafeList = new CopyOnWriteArrayList<>();
		failSafeList.add(100);
		failSafeList.add(200);
		failSafeList.add(300);
		
		Iterator<Integer> safeIterator = failSafeList.iterator();
		while(safeIterator.hasNext()) {
			Integer obj = safeIterator.next();
			System.out.println(obj);
			failSafeList.add(400); // No exception - works on a copy
		}
		System.out.println("Final list: " + failSafeList);
	}
	
}
