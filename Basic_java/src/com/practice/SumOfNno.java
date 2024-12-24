package com.practice;

import java.util.Scanner;

public class SumOfNno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       System.out.println("Enter the numbers:");
       
       int n= s.nextInt();
       
       int sum=getSum(n);
       
       System.out.println(sum);
       
	}

	public static int getSum(int n) {
		if(n==0)return n;
		
		return n+getSum(n-1);
	}

}
