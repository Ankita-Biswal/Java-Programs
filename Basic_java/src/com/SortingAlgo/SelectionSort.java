package com.SortingAlgo;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[]arr= {7,12,4,56,8,6,0,23};
		System.out.println("Array elements before sorting:"+Arrays.toString(arr));
		sort(arr);
		System.out.println("Array elements after sorting:"+Arrays.toString(arr));

	}
      public static void  sort(int[]a) {
    	  int temp;
    	  for(int i=0;i<a.length;i++) {
    		  int minIndex=i;
    		  for(int j=i+1;j<a.length;j++) 
    		  {
    			  if(a[j]<a[minIndex]) {
    			  minIndex=j;
    		  }
    		  }
    	  
    	  temp= a[minIndex];
    	  a[minIndex]=a[i];
    	  a[i]=temp;
    	  
    	  
      }
    	 
      }  
      
}
