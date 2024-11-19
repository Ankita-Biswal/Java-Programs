package com.comparableinterface;

import java.util.Arrays;

public class Test1 {
public static void main(String[] args) {
	Employee[]arr= {
			       new Employee("Ankita",90000.80),
			       new Employee("Rashmi",87000.60),
			       new Employee("Puneeth",60000.00),
			       new Employee("Nithin",50000),
			       new Employee("Soumitra",300000.00)
			 
	};
	Arrays.sort(arr);
	for(Employee e:arr) {
		System.out.println(e);
	}
}
}
