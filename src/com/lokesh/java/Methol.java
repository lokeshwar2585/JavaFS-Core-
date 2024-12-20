package com.lokesh.java;

public class Methol {
	static void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	static void add(int a, int b,int c) {
		 c=a+b;
		System.out.println(c);
	}
	static void add(int a) {
		
		System.out.println(a);
	}
	static void add(int a, int b,int c ,int d) {
		 d=a+b+c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		System.out.println("Method OverLoading");
		add(1,2);
		add(1,2,3,4);
		}
}
