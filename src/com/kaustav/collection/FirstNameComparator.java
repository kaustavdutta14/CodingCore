package com.kaustav.collection;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {

		String f1 = emp1.firstName;
		String f2 = emp2.firstName;
		String l1 = emp1.lastName;
		String l2 = emp2.lastName;
		if(!f1.equals(f2)) return f1.compareToIgnoreCase(f2);
		else return l1.compareToIgnoreCase(l2);

	}

}
