package assignment;

import java.util.Scanner;

public class j {

	public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
int d= scn.nextInt();
		String result1="";
		for(int i=1;i<=d;i++) {
			int n= scn.nextInt();
		int count=0;
		int even=0;
		int odd=0;
		int b=0;
		int a=0;
		int ab=n;
		while(ab!=0) {
			ab=ab/10;
			
			count=count+1;
		}
		
		if(count%2==0) {
			while(n!=0) {
			a=n%10;
			even=even+a;
			n=n/10;
			b=n%10;
			odd=odd+b;
			n=n/10;
			}	
			
		}
		else {
			while(n!=0) {
				a=n%10;
				odd=odd+a;
				n=n/10;
				b=n%10;
				even=even+b;
				n=n/10;
				}	
			
			
		}
		
        if(even%4==0||odd%3==0) {
        	result1=result1+"\n"+"Yes";
        	
        }
        else {
        	result1=result1+"\n"+"No";
        }
		}
        
        System.out.println(result1);
        
	}

}
