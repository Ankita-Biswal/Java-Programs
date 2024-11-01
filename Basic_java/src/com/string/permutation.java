package com.string;
import java.util.*;
public class permutation {
	static int count=0;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter one string:");
	String s= sc.nextLine();
	int endIndex=s.length()-1;
	permut(s,0,endIndex);
	System.out.println("possible count are"+count);
}
static void permut(String s,int start,int end) {
	if(start>=end) {
		System.out.println(s);
		count++;
		return;
	}
	for(int i=start;i<=end;i++) {
		String s1=Swap(s,start,i);
		permut(s1,start+1,end);
	}
}

static String Swap(String s,int i,int j) {
	char[]a=s.toCharArray();
	char temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	return new String(a);
}
}
