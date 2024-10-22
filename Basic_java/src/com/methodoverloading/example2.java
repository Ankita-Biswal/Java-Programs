package com.methodoverloading;

public class example2 {
public static void m1() {
	System.out.println("m1-no-arg");
}
public static void m1(int a) {
	System.out.println("m1-int-arg");
}
public static void m1(double d) {
	System.out.println("m1-double-arg");
}
	public static void main(String[] args) {
		m1();
		m1(10);
		example2 e=new example2();
		e.m1(9);
		m1(9.9);
	}

}
