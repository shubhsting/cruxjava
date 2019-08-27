package assignment;

import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=1;
		int nst=2*n+1;
		int nsp=0;
		
		while(row<=2*n+1) {
			int a=n-row+1;
			int b=row-n-1;
			int csp=1;
			while(csp<=nsp) {
				
				System.out.print(" "+" ");
				
				csp=csp+1;
			}
			int cst=1;
			while(cst<=nst)
			{
				if(row<=n) {
				if(cst<=nst/2) {
				System.out.print(a+" ");
				a=a-1;}
				else {
					System.out.print(a+" ");
					a=a+1;
				}}
				else {
					
					if(cst<=nst/2) {
						System.out.print(b+" ");
						b=b-1;}
						else {
							System.out.print(b+" ");
							b=b+1;
						}
					
				}
				cst=cst+1;
			}
			System.out.println();
			if(row<=n)
			{
				nsp=nsp+1;
				nst=nst-2;
				
			}
			else {
				nsp=nsp-1;
				nst=nst+2;
			}
			
			
			
			row=row+1;
		}

	}

}
