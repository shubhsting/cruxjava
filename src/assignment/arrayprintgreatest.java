package assignment;

import java.util.*;
public class arrayprintgreatest {
    static Scanner scn = new Scanner(System.in);
    public static void main(String args[]) {
    	int a=0;
int[]arr= takeInput();
if(arr==null) {
	a=0;
}
else {
 a=max(arr);
   System.out.println(a);
}
    }
    public static int[] takeInput() {
		
		
		int n = scn.nextInt();
		if(n<0) {return null;} 
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			int val = scn.nextInt();
			arr[i]=val;
			
		}
		return arr;
		
		
		
		
		
		
		
	}
		
	public static int max(int[] arr) {
			int ab = 0;
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]>ab)
					ab=arr[i];
				
				
			}
			
			return ab;}
}
