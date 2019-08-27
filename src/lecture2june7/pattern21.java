package lecture2june7;

import java.util.Scanner;

public class pattern21 {

	public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
		
		int n= scn.nextInt();
		int row=1;
		int nsp=2*n-3;
		int nst=1;
		
		while(row<=n) {
			int a=1;
			 int cst=1;
			 
			while(cst<=nst) {
				System.out.print(a);
				a=a+1;
				cst=cst+1;
			}
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp=csp+1;
			}
			 cst=1;
			 int b=row;
			 if(row==n) {
				 cst=2;
			 }
			
			while(cst<=nst) {
				System.out.print(b);
				b=b-1;
				cst=cst+1;
			}
			
			
			System.out.println();
			
				
				
					
					nsp=nsp-2;
				nst=nst+1;
				
				
			
			
			row=row+1;
			
		}
		
	}
		
	

}
