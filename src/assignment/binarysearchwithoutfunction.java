package assignment;

import java.util.Scanner;

public class binarysearchwithoutfunction {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("size");
		int n = scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			int val = scn.nextInt();
			arr[i]=val;}
		
		int item = scn.nextInt();
		int low=0;
		int hi=arr.length-1;
		while(low<hi) {
			int mid=(low+hi)/2;
			if(item>arr[mid]) {
				low=mid+1;
			}
			else if(item<arr[mid]) {
				hi=mid-1;
		
			}
			 if(item==arr[mid]) {
				System.out.println(mid);
			break;}
			
			else{System.out.println("-1");
			}
		}
		
		
		
		
	}

}
