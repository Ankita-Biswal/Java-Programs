package com.practice;

import java.util.Scanner;

public class AmstrongRange {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      System.out.println("Enter Starting num:");
      int a= s.nextInt();
      System.out.println("Enter Ending num:");
      int b= s.nextInt();
      
      System.out.println("amstrong num in the range are:");
      range(a,b);
      
	}

	public static void range(int a, int b) {
		// TODO Auto-generated method stub
		   if (a > b) return; // Base condition
	        int pow = pow(a); // Calculate the number of digits in 'a'
	        if (isAmStrong(a, pow)) {
	            System.out.println(a);
	        }
	        range(a + 1, b);
	}

	public static boolean isAmStrong(int num,int pow) {
		return num==getAmstrong(num, pow);
	}

	public static int getAmstrong(int num,int pow) {
	if (num==0)return 0;
	int d=num%10;
	return (int)Math.pow(d, pow)+getAmstrong(num/10,pow);
	}

	public static int pow(int n) {
		if(n==0)return 0;
		return 1+pow(n/10);
	}

}
