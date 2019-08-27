import java.util.ArrayList;
import java.util.Scanner;

public class maximumintegerwithswaps {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s=scn.next();
		swap(s, 1);
	
	}
      
   
	
	public static void swap(String str,int swap) {
		String a="";
		String s=str.substring(0,1);
		String res=str.substring(1);
		char c=highest(res);
		
		int index=res.indexOf(c);
		String ans=c+res.substring(0,index)+s+res.substring(index+1);
		System.out.println(ans);
		
	}
	
   public static char highest(String a) {
	   
	   char[] arr=new char[a.length()];
	   for(int i=0;i<arr.length;i++) {
		  char m=a.charAt(i);
		  arr[i]=(char)m;
	   }
	   
	   
	   int n=arr.length;
		for(int count=1;count<=n-1;count++) {
			int temp=arr[count];
			int j=count-1; 
				while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
					
				j--;	
				}
				arr[j+1]=(char) temp;
				
		}
		
			
	   return arr[arr.length-1];
   }
}
   