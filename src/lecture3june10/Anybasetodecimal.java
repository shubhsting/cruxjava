package lecture3june10;

import java.util.Scanner;

public class Anybasetodecimal {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int rem=0;
		int num=0;
		int multiplier=1;
		
		int source=scn.nextInt();
		int rem1=0;
		int num1=0;
		int multiplier1=1;
		
		
		int dest=scn.nextInt();
		int n= scn.nextInt();
		while(n!=0) {
			rem=n%10;
			num=num+rem*multiplier;
			multiplier=multiplier*source;
			n=n/10;
			
		}
		
		
		while(num!=0) {
			rem1=num%dest;
			num1=num1+rem1*multiplier1;
			multiplier1=multiplier1*10;
			num=num/dest;
			
		}
		System.out.println(num1);
         

	


	}

}
