package july15;

import java.util.Arrays;

public class TimeSpace {

	public static void main(String[] args) {
		 SOE(9);
//System.out.println(power(2, 3));
		//test("A1b2C3", "", 0, "A1b2C3");
		//System.out.println(count);
		//testlowertoupper("a1B2", "");
	}

	// sieve of entostheses
	public static void SOE(int n) {
		boolean[] arr = new boolean[n + 1];
		Arrays.fill(arr, true);
		arr[0] = arr[1] = false;
		for (int table = 2; table * table <= n; table++) {
			if (arr[table] == false) {
				continue;
			}
			for (int mul = 2; table * mul <= n; mul++) {

				arr[table * mul] = false;
			}

		}
		for (int m = 0; m < arr.length; m++) {
			if (arr[m]) {
				System.out.println(m);
			}
		}

	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int rr = power(x, n / 2);
		if (n % 2 == 0) {
			return rr * rr;
		} else {
			return rr * rr * x;
		}
	}
	static int count;
	public static void test(String ques, String ans, int vidx, String ques1) {
		if (vidx == ques.length()) {
			System.out.println(ans);
			count++;
		
			return;
		}
		char c = ques.charAt(vidx);
		String neq = ques.substring(vidx+1);
		if (c >= 'a' && c <= 'z') {

			test(ques, ans + Character.toUpperCase(c), vidx + 1, neq);
			test(ques, ans + c, vidx + 1, neq);

		} else if (c >= 'A' && c <= 'Z') {
			test(ques, ans + Character.toLowerCase(c), vidx + 1, neq);
			test(ques, ans + c, vidx + 1, neq);
		} else {
			test(ques, ans + c, vidx + 1, neq);
		}
	}

	public static void testlowertoupper(String ques ,String ans ) {
		
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch=ques.charAt(0);
		String roq=ques.substring(1);
		
		if(Character.isDigit(ch)) {
			testlowertoupper(roq, ans+ch);
		}
		else {
			testlowertoupper(roq, ans+Character.toUpperCase(ch));
			testlowertoupper(roq, ans+Character.toLowerCase(ch));
		}
		
		
	}
	
}
