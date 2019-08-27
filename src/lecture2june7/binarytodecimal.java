package lecture2june7;

import java.util.Scanner;

public class binarytodecimal {

	public static void main(String[] args) {
		
		
Scanner scn= new Scanner(System.in);
	int i=1;
	int rem1;
	int sumodd=0;
	int sumeven=0;
	String s = "";
	int rem2=0;
	int n=scn.nextInt();
	while(i<=n)
	{
		int dest=scn.nextInt();
		
			
		while(dest!=0)
		{
			rem1=dest%10;
			 sumodd=sumodd+rem1;
			 dest=dest/10;
			 rem2=dest%10;
			 sumeven=sumeven+rem2;
			 dest=dest/10;
			 
		}
		
		if((sumodd)%3==0||(sumeven)%4==0)
		 s="yes"+"\n" +s;
		else
			s="no"+"\n"+s;
		i=i+1;
	}
	System.out.print(s);
	
	

}}