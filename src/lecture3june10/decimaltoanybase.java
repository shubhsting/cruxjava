package lecture3june10;

import java.util.Scanner;

public class decimaltoanybase {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int rem1=0;
		int num1=0;
		int multiplier1=1;
		int n= scn.nextInt();
		
		int a=scn.nextInt();
		
		while(n!=0) {
			rem1=n%a;
			num1=num1+rem1*multiplier1;
			multiplier1=multiplier1*10;
			n=n/a;
			
		}
		System.out.println(num1);


	}

}
