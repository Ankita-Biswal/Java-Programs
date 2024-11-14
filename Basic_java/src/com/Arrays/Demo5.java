package com.Arrays;

import java.util.Arrays;

public class Demo5 {

	public static void main(String[] args) {
		int[]a= {2,3,4,5,6,8};
		rotate(a);
		rotate(a);
		rotate(a);
		rotate(a);
		System.out.println(Arrays.toString(a));

	}
	static void rotate(int[]a) {
		int l=a.length;
		int temp=a[l-1];
		for(int i=l-2;i>=0;i--) {
			a[i+1]=a[i];
		}
		a[0]=temp;
	}

}
