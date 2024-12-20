package com.lokesh.java;

public class Pat2 {
	public static void main(String[] args) {
		int n=6;
		int m=0;
		for(int i=0;i<n;i++) {
			if(i==5) {
				m=1;
			}
			if(i==4) {
				m=3;
			}
			if(i==3) {
				m=5;
			}
			if(i==2) {
				m=7;
			}
			if(i==1) {
				m=9;
			}
			for(int j=0;j<n;j++) {
				if(i==0 || j==0) {
					System.out.print("# ");
				}
				else if(i+j==n-4 || i+j==n-2 || i+j==n-3 || i+j==n-1) {
					System.out.print("# ");
				}
				else {
					System.out.print(m+" ");
					m=m+2;
				}
			}
			System.out.println();
		}
	}
}
{1,2,3},{4,5,6},{7,8,9}
