package com.map;

import java.util.HashMap;
import java.util.Map;

public class demo1 {
public static void main(String[] args) {
	Map map1=new HashMap();
	map1.put(101, "Ankita");
	map1.put(102, "Soumitra");
	map1.put(103, "Ruchi");
	map1.put(104, "Rintu");
	map1.put(105, "Chintu");
	System.out.println(map1);
	Map map2=new HashMap();
	map2.put("abc",1011);
	map2.put("xyz",1022);
	System.out.println(map2);
	
	map1.putAll(map2);
	System.out.println(map1);
	
	System.out.println(map1.get(103));
	System.out.println(map1.get(108));
}
}
