package assignment;

import java.util.Scanner;

public class painterpartition {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int s = scn.nextInt();
		int temp=0;
		int[] arr=new int[s];
		for(int i=0;i<s;i++) {
			arr[i] = scn.nextInt();
			
			
		}
		int count = arr.length ;
		for (int c = 0; c <= arr.length - 2; c++) {
			for (int j = 0; j <= count - c - 2; j++) {
				if (arr[j] > arr[j + 1]) {
					int tem = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tem;

				}

			}

		}
		
		
		
	}
}
