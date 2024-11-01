package com.string;
import java.util.*;
public class Test3 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String s1=sc.nextLine();
    System.out.println(reverse(s1));

	}

	 static String  reverse(String s1) 
	 {
		char []a=s1.toCharArray();
		int i=0;int j=s1.length()-1;
		while(i<j) {
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return new String(a);
	}
	  

}
