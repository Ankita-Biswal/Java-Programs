package com.practice;

import java.util.Scanner;

public class SumNoRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the starting range:");
      int a=s.nextInt();
      System.out.println("Enter the ending range:");
      int b=s.nextInt();
      
      int sum= getSum(0,a,b);
      System.out.println("Sum will be"+sum);
		
	}

	public static int getSum(int sum, int i, int b) {
		if(i>b)return sum;
		return i+getSum(sum,i+1,b);
	}

}
