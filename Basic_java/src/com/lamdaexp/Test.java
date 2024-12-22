package com.lamdaexp;

@FunctionalInterface
interface I1{
	void m1(int i);
}




public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      I1 i1= i->System.out.println(i*i);
      i1.m1(10);
	}

}
