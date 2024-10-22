//example of a overloaded method
package com.methodoverloading;

public class example {
public static void m1() {
	System.out.println("M1-No-arg");
}
public static void m1(int a) {
	System.out.println("M1-Int-Arg");
}
public static void m1(int a,int b) {
	System.out.println("M1-int,int-arg");
}
	public static void main(String[] args) {
		m1();
		m1(10);
		m1(6,9);

	}

}
