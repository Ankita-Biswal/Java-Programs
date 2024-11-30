package com.comparatorinterface;

import java.util.Arrays;
import com.comparableinterface.*;
public class Demo {
public static void main(String[] args) {
	Employee[]arr= {
			   new Employee("Anuska",22222.00),
			   new Employee("Priyanka",333333.00),
			   new Employee("Deepika",4444444.00),
			   new Employee("Samanthaa",555555.00),
			   new Employee("shrileela",999999.00),
	};
	Arrays.sort(arr,new salCompare());
	for(Employee e:arr) {
		System.out.println(e);
	}
}
}
