package assignment;

import java.util.Scanner;

public class f {

	public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
		
		int n= scn.nextInt();
		int row=1;
		int nst=1;
		
		int nsp= 2*n-1;
		while(row<=2*n+1) {
			int a=n;
			int cst=1;
			
			int b=n-row+1;
			int c=row-n-1;
			int d=row-n;
			while(cst<=nst) {
				System.out.print(a+" ");
				a=a-1;
				cst=cst+1;
			}
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" "+" ");
				csp=csp+1;
			}
			
			 cst=1;
			 if(row==n+1)
			 cst=2;
			while(cst<=nst) {
				
				
				
			 if(row<=n) {
				System.out.print(b+" ");
				b=b+1;
				}
				
			else if(row==n+1) {
					System.out.print(d+" ");

								d=d+1;}
				else {
					System.out.print(c+" ");
					c=c+1;
				}
				
				
				cst=cst+1;
			}
			System.out.println();

			if(row<=n) {
				
				nst=nst+1;
				nsp=nsp-2;
				
			}
			else {
				nst=nst-1;
				nsp=nsp+2;
			}
			
			
			
			row=row+1;
		}

	}

}
