package com.practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      System.out.println("Enter one number");
      int n=s.nextInt();
      
      int div=n/2;
      if(isPrime(n,div)) {
    	  System.out.println("it is a prime number");
      }
      else {
    	  System.out.println("It is not a prime number");
      }
	}

	public static boolean isPrime(int n,int div) {
		if (n<=1)return false;
		if(div==1)return true;
		if(n%div==0)return false;
		return isPrime(n,div-1);
	}

}
