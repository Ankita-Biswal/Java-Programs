package com.comparableinterface;

public class Employee implements Comparable {
	String name;
	double sal;
	public Employee(String name, double sal) {
		this.name = name;
		this.sal = sal;
	}
	public int compareTo(Object arg) {
		Employee e=(Employee)arg;
		if(sal>e.sal)return 1;
		if(sal<e.sal)return -1;
		
		return 0;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + "]";
	}
	

}
