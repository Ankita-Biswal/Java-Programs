package com.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[]a= {2,4,6,8,10,12,14};
		System.out.println(search(a, 6));

	}
	

	static int search(int[]a,int e) {
		int start=0, end=a.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(e==a[mid])return mid;
			else if(e<a[mid]) 
				end=mid-1;
			else start=mid+1;
				
			
		}
		return -1;
	}
}
