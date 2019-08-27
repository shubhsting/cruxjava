package lecture2june7;

import java.util.Scanner;

public class pattern11 {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
	
		int n= scn.nextInt();
		//initialistaion
				int row = 1;
				int nsp = n-1;
				int nst = 1;
				//no of rows
				while (row <= n) {
		// work
					int b=row;
					int a=nst/2;
						int csp = 1;

						while (csp <= nsp) {
							System.out.print(" "+"\t");
							csp = csp + 1;
						}
						int cst = 1;

						while (cst <= nst) {
							System.out.print("*"+"\t");
							}
							cst = cst + 1;
					
					//preparation
					System.out.println();
					row = row + 1;
					nst = nst +2;
					
					
					
					nsp = nsp - 1;
	}
	}
}
