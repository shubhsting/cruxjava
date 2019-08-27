package assignment;

import java.util.Scanner;

public class alexgoesshopping {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	        int size = scn.nextInt();
	        int []arr = new int[size];
	        for(int i=0;i<size;i++)
	        	arr[i]=scn.nextInt();
	        int queries = scn.nextInt();
	        while(queries>=1) {
	        	
	        	int count=0;
	        	int a = scn.nextInt();
	        	int q = scn.nextInt();
	        	for(int i=0;i<arr.length;i++) {
	        		
	        		if(a%arr[i]==0)
	        		  count++;
	        	}
	        	if(count>=q)
	        		System.out.println("Yes");
	        	else
	        		System.out.println("No");
	        	queries--;
	        }

	}

}
