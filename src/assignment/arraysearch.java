package assignment;

import java.util.Scanner;

public class arraysearch {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[]arr= takeInput();
		if(arr==null) {}
		else {
		int z = scn.nextInt();
		   int m=linearsearch(arr,z);
		   System.out.println(m);}
	}
	
public static int[] takeInput() {
		
		
		int n = scn.nextInt();
		if(n>0) {
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			int val = scn.nextInt();
			arr[i]= val;
		 }
		
		
		
		return arr;
		}
		else {
		
		
		int[] arr = null;
		return arr;}
		}
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
