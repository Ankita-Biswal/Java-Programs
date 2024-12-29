package com.practice;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      System.out.println("Enter one number");
      int num=s.nextInt();
      
      getReverse(num);
	}

	static void getReverse(int num) {
		// TODO Auto-generated method stub
		if(num==0)return ;
		
		int rem=num%10;
		System.out.print(rem);
		
		getReverse(num/10);
	}

}
