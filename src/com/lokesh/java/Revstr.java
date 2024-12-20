package com.lokesh.java;

public class Revstr {
	public static void main(String args[]) {
		String a="Hello good morning how are you";
		String b="";
		int in=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==' ' || i==a.length()-1) {
				String s=a.substring(in,i+1);
				String t="";
				for(int j=s.length()-1;j>=0;j--) {
					t=t+s.charAt(j);
				}
				b=b+t+" ";
				in =i+1;
			}
		}
		System.out.println(b);
	}

}
