package lecture5june14;

import java.util.Scanner;

public class reverse {
	static Scanner scn = new Scanner(System.in); 
	public static void main(String[] args) {
		int[] arr=takeInput();
		int[] arr1=reverse(arr);
		display(arr1);
		

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

public static int[] reverse(int[] arr) {
	int low=0;
	
	int high=arr.length-1;
	while(low<high) {
		int temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		low=low+1;
		high=high-1;
	}
	
	
	
	return arr;
}
public static void display(int[] arr1) {
	
	
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+" \t");
		
		
	}
	System.out.println();

	
}

}
