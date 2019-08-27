package assignment;

import java.util.Scanner;

public class differenceinascii {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char p=str.charAt(0);
		String result=p+"";
		for(int i=0;i<str.length()-1;i++) {
			char c=str.charAt(i);
			char d=str.charAt(i+1);
			int a=c;
			int b=d;
			int v=b-a;
			result=result+v+d;
			
		}
		System.out.println(result);
	}

}
