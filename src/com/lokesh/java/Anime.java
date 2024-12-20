package com.lokesh.java;
import java.util.Scanner;

public class Anime {	
	public static void main(String args[]) {
		{
			int a[]= {1,2,3,4};
			int b=0;
			int c=a.length-1;
			while(c>b) {
				a[b]=a[b]+a[c];
				a[c]=a[b]-a[c];
				a[b]=a[b]-a[c];
				b++;
				c--;
			}
			System.out.println();
			System.out.print(" ");
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]);
				if(i!=a.length-1) {
					System.out.print(", ");
				}
			}	
		}
	}
}
