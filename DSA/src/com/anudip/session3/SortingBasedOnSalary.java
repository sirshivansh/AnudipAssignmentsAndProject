package com.anudip.session3;

import java.util.Comparator;

public class SortingBasedOnSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.compare(o1.getSalary(), o2.getSalary());
	}

}
