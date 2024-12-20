package com.lokesh.java;
class A{
	//inherited
	void eat() {
		System.out.println("Parent Eats");
		
	}
	//overriden
	void sleep() {
		System.out.println("Parent sleeps");
	}
	//inherited
	void run() {
		System.out.println("Parent run 5km");
	}
	
}
class B extends A{
	void sleep() {
		System.out.println("Child sleeps");
	}
}
public class Inher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
