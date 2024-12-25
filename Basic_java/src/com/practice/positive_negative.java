package com.practice;
import java.util.Scanner;
public class positive_negative {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
	    int n=sc.nextInt();
	    
	    if(n==0) {
	    	System.out.println("It is zero, neither positive nor negative!!!");
	    }
       else {
    	String  res= n>0 ? "It is a positive integer": "It is a negative Integer";
    	System.out.println(res);
	}
	}

}
