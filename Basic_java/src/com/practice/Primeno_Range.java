package com.practice;

import java.util.Scanner;

public class Primeno_Range {
	public static boolean isPrime(int n, int i) {
		if(n<=1)return false;
		if(i==1)return true;
		if(n%i==0)return false;
		
		return isPrime(n,i-1);
		
		
	}

	public static void range(int a, int b, int i) {
		// TODO Auto-generated method stub
		if(a==b)return;
		if(isPrime(a,a/2)) {
			i++;
			System.out.println(a);
		}
		 range(a+1,b,i);
	}

		public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       System.out.println("Enter the Starting range:");
       int a= s.nextInt();
       System.out.println("Enter the Ending range");
       int b=s.nextInt();
       
       range(a,b,0);
       
       
	}
}
