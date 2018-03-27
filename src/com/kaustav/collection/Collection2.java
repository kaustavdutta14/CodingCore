package com.kaustav.collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Collection2 {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee(20,"Harsha","Kovalluri");
		Employee emp2 = new Employee(23,"Harsha","Nanda");
		Employee emp3 = new Employee(20,"Gowtham","Cheedepudi");
		Employee emp4 = new Employee(29,"Shashank","Goli");
		Employee emp5 = new Employee(28,"Siddartha","Kovalluri");
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please select the sort type:\n1.Sort by Age\n2.Sort by First name\n3.Sort by Last name");
		try {
			int read = Integer.parseInt(br.readLine());
			if (read == 1) {
				list.sort(new AgeComparator());
				for(Employee e:list) {
					System.out.println(e);
				}
			}
			else if(read == 2) {
				list.sort(new FirstNameComparator());
				for(Employee e:list) {
					System.out.println(e);
				}
			}
			else {
				list.sort(new LastNameComparator());
				for(Employee e:list) {
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
