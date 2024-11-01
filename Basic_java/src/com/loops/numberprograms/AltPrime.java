package com.loops.numberprograms;
import java.util.*;
public class AltPrime {
	static boolean isPrime(int n,int i) {
		if(n==0)return false;
		if(n<=1)return false;
		if(i==1)return true;
		if(n%i==0)return false;
		return isPrime(n,i-1);
	}
	public static void range(int a, int b, int i) {
		if(a==b)return;
		if(isPrime(a,a/2)) {
			i++;
			if(i%2!=0)
				System.out.println(a);
			
			
		}
		range(a+1,b,i);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		range(a,b,0);

	}

	
}
