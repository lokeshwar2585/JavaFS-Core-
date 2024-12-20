package com.lokesh.java;

public class paranthesis {
	public static void main(String[] args) {
		char c='(';
		char d=')';
		String t="()";
		int n=8;
		int m=n;
		System.out.println();
		for(int i=0;i<n;i++) {
			String s="";
			for(int j=0;j<m;j++) {
				s+=c;
			}
			for(int j=0;j<m;j++) {
				s+=d;
			}
			for(int j=0;j<n-m;j++) {
				s+=t;
			}
			System.out.println("   "+s+"\n");
			if(i!=0 && i!=n-1) {
				String u="";
				for(int j=0;j<n-m;j++) {
					u+=t;
				}
				for(int j=0;j<m;j++) {
					u+=c;
				}
				for(int j=0;j<m;j++) {
					u+=d;
				}
				System.out.println("   "+u+"\n");
			}
			m--;
		}
	}
}
