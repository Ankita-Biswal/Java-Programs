package Recursion;
import java.util.*;
public class SpyNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one number:");
		int n=sc.nextInt();
		if(isSpy(n)) {
			System.out.println("It is a Spy number");
		}
		else {
			System.out.println("It is not a Spy number");
		}

	}

	static boolean isSpy(int n) {
		if(n==0)return false;
		int Sum=SumofDig(n);
		int Prod=ProdofDig(n);
		return Sum==Prod;
	}
   static int SumofDig(int n) {
	   if(n==0)return 0;
	   return (n%10)+SumofDig(n/10);
   }
  static int ProdofDig(int n) {
	  if(n==0)return 1;
	  return (n%10)*ProdofDig(n/10);
  }
}
