//pro gram using constructor

package com.constructor;

public class Student {

	String name;
	int age;
	int id;
	long mobile;
	
	public Student(String name, int age, int id, long mobile) {
		
		this.name = name;
		this.age = age;
		this.id = id;
		this.mobile = mobile;
	}

	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(id);
		System.out.println(mobile);
	}
	public static void main(String[] args) {
		Student s1=new Student("Ruchi",22,101,123456789);
		Student s2=new Student("Preeti",22,102,987645678);
         s1.display();
         s2.display();
	}

}
