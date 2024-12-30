package com.practice;

import java.util.Scanner;

public class pallindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      System.out.println("Enter one number");
      int num=s.nextInt();
      
      if(isPallindrome(num)) {
    	  System.out.println("It is a pallindrome number");
      }
      else {
    	  System.out.println("It is not a pallindrome number");
      }
	}

	public static boolean isPallindrome(int num) {
		// TODO Auto-generated method stub
		return num==reverse(num,0);
	}

	public static int reverse(int num, int rev) {
		// TODO Auto-generated method stub
		if (num==0)return rev;
		return reverse(num/10,rev*10+num%10);
		
	}

}
