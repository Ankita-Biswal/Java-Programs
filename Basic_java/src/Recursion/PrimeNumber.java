package Recursion;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A NUmBER");
		int n = sc.nextInt();
		
		int div=n/2;
	          int res = (isPrime(n,div));
	       if(res==1) {
	    	   System.out.println(n+ " is a Prime Number");
	       }  else {
	    	   System.out.println(n + " is Not a Prime NUmber");
	       }       	
	}
            static int isPrime(int n , int div ) {
            	if (n<=1)return 0;
            	if(div==1)return 1;
            	if(n%div==0)return 0;
            	return isPrime(n,div-1);
            	
            }
	}


