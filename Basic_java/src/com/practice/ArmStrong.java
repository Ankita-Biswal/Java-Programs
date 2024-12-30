package com.practice;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      System.out.println("Enter one number:");
      int num= s.nextInt();
      int pow=pow(num);
      if(isAmStrong(num,pow)) {
    	  System.out.println("It is an amstrong num");
      }
      else {
    	  System.out.println("it is not an amstrong num");
      }
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
