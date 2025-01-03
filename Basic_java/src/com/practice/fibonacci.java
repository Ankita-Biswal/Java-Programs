package com.practice;

public class fibonacci {
      
    		    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=0;
	     int b=1;
	      int c;
	      int n=10;
	   for (int i=1;i<=n;++i) {
		    c=a+b;
		    a=b;
		    b=c;
		    System.out.println(c);
	       }
	  
	}
}
