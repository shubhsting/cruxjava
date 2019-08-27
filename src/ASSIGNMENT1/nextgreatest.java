package ASSIGNMENT1;

import java.util.Scanner;
import java.util.Stack;



public class nextgreatest {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int tc =scn.nextInt();
		while(tc>
		0) {
		int a =scn.nextInt();
		int[] arr=new int[a];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int[] arr1=nextGreaterElement2(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" "+arr1[i]);
		}
		tc--;}
	}
	public static int[] nextGreaterElement2(int[] arr) throws Exception {
		int[] carray = new int[arr.length];
		Stack m = new Stack();
		for (int i = 0; i < arr.length; i++) {

			while (!m.isEmpty() && arr[(int) m.peek()] < arr[i]) {
				carray[(int) m.pop()] = arr[i];

			}
			m.push(i);

		}
		while (!m.isEmpty()) {
			carray[(int) m.pop()] = -1;
		}
		return carray;
	}
}
