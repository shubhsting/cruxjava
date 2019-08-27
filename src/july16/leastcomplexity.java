package july16;

import java.util.Scanner;

import july17.dynamicstack;

public class leastcomplexity {

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

	public static void nextGreaterElement(int[] arr) throws Exception {

		dynamicstack m = new dynamicstack();
		for (int i = 0; i < arr.length; i++) {

			while (!m.isEmpty() && m.peek() < arr[i]) {
				System.out.println(m.pop() + "->  " + arr[i]);

			}
			m.push(arr[i]);

		}
		while (!m.isEmpty()) {
			System.out.println(m.pop() + "->  -1");
		}
	}

	public static int[] nextGreaterElement2(int[] arr) throws Exception {
		int[] carray = new int[arr.length];
		dynamicstack m = new dynamicstack();
		for (int i = 0; i < arr.length; i++) {

			while (!m.isEmpty() && arr[m.peek()] < arr[i]) {
				carray[m.pop()] = arr[i];

			}
			m.push(i);

		}
		while (!m.isEmpty()) {
			carray[m.pop()] = -1;
		}
		return carray;
	}

	public static int[] stockspan(int[] arr) throws Exception {
		int[] ans = new int[arr.length];

		dynamicstack m = new dynamicstack();
		for (int i = 0; i < arr.length; i++) {
			while (!m.isEmpty() && arr[i] > arr[m.peek()]) {
				m.pop();
			}
			if (m.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - m.peek();
			}
			m.push(i);
		}
		return ans;

	}

}
