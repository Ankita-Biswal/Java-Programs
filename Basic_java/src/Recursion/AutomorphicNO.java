package Recursion;
import java.util.*;
public class AutomorphicNO {
	public static boolean isAutomorphic(int a) {
		int square=a*a;
		return checkLastDig(a,square);
	}
	public static boolean checkLastDig(int a,int square) {
		if (a==0)return true;
		if(a%10!=square%10) {
			return false;
		}
		return checkLastDig(a/10,square/10);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int n=sc.nextInt();
	if(isAutomorphic(n)) {
		System.out.println("It is an Automorphic number");
	}
	else {
		System.out.println("It is not an Automorphic number");
	}
}
}
