package com.serialization;

import java.io.Serializable;

public class Student implements Serializable {

	String name;
	int age;
	int sId;
	long mobile;
	
	public Student(String name, int age, int sId, long mobile) {
		
		this.name = name;
		this.age = age;
		this.sId = sId;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sId=" + sId + ", mobile=" + mobile + "]";
	}
	
	
	
}
