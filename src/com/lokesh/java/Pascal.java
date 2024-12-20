package com.lokesh.java;

import java.util.ArrayList;

public class Pascal {
	public static void main(String args[]) {
		int n=5;
		int a[]= {1,1,1};
		int m=3;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-i+1;j++) {
				System.out.print(" ");
			}		
			if(i==0) {
				System.out.println(1+" ");
			}
			else if(i==1) {
				System.out.println(1+" "+1);
				m=4;
			}	
			else {
			}
		}
	}
}
