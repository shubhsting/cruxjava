package lecture2june7;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=1;
		int nst=1;
		int a=0;
		int b=1;
		int  sum=0;

		
		
		while(row<=n) {
			int count=1;
			int cst=1;
			while(cst<=nst) {
								while(count<=row)
				{
					System.out.print(a+"\t");
					sum=a+b;
					
					a=b;
					b=sum;
					count=count+1;
					
				}
					cst=cst+1;
				}
			
			
			
			
			
			System.out.println();
			
			nst=nst+1;
			
			row=row+1;
		}
	}

	}


