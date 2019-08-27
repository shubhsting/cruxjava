package lecture2june7;

import java.util.Scanner;

public class pattern0 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		//initialistaion
		int row = 1;
		int nsp = 0;
		int nst = n;
		//no of rows
		while (row <= n) {
// work
			int csp = 1;

			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}
			int cst = 1;

			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;
			}
			//preparation
			System.out.println();
			row = row + 1;
			nst = nst - 1;
			nsp = nsp + 2;
		}

	}

}
