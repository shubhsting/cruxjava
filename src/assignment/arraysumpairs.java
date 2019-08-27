package assignment;

import java.util.Scanner;

public class arraysumpairs {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[]arr= takeInput();
		int z = scn.nextInt();
		sum(arr,z);

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
public static void sum(int[] arr,int sum) {
	int low=0;
	int high=arr.length-1;
	for(int lo=0;lo<=high-1;lo++) {
	for(int hi=1;hi<=high;hi++) {
		
		if(arr[lo]+arr[hi]==sum) {
			System.out.println(arr[lo]+" "+"and"+" "+arr[hi]);
		}
	}
	}
	
	
	
	
	
}
}
