package com.string;
import java.util.*;
public class sumOfCons {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter one String:");
		String s=sc.nextLine();
		int count=sumofDig(s);
        System.out.println("Sum will be"+count);
	}

	static int sumofDig(String s) {
		char a[]=s.toCharArray();
		int sum=0;
		int con=0;
		for(int i=0;i<=s.length()-1;i++) {
			if(a[i]>=48&&a[i]<=57) {
				con=con*10+a[i]-'0';
			}
			else {
				sum+=con;
				con=0;
			}
		}
		sum+=con;
		return sum;
	}

}
