package lecture4june12;

import java.util.Scanner;

public class armstrongnumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		for(int n=a;n<=b;n++)
		{
		
		boolean res = isArmstrong(n);
		if (res == true) {
			System.out.println(n);
		} 
		}
	}

	private static boolean isArmstrong(int n) {
		int c = count(n);
		int ne = updated(n, c);
		if (ne == n) {
			return true;
		} else {
			return false;
		}

	}

	private static int updated(int n, int c) {
		int b = 0;
		int ne = 0;
		while (n != 0) {
			b = n % 10;
			ne = (int) (ne + Math.pow(b, c));
			n = n / 10;
		}

		
		return ne;
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
