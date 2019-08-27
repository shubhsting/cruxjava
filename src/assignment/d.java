package assignment;

import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		 Scanner scn= new Scanner(System.in);
   		
   		int n= scn.nextInt();
   		int row=1;
   		int nsp=n;
   		int nst=1;
   		int nsp1=n-1;
   		int nst1 =1;
   		while(row<=2*n+1) {
   		int a=n;
   		int b=n-row+1;
   			int cst=1;
 			 
   			while(cst<=nst) {
   				System.out.print(a);
   				a=a-1;
   				cst=cst+1;
   			} 
   			
   			int csp=1;
   			while(csp<=nsp) {
   				System.out.print(" ");
   				csp=csp+1;
   			}
   			 
   			 
   			 
   			
   			  int csp1=1;
   			while(csp1<=nsp1) {
   				System.out.print(" ");
   				csp1=csp1+1;
   			}
   			cst=1;
   			
   			while(cst<=nst1) {
   				System.out.print(b);
   				b=b+1;
   				
   				cst=cst+1;
   			
   			
   			
   			}
   			
   			
   			System.out.println();
   			
   				
   				
   					if(row<=n) {
   					nsp=nsp-1;
   				nst=nst+1;
   				nsp1=nsp1-1;
   				nst1=nst1+1;
   					}
   					else {
   						nsp=nsp+1;
   						nst=nst-1;
   						nsp1=nsp1+1;
           				nst1=nst1-1;
   						
   					}
   					
   				
   			
   			
   			row=row+1;
   			
   		}

	}

}
