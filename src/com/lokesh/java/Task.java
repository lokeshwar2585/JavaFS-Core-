package com.lokesh.java;

import java.util.Scanner;

interface Shapes{
	void collect();
	void calData();
	void disp();
}
class Circle implements Shapes{
	static Scanner sc=new Scanner(System.in);
	static double pi=3.14768;
	int radius;
	static double area;
	@Override
	public void collect() {
		System.out.println("Enter the radius value");
		radius=sc.nextInt();
	}
	@Override
	public void calData() {
		area=2*pi*radius*radius;
	}
	@Override
	public void disp() {
		System.out.println("Area of circle "+area);
	}
}
class Square extends Circle implements Shapes{
	static int s1,s2;
	@Override
	public void collect() {
		System.out.println("Enter the side1 value");
		s1=sc.nextInt();
		System.out.println("Enter the side2 value");
		s2=sc.nextInt();
	}
	@Override
	public void calData() {
		area=s1*s2;
	}
	@Override
	public void disp() {
		System.out.println("Area of square "+area);
	}
}
class Rec extends Square implements Shapes{
	@Override
	public void collect() {
		System.out.println("Enter the side value");
		s1=sc.nextInt();
	}
	@Override
	public void calData() {
		area=s1*s1;
	}
	@Override
	public void disp() {
		System.out.println("Area of Reactangle "+area);
	}
}
public class Task {

	public static void main(String[] args) {
		
		Shapes c=new Circle();
		c.collect();
		c.calData();
		c.disp();
		System.out.println("--------------------");
		Shapes r=new Rec();
		r.collect();
		r.calData();
		r.disp();
		System.out.println("---------------------");
		Shapes s=new Square();
		s.collect();
		s.calData();
		s.disp();
	
	}


}