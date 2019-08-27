package assignment;

import java.util.Scanner;

public class calculatesum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			 arr[i]=scn.nextInt();
			 
		}
		int[] ar=new int[n];
		int b=scn.nextInt();
		for(int j=0;j<b;j++) {
			int m=scn.nextInt();
			for(int s=0;s<=arr.length-1;s++) {
				int k=s-m;
				if(k>=0) {
					ar[s]=arr[s]+arr[k];
				}
				else {
					 k=arr.length+s-m;
					 ar[s]=arr[s]+arr[k];
				}
			}
			arr=ar;
		}
		
		int sum=0;
		for(int p=0;p<=arr.length-1;p++) {
			sum=sum+arr[p];
		}
		int l=(int)(Math.pow(10, 9)+7)	;
		int result=0;
		result=sum%l;
		System.out.println(result);
	}
	
	
}
