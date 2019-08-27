package assignment;


import java.util.*;
public class i {
    public static void main(String args[]) {
    	Scanner scn= new Scanner(System.in);
		
		int a= scn.nextInt();
		int i=1;
	String num21="";
	String num2="";
		while(i<=a) {
		int n= scn.nextInt();
		int rem1=0;
		int num1=0;
		int multiplier1=1;
		
		
		while(n!=0) {
			rem1=n%10;
			num1=num1+rem1*multiplier1;
			multiplier1=multiplier1*2;
			n=n/10;
			 			
		}
		num21=Integer.toString(num1);
		 num2=num2+"\n"+num21;

		i=i+1;
				}
				System.out.println(num2);

		
    }
}
