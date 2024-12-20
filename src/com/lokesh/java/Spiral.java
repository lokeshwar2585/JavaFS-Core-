package com.lokesh.java;

public class Spiral {
	public static void main(String[] args) {
		int m[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int n=m.length;
		
		System.out.println();
		System.out.print("");
		
		int a=0,b=m.length-1,c=m.length-1,d=0,e=c;
		
		for(int p=0;p<n-a;p++) {
			
			for(int i=a;i<=b;i++) {
				System.out.print(m[p][i]+" ");
			}
			
			for(int i=p+1;i<n;i++) {
				 if(a!=0 && i==n-(a)) {
					 break;
				 }
				System.out.print(m[i][b]+" ");
			}
			
			for(int i=c-1;i>=d;i--) {
				System.out.print(m[c][i]+" ");
			}
			
			for(int i=e-1;i>a;i--) {
				System.out.print(m[i][p]+" ");
			}
			
			a++;
			b--;
			c--;
			d++;
			e--;
		}
		 
		if(a==b && b==d && c==d) {
			System.out.print(m[a][a]+" ");
		}
		
	}
}
