package assignment;

import java.util.Scanner;

public class replacethemmall {

	public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
		
		long n= scn.nextLong();
long start=0;
long rem=0;
long no=0;
long multiplicant=1;
if(n==0)
	no=5;
else {
	while(n!=0) {
		rem=n%10;
		if(rem==0) {
			no=no+5*multiplicant;
		}
		else {
			no=no+rem*multiplicant;
			
		}
		multiplicant=multiplicant*10;
		n=n/10;
		
	}}
	
	System.out.println(no);
	}

}
