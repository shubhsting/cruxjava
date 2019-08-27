package lecture2june7;

import java.util.Scanner;

public class pattern32 {

	public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
		
		int n= scn.nextInt();
		int row=1;
		
		int nst=1;int val=1;
		while(row<=2*n-1) {
		
			
			int cst=1;
			while(cst<=nst) {
				
				if(cst%2==0) {
					System.out.print("*");
				}
				else {
				System.out.print(val);}
				cst=cst+1;
			}
			
			System.out.println();
			if(row<=n-1) {
				
				nst=nst+2;
				val=val+1;
			}
			else {
				
				nst=nst-2;
				val=val-1;
				
			}
			
			row=row+1;
			
			
		}

	}

}
