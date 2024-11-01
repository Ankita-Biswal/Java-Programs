package com.string;
import java.util.*;
public class ReverseSent {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a valid string:");
		String s= sc.nextLine();
		String[]str=s.split(" ");
		String temp1="";
		for(int i=0;i<str.length;i++) {
			temp1+= rev(str[i]);
			if(i>str.length-1)
				temp1+=" ";
		}
		System.out.println(temp1);
	}
       public static String rev(String s) {
    	   String temp=" ";
    	   for(int i=s.length()-1;i>=0;i--) {
    		   temp+=s.charAt(i);
    	   }
    	   return temp;
       }
	}


