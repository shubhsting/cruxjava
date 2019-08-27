package assignment;

import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=scn.nextInt();
        int temp=0;
        temp=a;
        int count1=0;
        int count2=0;
        for(int i=0;i<n-1;i++){
        	 
        	 int b=scn.nextInt();
        	if(a>b) {
        		a=b;
        		 count1=count1+1;}
        	if(b>a) {
        		a=b;
        		count2=count2+1;
        	}
        	 
        	 
        }
        if(count1==n-1||count2==n-1) {
   		 System.out.println("yes");
   	 }
   	 else
   		 System.out.println("no");

	}

}
