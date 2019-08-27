package assignment;

import java.util.Scanner;

public class simpleinput {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int n=scn.nextInt();
		String r="";
		
		
		int sum=n;
		 r=Integer.toString(n);
		 if (n<0)
				r="";
		while(n>=0) {
        int a=scn.nextInt();
        sum=sum+a;
        if(sum>0) {
        	String g=Integer.toString(a);
        	r=r+"\n"+g;
        }
        else break;
		}
		
		System.out.println(r);
		
		
		
		
		
		
        
	}

}
