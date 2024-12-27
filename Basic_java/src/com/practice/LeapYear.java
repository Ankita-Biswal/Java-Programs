package com.practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the year:");
		int y=s.nextInt();
		
		int flag=y%400==0||(y%4==0&&y%100!=0)?1:0;
		
		if(flag==1) {
			System.out.println("It is a leap year hurrreaahhhh");
		}
		else {
			System.out.println("It is not a leap year alaahhh");
		}

	}

}
