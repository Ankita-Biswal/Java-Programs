package com.Arrays;

import java.util.Arrays;

public class Demo4 {
public static void main(String[] args) {
	int[]a= {1,2,3,4};
	System.out.println("a="+Arrays.toString(a));
	int[]b=new int[4];
	System.arraycopy(a, 0, b, 0, 4);
	System.out.println("b="+Arrays.toString(b));
	System.arraycopy(a, 0, b, 0, 0);
}
}
