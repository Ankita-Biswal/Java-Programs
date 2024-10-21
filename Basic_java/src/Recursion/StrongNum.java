package Recursion;
import java.util.*;
public class StrongNum {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int fact=fact(n);
		int res=strongNo(n,fact);
		if(res==n) {
			System.out.println(n+"is a Strong number");
		}
		else {
			System.out.println(n+"is not a Strong number");
		}

	}

	  static int fact(int n) {
		if(n==0) return 1;
		return n*fact(n-1);
	}

	static int strongNo(int n, int fact) {
		if (n==0)return 0;
		return fact(n%10)+strongNo(n/10,fact);
	}

}
