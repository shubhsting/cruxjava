package lecture4june12;

import java.util.Scanner;

public class subset {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
            set(n);
	}

	private static void set(int n) {
		int c=count(n);
		int d=c;
		
		
		for(int i=0;i<=c;i++) {
			
			int b=(int) (n/Math.pow(10, d-1));
			int h=(int) (n%Math.pow(10, d-1));
						System.out.println(b);
						System.out.println(h);
 
 
			d=d-1;
			i=i+1;
		}
		
	}

	private static int count(int n) {
		int b = 0;
		while (n != 0) {
			n = n / 10;
			b = b + 1;

		}
		return b;
	}


}
