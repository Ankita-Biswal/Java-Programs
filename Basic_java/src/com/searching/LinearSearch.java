package com.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int []a= {3,8,7,5,4,9,7,8};
		System.out.println(sort(a,13));
		
	}
	static int sort(int[]a,int e) {
	for(int i=0;i<a.length;i++)
		if(a[i]==e) {
			return i;
		}
	   return -1;
	}

}
