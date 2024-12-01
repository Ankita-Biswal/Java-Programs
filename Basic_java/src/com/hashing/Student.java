package com.hashing;

public class Student {
  String name;
  int marks;
public Student(String n, int m) {
	this.name = n;
	this.marks = m;
}
@Override
public String toString() {
	return "Student [name=" + name + ", marks=" + marks + "]";
}
 
public int hashcode() {
	return marks;
}
public boolean equals(Object arg) {
	if(!(arg instanceof Student))return false;
	Student s=(Student)arg;
	return name.equals(s.name)&& marks==s.marks;
}	
}
