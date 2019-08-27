package lecture3june10;

import java.util.Scanner;

public class rotation {

	public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
		
		int n= scn.nextInt();
		
		int a=scn.nextInt();
		int rotate=0;
	
		
		int num=0;
		int div=1;
		int ans=0;
		int quo=0;
		int count=0;
		int m=n;
		while(m!=0) {
			
			m=m/10;
			count=count+1;
			
		}
		
		a=a%count;
		if(a<0)
			a=a+count;
		//rotate
		div=n%(int)Math.pow(10, a);
		n=n/(int)Math.pow(10, a);
		quo=n%(int)Math.pow(10, count-a);
		
	
	
	

	ans=div*(int)Math.pow(10, count-a)+quo;
	System.out.println(ans);
}}