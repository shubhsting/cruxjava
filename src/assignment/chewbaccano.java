package assignment;

import java.util.Scanner;

public class chewbaccano {

	public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
		
		long n= scn.nextLong();
		long result=0;
		int multiplier=1;
		while(n!=0) {
			
			long a=0;
			long b=0;
			if(n==9) {a=9;
			b=12;}
			else {
			a=n%10;
			b=9-a;}
			if(b<a) {
								result=b*multiplier+result;
								multiplier=multiplier*10;

			}
			else {
				
				result=a*multiplier+result;
				multiplier=multiplier*10;
			}
			
			n=n/10;
		}

		System.out.println(result);
	}

}
