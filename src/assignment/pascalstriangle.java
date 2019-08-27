package assignment;

import java.util.Scanner;

public class pascalstriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=0;
		int nst=1;
				
		while(row<n) {
			int cst=1;
			int x=0;

			while(cst<=nst) {
				long result=0;
				long factorial1 = 1;
		        for(int i = 1; i <= row; ++i)
		        {
		            
		            factorial1 *= i;
		        }
		        long factorial2 = 1;
		        for(int j = 1; j <= x; ++j)
		        {
		            
		            factorial2 *= j;
		        }
		        long factorial3 = 1;
		        for(int k = 1; k <= row-x; ++k)
		        {
		           
		            factorial3 *= k;
		        }
		        
		        result=factorial1/(factorial2*factorial3);
				System.out.print(result+"\t");
				
				cst=cst+1;
				x=x+1;
			}
			System.out.println();
			nst=nst+1;
			
			row=row+1;
		}

	}

}
