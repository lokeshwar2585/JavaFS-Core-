package com.lokesh.java;

import java.util.Scanner;

class Farmer{
	double p;
	static double r;
	double t;
	double si;
	
	static {
		r=2.5;
	}
	
	void collectData(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your principle amount: ");
		p=s.nextDouble();
		System.out.println("Enter your Time in years: ");
		t=s.nextDouble();
		System.out.println(" ");
	}
	
	void cal() {
		si=(p*t*r)/100;
	}
	
	void disp() {
		System.out.println("Simple Interest: "+ si);
	}
}
public class Simpin {
	public static void main(String[] args) {
		Farmer sai=new Farmer();
		sai.collectData();
		sai.cal();
		sai.disp();
	}
}
