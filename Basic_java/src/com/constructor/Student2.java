package com.constructor;

 class Student2 {
 String name;
 int age;
 long mobile;
 
	public Student2(String name, int age, long mobile) {
	this.name = name;
	this.age = age;
	this.mobile = mobile;
    }
     public Student2(Student2 s) {
    	 this.name=s.name;
    	 this.age=s.age;
    	 this.mobile=s.mobile;
     }
     public void display() {
    	 System.out.println(name+"\n"+age+"\n"+mobile);
     }


	public static void main(String[] args) {
		Student2 s1=new Student2("Ruchi",22,897656794);
        Student2 s2=new Student2(s1);//copy constructor
        s1.display();
        s2.display();
	}

}
