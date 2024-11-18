package com.string;
import java.util.*;
public class NumtoWord {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter one number");
    int num=sc.nextInt();
	numW(num/10000000," crore " );
	numW((num/100000)%100," lakhs " );
	numW((num/1000)%100," thousand " );
	numW((num/100)%10," hundred" );
	numW(num%100,"" );
	
}
 public static void numW(int num,String s) {
	 String[]one= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven"
			       ,"twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	 String[]two= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
	 
	 if(num<=19)
		 System.out.print(one[num]);
	 else
		 System.out.print(two[num/10]+""+one[num%10]);
	 if(num!=0)
		 System.out.print(s);
 }
}
