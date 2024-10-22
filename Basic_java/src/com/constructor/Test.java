//Program to learn the usage of this keyword
// it is used to call current class instance 
//whenever the local variable name and instance variable names are equal
package com.constructor;

public class Test {
int i;
public void m1() {
	Test t=new Test();
	t.i=30;
	System.out.println(t.i);
	System.out.println(i);
	System.out.println(this.i);
}
	public static void main(String[] args) {
		Test t=new Test();
		t.i=90;
		t.m1();

	}

}
