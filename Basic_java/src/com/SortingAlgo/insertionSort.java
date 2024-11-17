package com.SortingAlgo;

import java.util.Arrays;

public class insertionSort {

	public static void main(String[] args) {
	int[]a= {5,8,7,4,2,1,9,6};
	System.out.println("Before sorting:"+Arrays.toString(a));
	sort(a);
	System.out.println("After sorting:"+Arrays.toString(a));
	}
	
	public static void sort(int[]a) {
		for(int i=1;i<a.length;i++) {
			int k=a[i];
			int j=i-1;
			
			while(j>=0 && a[j]>k) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=k;
		}
	}

}
