package lecture5june14;

import java.util.Scanner;

public class inversearray {
	static Scanner scn = new Scanner(System.in); 
	public static void main(String[] args) {
		int[] arr=takeInput();
		int[] array=inverse(arr);
		display(array);

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
public static void display(int[] arr1) {
	
	
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+" \t");
		
		
	}
	System.out.println();

	
}

public static int[] inverse(int[] arr) {
	int[] array=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
	array[arr[i]]=i;}
	return array;
}
	
}