package com.string;
import java.util.*;
public class Initcap {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string:");
		String s= sc.nextLine();
		System.out.println(convert(s));

	}
  public static String convert(String s) {
	  char[]a=s.toCharArray();
	  for(int i=0;i<s.length();i++) {
		  if(a[i]>='a'&&a[i]<='z') {
			  if(i==0||a[i-1]==' ')
				  a[i]=(char)(a[i]-32);
		  }
	  }
	  return new String(a);
  }
}
