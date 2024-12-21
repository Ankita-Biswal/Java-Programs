package com.lamdaexp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list=Arrays.asList(1,2,3,4,5);
     Function<Integer, Integer> fn=i->i*i;
     
     for(int n:list) {
    	 System.out.println((fn.apply(n)));
     }
	}

}
