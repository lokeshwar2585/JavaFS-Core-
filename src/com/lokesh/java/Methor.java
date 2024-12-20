package com.lokesh.java;
class Parent{
	public void add() {
		System.out.println("Hello");
	}
}
class Child extends Parent{
	@Override
	public void add() {
		System.out.println("Hey there");
	}
}
public class Methor {
	 public static void main(String[] args) {
		Child c=new Child();
		c.add();
	}
}
