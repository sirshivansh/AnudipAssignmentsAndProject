package com.anudip.session3;

import java.util.*;

public class ComparableVsComparator {

	public static void main(String[] args) {

		method1();
		
		LinkedList<Employee> list = new LinkedList<Employee>();
		
		Employee e1 = new Employee(2, "Ragini", 30000);
		Employee e2 = new Employee(1, "Neeraj", 70000);
		Employee e3 = new Employee(4, "Monica", 40000);
		Employee e4 = new Employee(3, "Harish", 10000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		System.out.println(list);
		for(Employee e : list) {
			System.out.println(e);
		}
	}

	private static void method1() {
//		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList<Integer> list = new LinkedList<Integer>();
//		Vector<Integer> list = new Vector<Integer>();
		list.add(100);
		list.add(300);
		list.add(200);
		list.add(500);
		list.add(400);

		// System.out.println(list);

//		for(int i=0; i<list.size(); i++){
//			System.out.println(list.get(i));
//		}

		// foreach loop
		for (Integer num : list) {
			System.out.println(num);
		}

		Collections.sort(list, new SortingBasedOnName());
		System.out.println("----------");
		for (Integer num : list) {
			System.out.println(num);
		}
		
		Collections.sort(list, new SortingBasedOnId());
		System.out.println("----------");
		for (Integer num : list) {
			System.out.println(num);
		}
		
		Collections.sort(list, new SortingBasedOnSalary());
		System.out.println("----------");
		for (Integer num : list) {
			System.out.println(num);
		}
//		Employee e = new Employee(101, "keshav", 80000);
//		System.out.println(e);
	}

}
