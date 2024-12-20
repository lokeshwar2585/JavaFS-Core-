package com.lokesh.java;

interface cal {

}
interface calc1{
	int a=10;//constant
	void add();
	void sub();
}

abstract class sample implements calc1{
	@Override
	public void add() {
		System.out.println("inside abstract class");
	}
}
class sample1 implements calc1{
	@Override
	public void add() {
		System.out.println("inside sample 1");
	}
	
	public void sub() {
		System.out.println("inside sample 1");
	}
	
}

class sample2 extends sample1 implements calc1{
	@Override
	public void add() {
		System.out.println("inside sample 2");
	}
	@Override
	public void sub() {
		System.out.println("inside sample 2");
	}
	
}

public class Inter {
	public static void main(String[] args) {
		sample1 s1=new sample1();
		sample1 s2=new sample2();
		sample s3=new sample();
		s1.add();
		s1.sub();
		s2.add();
		s2.sub();
	}
}
