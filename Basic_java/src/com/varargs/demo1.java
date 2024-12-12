package com.varargs;

public class demo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      m1(10);
      m1(10,30, 40);
      m1(10,40,50,60,70);
	}
 
	public static void m1(int...a) {
		System.out.println("m1 is called");
		for (int n:a) {
			System.out.println(n);
		}
	}
}
