package assignment;

import java.util.Scanner;

public class compressedstring {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str=scn.next();
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for(int i=0;i<=str.length()-1;i++) {
			
			char c=str.charAt(i);
			for(int j=i+1;j<=str.length()-1;j++) {
			char d=str.charAt(j);
			if(c==d) {
				str.replace(c,'1');
			}

	}
		}
		for(int z=0;z<str.length();z++) {
			if(str.charAt(z)>='a'&& str.charAt(z)<='z'||str.charAt(z)>='A'&& str.charAt(z)<='Z') {
				sb.append(str.charAt(z));
				
			}
		}
		System.out.println(sb);
}}
