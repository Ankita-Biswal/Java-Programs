package com.Arrays;

public class secondSmallest {

	public static void main(String[] args) {
		int[]a= {9,4,1,8,6,3,5};
		int smallest=a[0];
		int secSmallest=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]==smallest) continue;
			if(a[i]<smallest) {
				secSmallest=smallest;
				smallest=a[i];
				
			}
			else if(a[i]<secSmallest||smallest==secSmallest) {
				secSmallest=a[i];
			}
		}
		System.out.println(secSmallest);

	}

}
