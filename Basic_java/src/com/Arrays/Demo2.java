package com.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		int[]a= {10,20,30,40};
		m1(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

		
	}
	static void m1( int[]a){
		for(int i=0;i<a.length;i++) {
			a[i]++;
		}
		System.out.println("m1 completed");
	}
}
