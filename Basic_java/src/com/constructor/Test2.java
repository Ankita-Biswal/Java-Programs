//call-to-this-calling the zero-argument constructor using this()
package com.constructor;

class A{
	A(){
		System.out.println("Implementation for default constructor");
	}
	A(int i){
		this();//zero-argument constructor calling
		System.out.println("Implementation for parameterised constructor");
	}
}
public class Test2 {

	public static void main(String[] args) {
		new A(10);
	}

}
