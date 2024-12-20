package com.lokesh.java;

public class zeros {
	public static void main(String args[]) {
		int a[]= {1,1,0,1,0,0,1};
		int c=0;
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				c++;
			}
		}
		for(int i=0;i<c;i++) {
			b[i]=1;
		}
		for(int i=c;i<a.length-c;i++) {
			b[i]=0;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(b[i]+" ");
		}
	}
}
