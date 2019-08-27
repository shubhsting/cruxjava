package assignment;
import java.io.*; 
import java.lang.*;
import java.util.Scanner;

public class g {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=1;
		String d;
		String e;
		String result="";
		while(row<=n) {
			
			
			
			int a = scn.nextInt();
			int b= scn.nextInt();
			if(a>b) {
			 d="Aayush";
			 result=result+"\n"+d;}
			
			else if(b>a) {
				e="Harshit";
				result=result+"\n"+e;}
			
			else {
				result=result+"\n";
			}
			
			
			row=row+1;
		}
System.out.println(result);
	}

}
