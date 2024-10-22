//constructor overloading-creating multiple constructor using different parameters
package com.constructor;

public class Box {

	int height;
	int width;
	int length;
	Box(){
		
	}
	Box(int h,int w,int l){
		height=h;
		width=w;
		length=l;
	}
	Box(int d){
		height=d;
		width=d;
		length=d;
	}
	void display() {
		System.out.println("["+height+","+width+","+length+"]");
	}
	public static void main(String[] args) {
		Box b1=new Box();
		b1.display();
		Box b2=new Box(10,20,30);
		b2.display();
		Box b3=new Box(6);
		b3.display();
	}

}
