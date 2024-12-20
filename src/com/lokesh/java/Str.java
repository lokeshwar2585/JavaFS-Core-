package com.lokesh.java;
import java.util.Scanner;

public class Str {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int k=0;
		String a="Good";
		String b="Morning";
		String r="  ";
		int n=s.nextInt();
		if(n>=a.length()) {
			r=r+a+b;
		}
		else{
				while(k<a.length()-1 && k<b.length()-1) {
					for(int i=k;i<k+n;i++) {
						r=r+a.charAt(i);
					}
					for(int i=k;i<k+n;i++) {
						r=r+b.charAt(i);
					}
					k=k+n;
				}
					for(int i=k;i<a.length();i++) {
						r=r+a.charAt(i);
					}
					for(int i=k;i<b.length();i++) {
						r=r+b.charAt(i);
					}
		}
		System.out.println(r);
	}
}
 