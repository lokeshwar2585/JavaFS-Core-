package com.lokesh.java;

class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}

class MyException2 extends Throwable{
	public MyException2(String s) {
		super(s);
	}
}

public class CustomEx {
	public static void main(String[] args) {
		try {
			throw new MyException2("New Exception");  
		}
		catch(MyException2 e2) {
			System.out.println("Exception caught");
			System.out.println(e2.getMessage());
		}
	}
}
