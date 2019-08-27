package lecture5june14;

import java.util.Scanner;

public class subarray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr=takeInput();
		subarray(arr);

	}

	public static int[] takeInput() {

		System.out.println("size");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int val = scn.nextInt();
			arr[i] = val;
		}

		return arr;
	}
	public static void subarray(int[] arr) {
		int low=0;
		int high=arr.length-1;
		for(int lo=0;lo<=high;lo++) {
			for(int hi=lo;hi<=high;hi++) {
				for(int k=lo;k<=hi;k++) {
		System.out.print(arr[k]+"\t");
		}
				System.out.println();	
			}
			
		}
			
	}
	
}
