package com.lokesh.java;

import java.util.Scanner;

class Data{
	
	String name;
	String email;
	String pwd;
	int age;
	Long ph;
	
	//Setters
	void setname(String name) {
		this.name=name;
	}
	void setemail(String email) {
		this.email=email;
	}
	void setpwd(String pwd) {
		this.pwd=pwd;
	}
	void setage(int age) {
		this.age=age;
	}
	void setph(long ph) {
		this.ph=ph;
	}
	
	//Getters
	public String getname() {
		return name;
	}
	public String getemail() {
		return email;
	}
	public String getpwd() {
		return pwd;
	}
	public int getage() {
		return age;
	}
	public Long getph() {
		return ph;
	}
	
}
public class Info {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Data p1 = new Data();
		Data p2 = new Data();
		Data p3 = new Data();
		
		String n;
		String e;
		String p;
		int a;
		Long m;

		System.out.println("Enter name: ");
		n=s.next();
		System.out.println("Enter Email: ");
		e=s.next();
		System.out.println("Enter Password: ");
		p=s.next();
		System.out.println("Enter Age: ");
		a=s.nextInt();
		System.out.println("Enter Phone: ");
		m=s.nextLong();
			
		p1.setname(n);
		p1.setemail(e);
		p1.setpwd(p);
		p1.setage(a);
		p1.setph(m);
			
		System.out.println("\n");
			
		System.out.println("Name     : "+p1.getname());
		System.out.println("Eamil    : "+p1.getemail());
		System.out.println("Password : "+p1.getpwd());
		System.out.println("Age      : "+p1.getage());
		System.out.println("Phone    : "+p1.getph());
	}
}
