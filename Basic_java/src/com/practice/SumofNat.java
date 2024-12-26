package com.practice;

import java.util.Scanner;

public class SumofNat {

	public static void main(String[] args) {
		
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


