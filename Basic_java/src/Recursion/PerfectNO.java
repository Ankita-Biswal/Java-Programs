package Recursion;
import java.util.*;
public class PerfectNO {
	public static boolean isPerfect(int n,int i,int sum) {
		if(n==i) {
			return sum==n;
		}
		if(n%i==0) {
			sum+=i;
		}
		return isPerfect(n,i+1,sum);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	if(isPerfect(n,1,0)) {
		System.out.println("It is a perfect num");
	}
	else{
		System.out.println("It is not a perfect num");
	}
}
}
