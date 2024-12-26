package com.practice;

import java.util.Scanner;

public class Greatest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s= new Scanner(System.in);
	      System.out.println("enter the first number");
	      int num1=s.nextInt();
	      System.out.println("enter the second number");
	      int num2=s.nextInt();
	      System.out.println("enter the third number");
	      int num3=s.nextInt();
	      
	      
	      if(num1==num2&&num2==num3)System.out.println("All are equal");
	      
	      else {
	    	  int temp=num1>num2?num1:num2;
	    	  
	    	  int res=temp>num3?temp:num3;
	    	  
	    	  System.out.println(res + "Is the greatest number");
	      }
	}

}
