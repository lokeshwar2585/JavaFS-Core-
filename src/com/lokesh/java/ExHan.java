package com.lokesh.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExHan {
	public static void main(String[] args) {

		calage(18);
		
	}
	static void calage(int a) throws ArithmeticException{
			if(a<18) {
				throw new ArithmeticException("Enter vaild age");
			}
			else{
				System.out.println("Eligible");
			}
	}
}
