package com.lamdaexp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class example1 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Predicate<Integer> p= i-> i%2==0;
		
		for(int n:list) {
			if(p.test(n))
			System.out.println(n);
		}
	}
}
