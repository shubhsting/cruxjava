package lecture3june10;

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
		
		int n= scn.nextInt();
		int count=1;
		int ans=0;
		int rem=1;
		while(n!=0)
		{
			
			rem=n%10;
			 ans=ans+ (int)Math.pow(10, rem-1)*count;
			
			
			n=n/10;
			count=count+1;
			
		}
		System.out.println(ans);
	}

}
