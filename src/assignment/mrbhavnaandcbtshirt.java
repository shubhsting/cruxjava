package assignment;

import java.util.Scanner;

public class mrbhavnaandcbtshirt {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		for(int i=1;i<=n;i++) {
			int p=scn.nextInt();
			int[] arr=takeInput(p);
			display(arr);
			
		}
        
	}
public static int[] takeInput(int n) {
		
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			int val = decimal(i+1);
			arr[i]=val;
		 }
		
		
		
		return arr;
	}
		
		public static void display(int[] arr1) {
			
			
			for(int i=0;i<arr1.length;i++) {
				System.out.print(arr1[i]+" ");
				
				
			}
			System.out.println();
	
			
		}
		
 public static int decimal(int n) {
	 int rem=0;
		int num=0;
		int multiplier=1;
		
	 while(n!=0) {
			rem=n%2;
			num=num+rem*multiplier;
			multiplier=multiplier*10;
			n=n/2;
			
		}
	 return num;
 }
 
}
