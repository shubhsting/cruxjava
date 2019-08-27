package assignment;

import java.util.Scanner;

public class e {

	public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
		
		int n= scn.nextInt();
		int row=1;
		int nsp1=n-1;
		int nsp2=-1;
		int nst=1;
		
		while(row<=n) {
			int a=row;
			int b=n-row+1;
			int d=1;
			int csp=1;
			while(csp<=nsp1) {
				System.out.print(" "+" ");
				csp=csp+1;
			}
			
			int cst=1;
			 
			while(cst<=nst) {
				if(row<=n/2) {
				System.out.print(a+" ");
				a=a-1;}
				else
				{
					System.out.print(b+" ");
					b=b-1;
				}
				cst=cst+1;
			}

			
			 
			 csp=1;
			while(csp<=nsp2) {
				System.out.print(" "+" ");
				csp=csp+1;
			} 
			
			 cst=1;
			 if(row==1||row==n)
				 cst=2;
			while(cst<=nst) {
				System.out.print(d+" ");
				d=d+1;
				cst=cst+1;
			}

			System.out.println();
			
			if(row<=n/2) {
				nst=nst+1;
				nsp1=nsp1-2;
				nsp2=nsp2+2;
			}
			else {
				nst=nst-1;
				nsp1=nsp1+2;
				nsp2=nsp2-2;
				
				
				
			}
			
			
			
			
			
			
			
			
			
			row=row+1;
		}
		



	}
	
	
}