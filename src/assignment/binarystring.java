package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class binarystring {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        int tc=scn.nextInt();
        while(tc>0) {
        	String str = scn.next();
        	binary(str," ");
        	tc--;
        }
		

	}
	public static void binary(String ques,String ans){
if(ques.length()==0) {
			
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			
			char ch=ques.charAt(i);
			if(ch=='1'||ch=='0') {
		String neq=ques.substring(i+1);
		binary(neq,ans+ch);
		return;}
			else if(ch=='?') {
				String neq=ques.substring(i+1);
				binary(neq,ans+"0");
				binary(neq,ans+"1");
				return;
			}
		}
	}
	
}
