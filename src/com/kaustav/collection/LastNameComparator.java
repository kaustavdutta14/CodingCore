package com.kaustav.collection;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		String f1 = emp1.firstName;
		String f2 = emp2.firstName;
		String l1 = emp1.lastName;
		String l2 = emp2.lastName;
		if(!l1.equals(l2)) return l1.compareToIgnoreCase(l2);
		else return f1.compareToIgnoreCase(f2);


	}

}
