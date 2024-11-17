package com.Arrays;

public class Small {
public static void main(String[] args) {
	

	int[]a= {9,4,1,8,6,3,5,2};
	int smallest=a[0];
			
	for(int i=1;i<a.length;i++) {
		if(a[i]<smallest)smallest=a[i];
		
	}
	System.out.println(smallest);
}
}
