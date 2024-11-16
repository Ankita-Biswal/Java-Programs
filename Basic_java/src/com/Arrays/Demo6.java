package com.Arrays;

interface Animal{
	void makeSound();
}
class Dog implements Animal{
	public void makeSound() {System.out.println("Bow bow");}
	public void jump() {System.out.println("jumped");}
}
class cat implements Animal{
	public void makeSound() {System.out.println("meow");}
}
public class Demo6 {
public static void main(String[] args) {
	Animal[]a=new Animal[4];
	a[0]=new Dog();
	a[1]=new cat();
	a[2]=new cat();
	a[3]=new Dog();
	for(Animal n:a) {
		n.makeSound();
		if(n instanceof Dog)((Dog)n).jump();
	}
}
}
