package com.loops.numberprograms;
import java.util.*;
public class Alternative_prime {     // 2,3,5,7,11------->2,5,11

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the starting range");
		int st=sc.nextInt();
		System.out.println("enter the ending range");
		int end=sc.nextInt();
        int count=0;
		for(int i =st;i<=end;i++) {
			if(i==1)continue;
		
		boolean flag = true;
		for (int j =2;j<=i/2;j++) {
			if (i%j==0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			count++;
			if(count%2!=0) {
			System.out.println(i);
			}
		}
		
		}
	
	}

}
