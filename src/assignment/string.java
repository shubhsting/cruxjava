package assignment;
import java.util.Scanner;
public class string {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				int val = scn.nextInt();
				arr[i]=val;
			 }
			int item = scn.nextInt();
			int mid=0;
			int low=0;
			int hi=arr.length-1;
			while(low<hi) {
				 mid=(low+hi)/2;
				if(item>arr[mid]) {
					low=mid+1;
				}
				else if(item<arr[mid]) {
					hi=mid-1;
			
				}
				
				               
				else 
				{
					System.out.println(mid);
					}
				

				
					
				
			}
				}
}
