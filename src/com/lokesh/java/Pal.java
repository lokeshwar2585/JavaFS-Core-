package com.lokesh.java;
public class Pal {

	public static void main(String args[]) {
		int a=567;
		String b=String.valueOf(a);
		String c="";
		for(int i=b.length()-1;i>=0;i--) {
			c=c+b.charAt(i);
		}
		while(b!=c) {
			int d=Integer.parseInt(b)+Integer.parseInt(c);
			String e=String.valueOf(d);
			String f="";
			for(int i=e.length()-1;i>=0;i--) {
				c=c+e.charAt(i);
			}
			if(e==f) {
				System.out.println("Done");
				break;
			}
			else {
				a=Integer.parseInt(b)+Integer.parseInt(c);
				b=String.valueOf(a);
				c="";
				for(int i=b.length()-1;i>=0;i--) {
					c=c+b.charAt(i);
				}
			}
		}
	}
}
