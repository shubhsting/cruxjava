package assignment;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
		
		int n= scn.nextInt();
		int row=1;
		int nsp=n-1;
		
				int nst=1;
		while(row<=n) {
			int a=1;
			int b=row;
			int cst=1;
			while(cst<=nst) {
				
				System.out.print(a+"\t");
				cst=cst+1;
				a=a+1;
			}
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" "+"\t");
				csp=csp+1;
			}
			 csp=2;
			while(csp<=nsp) {
				System.out.print(" "+"\t");
				csp=csp+1;
			}
			 
		     cst=1;
		     if(row==n) {
		    	 cst=2;
		    	 b=row-1;}
			while(cst<=nst) {
				
				System.out.print(b+"\t");
				cst=cst+1;
				b=b-1;
			}
			
			
			
			
			
			System.out.println();
			
				nsp=nsp-1;
				nst=nst+1;
				
			
			
			row=row+1;
			
			
		}


	}

}
