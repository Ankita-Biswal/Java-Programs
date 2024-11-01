package com.string;
import java.util.*;
public class sumOfDig {

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
		for(int i=0;i<=s.length()-1;i++) {
			if(a[i]>='0'&&a[i]<='9') {
				sum+=a[i]-'0';
			}
		}
		return sum;
	}

}
