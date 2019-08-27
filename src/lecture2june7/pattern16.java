package lecture2june7;

import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		int n= scn.nextInt();
		int row=1;
		int nsp=0;
		int nst=(n/2)+1;
		while(row<=n) {
			
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst=cst+1;
			}
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp=csp+1;
			}
			 cst=1;
			 if(row==1||row==n)
				 cst=2;
			 
				 
			 			while(cst<=nst) {
				System.out.print("*");
				cst=cst+1;
			}
			
			System.out.println();
			
			if(row<=n/2) {
				nsp=nsp+1;
				nst=nst-1;
			}
						else {
				nsp=nsp-1;
				nst=nst+1;
			}
			
			row=row+1;
			
			
		}

	}

}
