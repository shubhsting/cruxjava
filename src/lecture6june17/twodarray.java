package lecture6june17;

import java.util.Scanner;

public class twodarray {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr=takeinput();
		display(arr);

	}
	public static int[][] takeinput(){
		
		System.out.println("rows");
		int row=scn.nextInt();
		int[][] arr=new int[row][];
		for(int i=0;i<arr.length;i++ ) {
			System.out.println("enter no of column in row"+i);
			int c=scn.nextInt();
			 arr[i]=new int[c];
			 for( int j=0;j<arr[i].length;j++) {
				 System.out.println(i+"-"+j+"=");
				 int d=scn.nextInt();
				arr[i][j]=d;
			 }
			
			System.out.println();
		}
		return arr;
	}
	public static void display(int[][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				
				
				
			}
			
			System.out.println();
		}
		
	}
	
}
