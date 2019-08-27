package assignment;

import java.util.Scanner;

public class h {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int i=1;
		int result=0;
		while(i<=n) {
			result=3*i+2;
			if(result%r!=0) {
				System.out.println(result);
				i=i+1;
			}
			else {
			
			i=i+1;}
		}
	}

}
