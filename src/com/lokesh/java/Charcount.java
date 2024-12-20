package com.lokesh.java;

import java.util.Scanner;

public class Charcount {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s= sc.next();
		int n=sc.nextInt();
		char c[]=s.toCharArray();
		char e[] = new char[c.length];
		int in=0;
		
		for(int i=0;i<c.length;i++) {
			int f=0;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					f=1;
				}
			}
			if(f==0) {
				e[in]=c[i];
				in++;
			}
		}
		for(int j=0;j<e.length;j++) {
			System.out.print(e[j]);
		}
		System.out.println();
		for(int i=0;i<e.length;i++) {
			for(int j=i+1;j<n+1;j++) {
				String t="";
				t+=e[i];
				t+=e[j];
				System.out.println(t);
			}
		}
	}
}
