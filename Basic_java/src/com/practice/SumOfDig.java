package com.practice;

import java.util.Scanner;

public class SumOfDig {

	   public static void main (String[]args)
	   {
         Scanner s= new Scanner(System.in);
         System.out.println("Enter a number:");
	     int num =s.nextInt();
	       System.out.println ("Sum of digits : " + getSum (num));
	   }

	   static int getSum (int num)
	   {

	     if (num == 0)
	       return 0;

	     return (num % 10) + getSum (num / 10);
	   }

	 }

