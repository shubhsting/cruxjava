package assignment;

import java.util.Scanner;

public class rainwatertrapping {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		for(int i=1;i<=n;i++) {
			int[] arr=takeInput();
			int area=area(arr);
			System.out.println(area);
		}
		
	}
public static int[] takeInput() {
		
		
		int n = scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			int val = scn.nextInt();
			arr[i]=val;
		 }
		
		
		
		return arr;
	}
	public static int area(int[] arr) {
		int area=0;
		int a=arr[0];
		if (a==0) {a=arr[1];
		area=0;}
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>a ) {
				area=area+0;
				
			}
			
			else if(arr[i]<a ) {
				
				area=area+(a-arr[i]);
				
			}
			else {
				area=area+0;
			}
		}
		
		
		
		return area;
	}
}
