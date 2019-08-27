package assignment;

import java.util.Scanner;

public class BOSTON {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=2;
        int b=n;
        int m=1;
        int s=0;
        int r=0;
        int e=0;
        
        int sum=0;
        while(b!=1) {
        	
        	while(b%a==0) {
        		int count=0;
        		int i=1;
        		while(i<=a  ) {
        			if(a%i==0)
        			count=count+1;
        			
        			i=i+1;}

        		if(count==2) {
        			int v=a;
        			while(v!=0) {
        	        	r=v%10;
        	        s=s+r;	
        	        	v=v/10;
        	        	
        	        }
        		}
        		
        		b=b/a;
        		
        	}
        	a=a+1;
        	
        }
       
        
        
        
        while(n!=0) {
        	e=n%10;
        sum=sum+e;	
        	n=n/10;
        	
        }

        if(sum==s)
        	System.out.println("1");
        else
        	System.out.println("0");
	}

}
