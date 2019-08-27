package ASSIGNMENT1;

import java.util.Scanner;


import java.util.Stack;
public class stockspan {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int a =scn.nextInt();
		int[] arr=new int[a];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		// nextGreaterElement(arr);
		int[] arr1=stockspan(arr);
		for(int val:arr1) {
			System.out.print(val+" ");
		}
		System.out.println("END");

	}
	public static int[] stockspan(int[] arr) throws Exception {
		int[] ans = new int[arr.length];

		Stack m = new Stack();
		for (int i = 0; i < arr.length; i++) {
			while (!m.isEmpty() && arr[i] > arr[(int) m.peek()]) {
				m.pop();
			}
			if (m.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i -(int) m.peek();
			}
			m.push(i);
		}
		return ans;

	}
}
