package assignment;

import java.util.Scanner;

public class stringoddeven {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String result="";
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
			char c=str.charAt(i);
			int a=c;
			a++;
			char m=(char) a;
			result=result+m;
			
			}
			else {
				char d=str.charAt(i);
				int p=d;
				p--;
				char o=(char) p;
				result=result+o;
				
				
				
			}
		}
		System.out.println(result);
	
	}

}
