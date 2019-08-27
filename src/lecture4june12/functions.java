package lecture4june12;

import java.util.Scanner;

public class functions {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int a= scn.nextInt();
		int b= scn.nextInt();
		printPrimes(a,b);

	}
	
	public static void printPrimes(int lo,int high) {
		for(int n=lo;n<=high;n++) {
		boolean res=isPrime(n);	
				if(res)
			System.out.println(n);
			
		}
		
		
		
	}

	private static boolean isPrime(int n) {
	  int count=0;
	  
	  for(int i=1;i<=n;i++) {
		  if(n%i==0) {
			  count=count+1;
		  }
	  }
	  if(count==2)
		return true;
	  else {
		  return false;
	  }
	}

}
