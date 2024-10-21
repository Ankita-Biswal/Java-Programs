package Recursion;
import java.util.*;
public class AmStrongNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count=pow(num);
		int sum=isAmstrong(num,count);
		System.out.println(sum);
		if(num==sum) {
		System.out.println(num+"is an amstrong no");
	}
	else {
			System.out.println(num+"is not an amstrong no");
		}
	}

	static int isAmstrong(int n, int pow) {
		if(n==0) return 0;
		
		int d=n%10;
		return (int)Math.pow(d,pow)+isAmstrong(n/10,pow);
	}
	static int pow(int num) {
		if (num==0)return 0;
		
		return 1+pow(num/10);
		
	}

}
