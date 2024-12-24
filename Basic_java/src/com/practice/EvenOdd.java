package com.practice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      System.out.println("Enter a number:");
      
      int num =s.nextInt();
      
      String res= num%2==0 ? "It is an Even Integer!!!":"It is an Odd Integer!!!";
      
      System.out.println(res);
	}

}
