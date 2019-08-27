package lecture5june14;

import java.util.Scanner;

public class rotate {
	static Scanner scn = new Scanner(System.in); 
	public static void main(String[] args) {
		int[] arr=takeInput();
		int z=scn.nextInt();
		rotate(arr,z);
		display(arr);
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

public static void rotate(int[] arr,int z) {
	z=z%arr.length;
	if(z<0)
		z=z+arr.length;
	int high=arr.length-1;
	for(int b=1;b<=z;b++) {
		int temp=arr[high];
		for(int i=high;i>=1;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		
	}
}
public static void display(int[] arr1) {
	
	
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+" \t");
		
		
	}
	System.out.println();

	
}

}
