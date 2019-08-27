package lecture3june10;

import java.util.Scanner;

public class degtofar {

	public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
		
		int init= scn.nextInt();
		int fnit= scn.nextInt();
		int step= scn.nextInt();
		
		int n=init;
		while(n<=fnit)
		{
			 int result=(int)((5.0/9)*(n-32));
			
			System.out.println(n+"\t"+result);
			
			n=n+step;
		}
		

		

	}

}
