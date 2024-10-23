package Recursion;
import java.util.*;
public class HappyNum {

	 static int isHappy(int n) {
		if(n==0)return 0;
		return sumSq(n);
	}
	static int sumSq(int i) {
		if(i==0)return 0;
		int d=i%10;
		return d*d+sumSq(i/10);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one number:");
		int n=sc.nextInt();
		int m;
		while(n!=1&&n!=4) {
			m=isHappy(n);
			n=m;
		}
      if(n==1) {
    	  System.out.println("It is HappyNo");
      }
      else {
    	  System.out.println("It is not HappyNo");
      }
	}

}
