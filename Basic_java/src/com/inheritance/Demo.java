package com.inheritance;

 class A {
   int i=10;
   void m1() {
	   System.out.println("M1-A");
   }
}

class B extends A{
	int j=20;
	void m2() {
		System.out.println("M2-B");
	}
}

class C extends B{
	int k=30;
	void m3() {
		System.out.println("M3-C");
	}
}

public class Demo{
	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.i);
		a1.m1();
		
		B b1=new B();
		System.out.println(b1.j);
		System.out.println(b1.j);
		b1.m1();
		b1.m2();
		
		C c1=new C();
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
		
		c1.m1();
		c1.m2();
		c1.m3();
	}
}