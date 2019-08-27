package assignment;

import java.util.Scanner;

public class simplecalculator {

	public static void main(String[] args) {
	
		
		int result = 0;
		

		Scanner scn = new Scanner(System.in);
		String result1="";
		int d=0;
		String res="";
			char c = scn.next().charAt(0);
			while(c!='X'||c!='x') {
				
				int a=scn.nextInt();
				int b=scn.nextInt();
				
				if(c=='+') {
					d=a+b;
				}
				else if(c=='-') {
					d=a-b;
				}
				else if(c=='*') {
					d=a*b;
				}
				else if(c=='/') {
					d=a/b;
				}
				else if(c=='%') {
					d=a%b;
				}
				
				 else {
					 result1=result1+"\n"+"invalid";
				 }
				  res=Integer.toString(d);
				result1=result1+"\n"+res;
			}
			 
			
		System.out.println(result1);
	}

}
