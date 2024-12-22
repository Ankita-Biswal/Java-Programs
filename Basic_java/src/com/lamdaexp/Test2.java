package com.lamdaexp;

interface I2{
	int m1(int i,int j);
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    I2 i2=(i,j)->{return i*j;};
    
    int res=i2.m1(30, 90);
    System.out.println(res);
	}

}
