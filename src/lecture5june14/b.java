package lecture5june14;

import java.util.Scanner;

public class b {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[]arr= takeInput();
		int z = scn.nextInt();
		   int m=binarysearch(arr,z);
		   System.out.print(m);

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
public static int binarysearch(int[] arr,int item) {
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
		else {return mid;}
	}
	System.out.println();
	return -1;
}
}
