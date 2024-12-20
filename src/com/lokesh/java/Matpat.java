package com.lokesh.java;

public class Matpat {
	public static void main(String[] args) {
		
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,0,12},{13,14,15,0}};
		int f=0;
		int c=0;
		int in=0;
		int b[]= new int[3];
		int d[]=new int[3];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]==0) {
					b[in]=i;
					d[in]=j;
					in++;
					c++;
				}
			}
		}
		
		System.out.println("\n  Inital matrix: ");
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print("   ");
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]==0){
						
					for(int m=0;m<c;m++) {
						if(i==b[m] && j==d[m]) {
								
							for(int k=0;k<a[i].length;k++) {
								a[i][k]=0;
							}
							for(int k=0;k<a[i].length;k++) {
								a[k][j]=0;
							}
							f=1;
						}
					}
				}
			}
		}
				
		
		System.out.println("\n  Final matrix: ");
		System.out.println();
		
		for(int i=0;i<a.length;i++) {
			System.out.print("   ");
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
