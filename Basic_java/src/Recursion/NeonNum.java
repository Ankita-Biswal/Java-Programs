package Recursion;
import java.util.*;
public class NeonNum {
	
	public static boolean isNeon(int n) {
		if (n==0)return false;
		int square=n*n;
		int sum=sumOfDig(square);
		return sum==n;
	}
	public static int sumOfDig(int a) {
		if(a==0)return 0;
		return (a%10)+sumOfDig(a/10);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	if(isNeon(num)) {
		System.out.println("It is a Neon Num");
	}
	else {
		System.out.println("It is not a Neon Num");
	}
	
}
}
