package lecture4june12;

import java.util.Scanner;

public class array {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
   int[]arr= takeInput();
   display(arr);
   int a=max(arr);
   System.out.println("Highest item is "+a);
   int z = scn.nextInt();
   int m=linearsearch(arr,z);
   System.out.println(m);
	}
	public static int[] takeInput() {
		
		System.out.println("size");
		int n = scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			int val = scn.nextInt();
			arr[i]=val;
		 }
		
		
		
		return arr;
	}
		
		public static void display(int[] arr1) {
			
			
			for(int i=0;i<arr1.length;i++) {
				System.out.print(arr1[i]+" \t");
				
				
			}
			System.out.println();
	
			
		}
		

		
		
		
		public static int max(int[] arr) {

			int ab = 0;
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]>ab)
					ab=arr[i];
				
				
			}
			
			return ab;}
		
		
		
		
		public static int linearsearch(int arr[],int item) {
			int i=0;
			for( i=0;i<=arr.length;i++) {
				if(arr[i]==item) {
					return i;
				}
			
				}
			return -1;
			}
			
			
			
			
			
			
		}
		
	

