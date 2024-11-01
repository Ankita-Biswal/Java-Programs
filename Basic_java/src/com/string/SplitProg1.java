package com.string;
import java.util.*;
public class SplitProg1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one string:");
		String s=sc.nextLine();
		String temp="";
		String[]str=s.split("");
		for(int i=str.length-1;i>=0;i--) {
			temp+=str[i];
			temp+="";
		}
        System.out.println(temp);
	}

}
