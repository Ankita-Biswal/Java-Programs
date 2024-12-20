package com.inheritance;

class Aa{
	int i=10;
}

class Bb extends Aa{
	int j=20;
	public void m2() {
		System.out.println(i);
		System.out.println(super.i);
	}
}

class Cc extends Bb{
	int i=30;
	public void m3() {
		m2();
		System.out.println(j);
		System.out.println(super.i);
		
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Cc c= new Cc();
       c.m3();
	}

}
