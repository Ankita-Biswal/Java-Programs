package com.lamdaexp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> list=Arrays.asList("amaran","maran","aran","ran","ra","ramana","raman");
     
     Predicate<String> p=i->i.length()>=5;
     
     for(String s:list) {
    	 if(p.test(s))
    		 System.out.println(s);
     }
	}

}
