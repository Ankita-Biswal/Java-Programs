package Recursion;
import java.util.*;

public class Pallindrome {
public static boolean isPallindrome(int n) {
	
	return n==reverse(n,0);
}
public static int reverse(int n,int rev) {
	if(n==0)return rev;
		return reverse(n/10,rev*10+n%10);
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	if(isPallindrome(n)) {
		System.out.println("It is a Pallindrome num");
	}
	else {
		System.out.println("it is not a pallindrome num");
	}
}
}
