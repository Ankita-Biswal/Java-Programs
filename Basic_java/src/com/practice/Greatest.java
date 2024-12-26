package com.practice;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      System.out.println("enter the first number");
      int num1=s.nextInt();
      System.out.println("enter the second number");
      int num2=s.nextInt();
      
      if(num1==num2)System.out.println("Both are equal");
      
      else {
    	  int res=num1>num2?num1:num2;
    	  
    	  System.out.println(res+ "Is the greatest number");
      }
      
	}

}
