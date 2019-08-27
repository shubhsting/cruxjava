package assignment;

import java.util.Scanner;

public class sumtriplet {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scn.nextInt();}

int count = arr.length ;
		for (int c = 0; c <= arr.length - 2; c++) {
			for (int j = 0; j <= count - c - 2; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

		}
			
		
		int sum = scn.nextInt();
		int low=0;
		int high=arr.length;
		for(int lo=0;lo<high-2;lo++) {
		for(int hi=lo+1;hi<high-1;hi++) {
		    for(int z=hi+1;z<high;z++) {
			
			if(arr[lo]+arr[hi]+arr[z]==sum) {
				System.out.println(arr[lo]+", "+arr[hi]+" and "+arr[z]);
				
			}
		}
		}
		
		
		
		
		
	}}		
}
			
			
			
			
			
	