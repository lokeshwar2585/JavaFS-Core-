package com.lokesh.java;

public class Twodarr {
	public static void main(String args[]) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			int n=2;
			for(int j=0;j<3;j++) {
				b[i][j]=a[n][i];
				n--;
			}
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.print("  ");
			for(int j=0;j<3;j++) {	
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
