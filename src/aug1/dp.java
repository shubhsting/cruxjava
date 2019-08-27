package aug1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class dp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String a=scn.next();
		String b=scn.next();
		String c=scn.next();
		int mab=LCSBU(a, b);
		int mbc=LCSBU(b, c);
		int mac=LCSBU(a, c);
		System.out.println(Math.min(mab, Math.min(mbc, mac) ));
//		int[][] arr = new int[a.length() + 1][b.length() + 1];
//		for (int i = 0; i < arr.length; i++) {
//			Arrays.fill(arr[i], -1);
//		}
		//System.out.println(EditdistanceBU(a, b, arr));
		// int n = scn.nextInt();
//		System.out.println(fibonacci(n));
//		System.out.println(fibonacciTD(n, new int[n + 1]));
//		System.out.println(fibonacciBU(n, new int[n + 1]));
//		System.out.println(fibonacciBUSE(n));

		// System.out.println(boardpath(0, 10));
//		System.out.println(boardpathTD(0, n, new int[n + 1]));
//		System.out.println(boardpathBU(0, n, new int[n + 6]));
//		System.out.println(boardpathBUSE(n));
		// System.out.println(mazepath(0, 0, n, n));
//		 System.out.println(mazepathTD(0, 0, n, n, new int[n + 1][n + 1]));
//		System.out.println(mazepathBU(n, n, new int[n + 2][n + 2]));
//		System.out.println(mazepathBUSE(n, n));
		String src = "sunday";
		String pat = "*d*";

		// System.out.println(LCS(s1, s2));
//		System.out.println(LCSTD(s1, s2, arr));
		// System.out.println(LCSBU(s1, s2));
//		System.out.println(Editdistance(s1, s2));
//		System.out.println(EditdistanceTD(s1, s2, arr));
//		System.out.println(EditdistanceBU(s1, s2, arr));
		// int[] arr1 = { 2, 3, 5, 1, 4 };
//		System.out.println(wineproblem(arr1, 0, arr1.length - 1, 1));
//		System.out.println(wineproblemTD(arr1, 0, arr1.length - 1, new int[arr1.length][arr1.length]));
//		System.out.println(MCM(arr1, 0, arr1.length - 1));
//		System.out.println(MCMTD(arr1, 0, arr1.length - 1, new int[arr1.length + 1][arr1.length + 1]));
//		System.out.println(MCMBU(arr1));
		// System.out.println(wineproblemBU(arr1));

//		System.out.println(wildcardmatch(src, pat));
//		System.out.println(wildcardmatchTD(src, pat, new int[src.length() + 1][pat.length() + 1]));
//		System.out.println(wildcardmatchBU(src, pat));
		// int[] p = { 1, 4, 5, 7 };
		//int[] arr = { 40, 60, 20 };
//		System.out.println(Ksnapsack(p, w, 0, 7));
//		System.out.println(KsnapsackTD(p, w, 0, 7, new int[w.length][7 + 1]));
//
//		System.out.println(KsnapsackBU(p, w, 7));
//		System.out.println(KsnapsackBUSE(p, w, 7));
//		int[][] arr1 = new int[arr.length + 1][arr.length + 1];
//		for (int i = 0; i < arr1.length; i++) {
//			Arrays.fill(arr1[i], -1);
//		}
//		System.out.println(Mixtures(arr, 0, arr.length - 1));
//		System.out.println(MixturesTD(arr, 0, arr.length - 1, arr1));
//		System.out.println(MixturesBU(arr));

//		int[] price = { 0, 1, 5, 8, 9, 10, 17, 17, 20 };
//		System.out.println(rodcutting(price, 8));
//		System.out.println(rodcuttingTD(price, 8, new int[price.length]));
//		System.out.println(rodcuttingBU(price,8));
	}

//T:O(2^n) S:Rec extra space
	public static int fibonacci(int n) {
		if (n == 1)
			return 1;
		if (n == 0)
			return 0;

		int p = fibonacci(n - 1);
		int q = fibonacci(n - 2);

		int result = p + q;
		return result;

	}

//T:O(n)  S:Rec extra space+arr extra space
	public static int fibonacciTD(int n, int[] arr) {
		if (n == 1)
			return 1;
		if (n == 0)
			return 0;
		if (arr[n] != 0) {
			return arr[n];
		}
		int p = fibonacci(n - 1);
		int q = fibonacci(n - 2);

		int result = p + q;
		arr[n] = result;
		return result;

	}

//T:O(n)   S:O(n)
	public static int fibonacciBU(int n, int[] arr) {
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[arr.length - 1];
	}

// T:O(n)   S:O(1)
	public static int fibonacciBUSE(int n) {
		int lp2 = 0;
		int lp1 = 1;
		int result = 0;
		for (int i = 2; i <= n; i++) {
			result = lp1 + lp2;
			lp2 = lp1;
			lp1 = result;
		}
		return result;
	}

	public static int boardpath(int curr, int end) {
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int c = 0;
		for (int dice = 1; dice <= 6; dice++) {
			c += boardpath(curr + dice, end);
		}
		return c;
	}

//TD=TOP DOWN
	public static int boardpathTD(int curr, int end, int[] arr) {
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (arr[curr] != 0) {
			return arr[curr];
		}

		int c = 0;
		for (int dice = 1; dice <= 6; dice++) {
			c += boardpathTD(curr + dice, end, arr);
		}
		arr[curr] = c;
		return c;
	}

//BU=BOTTOM UP:BREAKING PROBLEM INTO SMALLER PART 
	public static int boardpathBU(int curr, int end, int[] arr) {

		arr[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			arr[i] = arr[i + 1] + arr[i + 2] + arr[i + 3] + arr[i + 4] + arr[i + 5] + arr[i + 6];
		}
		return arr[0];
	}

//BUSE:BOTTOM UP SPACE EFFICENT 
	public static int boardpathBUSE(int end) {
		int[] arr = new int[6];
		arr[0] = 1;
		for (int i = 0; i < end; i++) {

			int sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5];
			arr[5] = arr[4];
			arr[4] = arr[3];
			arr[3] = arr[2];
			arr[2] = arr[1];
			arr[1] = arr[0];
			arr[0] = sum;
		}
		return arr[0];
	}

	public static int mazepath(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {

			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int cor = 0;
		int col = 0;
		col = mazepath(cr, cc + 1, er, ec);
		cor = mazepath(cr + 1, cc, er, ec);

		return col + cor;

	}

	public static int mazepathTD(int cr, int cc, int er, int ec, int[][] arr) {
		if (cr == er && cc == ec) {

			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		if (arr[cr][cc] != 0) {
			return arr[cr][cc];
		}
		int cor = 0;
		int col = 0;
		col = mazepathTD(cr, cc + 1, er, ec, arr);
		cor = mazepathTD(cr + 1, cc, er, ec, arr);
		arr[cr][cc] = col + cor;
		return col + cor;
	}

	public static int mazepathBU(int er, int ec, int[][] arr) {

		int cr = er;
		int cc = ec;
		while (cr >= 0) {

			for (int col = ec; col >= 0; col--) {
				if (cr == er && col == ec)
					arr[cr][col] = 1;
				else
					arr[cr][col] = arr[cr + 1][col] + arr[cr][col + 1];
			}
			cr = cr - 1;
//			cc = ec;
		}
		return arr[0][0];
	}

	public static int mazepathBUSE(int er, int ec) {
		int[] arr = new int[ec + 1];
		Arrays.fill(arr, 1);
		// arr[ec+1]=0;
		for (int row = er - 1; row >= 0; row--) {
			for (int col = ec - 1; col >= 0; col--) {
				arr[col] = arr[col] + arr[col + 1];
			}
		}
		return arr[0];
	}

	// longest common substring
	public static int LCS(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;
		if (ch1 == ch2) {
			ans = LCS(ros1, ros2) + 1;
		} else {
			int o1 = LCS(s1, ros2);
			int o2 = LCS(ros1, s2);

			ans = Math.max(o1, o2);
		}

		return ans;

	}

	public static int LCSTD(String s1, String s2, int[][] strg) {

		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		if (strg[s1.length()][s2.length()] != -1) {
			return strg[s1.length()][s2.length()];
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;
		if (ch1 == ch2) {
			ans = LCSTD(ros1, ros2, strg) + 1;
		} else {
			int o1 = LCSTD(s1, ros2, strg);
			int o2 = LCSTD(ros1, s2, strg);

			ans = Math.max(o1, o2);
			strg[s1.length()][s2.length()] = ans;
		}

		return ans;

	}

	public static int LCSBU(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int row = s1.length() - 1; row >= 0; row--) {
			for (int col = s2.length() - 1; col >= 0; col--) {

				if (s1.charAt(row) == s2.charAt(col)) {
					strg[row][col] = strg[row + 1][col + 1] + 1;
				} else {
					strg[row][col] = Math.max(strg[row + 1][col], strg[row][col + 1]);
				}
			}
		}
		return strg[0][0];
	}

//	public static int LCSSBU(String s1,String s2) {
//		int[] strg=new int[s2.length()+1];
//		Arrays.fill(strg, 1);
//		for(int row=s1.length()-2;row>=0;row--) {
//			if(s2.charAt(col)==s1.charAt(row)) {
//				
//			}
	// }
	// }
	// editdistance is used in google search
	public static int Editdistance(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int ans = 0;
		if (ch1 == ch2) {
			ans = Editdistance(ros1, ros2);
		} else {
			int insert = Editdistance(ros1, s2);
			int replace = Editdistance(s1, ros2);
			int remove = Editdistance(ros1, ros2);
			ans = Math.min(insert, Math.min(replace, remove)) + 1;
		}
		return ans;
	}

	// s1=col s2=row
	public static int EditdistanceTD(String s1, String s2, int[][] strg) {
		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}
		if (strg[s1.length()][s2.length()] != -1) {
			return strg[s1.length()][s2.length()];
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int ans = 0;
		if (ch1 == ch2) {
			ans = EditdistanceTD(ros1, ros2, strg);
		} else {
			int insert = EditdistanceTD(ros1, s2, strg);
			int replace = EditdistanceTD(s1, ros2, strg);
			int remove = EditdistanceTD(ros1, ros2, strg);
			ans = Math.min(insert, Math.min(replace, remove)) + 1;
		}
		strg[s1.length()][s2.length()] = ans;
		return ans;
	}

	public static int EditdistanceBU(String s1, String s2, int[][] strg) {
		for (int row = s1.length(); row >= 0; row--) {
			for (int col = s2.length(); col >= 0; col--) {
				if (row == s1.length()) {
					strg[row][col] = s2.length() - col;
					continue;
				}
				if (col == s2.length()) {
					strg[row][col] = s1.length() - row;
					continue;
				}
				if (s1.charAt(row) == s2.charAt(col)) {
					strg[row][col] = strg[row + 1][col + 1];
				} else {
					strg[row][col] = Math.min(strg[row + 1][col], Math.min(strg[row + 1][col + 1], strg[row][col + 1]))
							+ 1;
				}
			}
		}
		return strg[0][0];
	}

	// MAXIMUM MO OF MULTIPLICATIONS IN MATRIX MULTIPLICATION
	public static int MCM(int[] arr, int si, int ei) {
		if (ei - si == 1) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for (int k = si + 1; k <= ei - 1; k++) {
			int fi = MCM(arr, si, k);
			int la = MCM(arr, k, ei);
			int sw = arr[si] * arr[k] * arr[ei];
			int ans = sw + fi + la;
			if (min > ans) {
				min = ans;
			}
		}
		return min;
	}

	public static int MCMTD(int[] arr, int si, int ei, int[][] stg) {
		if (ei - si == 1) {
			return 0;
		}
		if (stg[si][ei] != 0) {
			return stg[si][ei];
		}
		int min = Integer.MAX_VALUE;
		for (int k = si + 1; k <= ei - 1; k++) {
			int fi = MCMTD(arr, si, k, stg);
			int la = MCMTD(arr, k, ei, stg);
			int sw = arr[si] * arr[k] * arr[ei];
			int ans = sw + fi + la;
			if (min > ans) {
				min = ans;
			}
			stg[si][ei] = min;
		}
		return min;
	}

	public static int MCMBU(int[] arr) {

		int n = arr.length;
		int[][] strg = new int[n][n];

		for (int slide = 1; slide <= n - 2; slide++) {

			for (int si = 0; si <= n - slide - 2; si++) {

				int ei = si + slide + 1;

				// copy
				int min = Integer.MAX_VALUE;

				for (int k = si + 1; k <= ei - 1; k++) {

					int fp = strg[si][k];
					int sp = strg[k][ei];

					int sw = arr[si] * arr[k] * arr[ei];

					int total = fp + sp + sw;

					if (total < min) {
						min = total;
					}
				}

				strg[si][ei] = min;
				//

			}

		}

		return strg[0][n - 1];

	}

	public static int wineproblem(int[] arr, int si, int ei, int yr) {

		if (si == ei) {
			return arr[si] * yr;
		}
		int start = wineproblem(arr, si + 1, ei, yr + 1) + arr[si] * yr;
		int end = wineproblem(arr, si, ei - 1, yr + 1) + arr[ei] * yr;
		int res = Math.max(start, end);
		return res;

	}

	public static int wineproblemTD(int[] arr, int si, int ei, int[][] strg) {
		// yr=arr.length-ei+si;full explanation below
		int yr = (arr.length - 1) - (ei - si - 1);
		if (si == ei) {
			return arr[si] * yr;
		}
		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}
		int start = wineproblemTD(arr, si + 1, ei, strg) + arr[si] * yr;
		int end = wineproblemTD(arr, si, ei - 1, strg) + arr[ei] * yr;
		int res = Math.max(start, end);
		strg[si][ei] = res;
		return res;

	}

	public static int wineproblemBU(int[] arr) {
		int n = arr.length;
		int[][] strg = new int[n][n];
		for (int slide = 0; slide <= n - 1; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = si + slide;
				int yr = arr.length - ei + si;
				if (si == ei) {
					strg[si][ei] = arr[si] * yr;
					continue;
				}
				int start = strg[si + 1][ei] + arr[si] * yr;
				int end = strg[si][ei - 1] + arr[ei] * yr;
				int res = Math.max(start, end);
				strg[si][ei] = res;

			}
		}

		return strg[0][n - 1];
	}

	public static boolean wildcardmatch(String src, String pat) {
		if (src.length() == 0 && pat.length() == 0) {
			return true;
		}
		if (src.length() != 0 && pat.length() == 0) {
			return false;
		}
		if (src.length() == 0 && pat.length() != 0) {
			for (int i = 0; i < pat.length(); i++) {
				if (pat.charAt(i) != '*') {
					return false;
				}
			}
			return true;
		}
		boolean result = false;

		char chs = src.charAt(0);
		char chp = pat.charAt(0);
		String res = src.substring(1);
		String rep = pat.substring(1);

		if (chs == chp || chp == '?') {
			result = wildcardmatch(res, rep);
		} else if (chp == '*') {
			boolean space = wildcardmatch(res, rep);
			boolean charac = wildcardmatch(res, pat);
			result = space || charac;
		} else {
			result = false;
		}
		return result;

	}

	public static boolean wildcardmatchTD(String src, String pat, int[][] strg) {
		if (src.length() == 0 && pat.length() == 0) {
			return true;
		}
		if (src.length() != 0 && pat.length() == 0) {
			return false;
		}
		if (src.length() == 0 && pat.length() != 0) {
			for (int i = 0; i < pat.length(); i++) {
				if (pat.charAt(i) != '*') {
					return false;
				}
			}
			return true;
		}
		if (strg[src.length()][pat.length()] != 0) {
			return strg[src.length()][pat.length()] == 2 ? true : false;
		}
		boolean result = false;

		char chs = src.charAt(0);
		char chp = pat.charAt(0);
		String res = src.substring(1);
		String rep = pat.substring(1);

		if (chs == chp || chp == '?') {
			result = wildcardmatchTD(res, rep, strg);
		} else if (chp == '*') {
			boolean space = wildcardmatchTD(res, rep, strg);
			boolean charac = wildcardmatchTD(res, pat, strg);
			result = space || charac;
		} else {
			result = false;
		}
		strg[src.length()][pat.length()] = result ? 2 : 1;
		return result;

	}

	public static boolean wildcardmatchBU(String src, String pat) {

		boolean[][] strg = new boolean[src.length() + 1][pat.length() + 1];

		strg[src.length()][pat.length()] = true;
		for (int row = src.length(); row >= 0; row--) {
			for (int col = pat.length() - 1; col >= 0; col--) {

				if (row == src.length()) {
					if (pat.charAt(col) == '*') {
						strg[row][col] = strg[row][col + 1];
					} else {
						strg[row][col] = false;
					}
					continue;
				}
				char chs = src.charAt(row);
				char chp = pat.charAt(col);

				if (chs == chp || chp == '?') {
					strg[row][col] = strg[row + 1][col + 1];

				} else if (chp == '*') {
					boolean space = strg[row][col + 1];
					boolean charac = strg[row + 1][col];
					strg[row][col] = space || charac;
				} else {
					strg[row][col] = false;
				}

			}

		}
		return strg[0][0];
	}

	public static int Ksnapsack(int[] p, int[] w, int vidx, int cap) {
		if (vidx == w.length) {
			return 0;
		}

		int inc = 0;

		if (cap >= w[vidx])
			inc = Ksnapsack(p, w, vidx + 1, cap - w[vidx]) + p[vidx];
		int exc = Ksnapsack(p, w, vidx + 1, cap);

		return Math.max(inc, exc);
	}

	public static int KsnapsackTD(int[] p, int[] w, int vidx, int cap, int[][] strg) {
		if (vidx == w.length) {
			return 0;
		}

		if (strg[vidx][cap] != 0) {
			return strg[vidx][cap];
		}
		int inc = 0;

		if (cap >= w[vidx])
			inc = KsnapsackTD(p, w, vidx + 1, cap - w[vidx], strg) + p[vidx];
		int exc = KsnapsackTD(p, w, vidx + 1, cap, strg);

		return strg[vidx][cap] = Math.max(inc, exc);
	}

	public static int KsnapsackBU(int[] p, int[] w, int cap) {
		int[][] strg = new int[w.length + 1][cap + 1];
		for (int row = strg.length - 1; row >= 0; row--) {
			for (int col = 0; col <= cap; col++) {

				if (row == strg.length - 1) {
					strg[row][col] = 0;
					continue;
				}
				int inc = 0;

				if (col >= w[row])
					inc = strg[row + 1][col - w[row]] + p[row];
				int exc = strg[row + 1][col];

				strg[row][col] = Math.max(inc, exc);
			}
		}
		return strg[0][cap];
	}

	public static int KsnapsackBUSE(int[] p, int[] w, int cap) {
		int[] strg = new int[cap + 1];
		for (int row = w.length - 1; row >= 0; row--) {
			for (int col = cap; col >= 0; col--) {

//				if (row == w.length - 1) {
//					strg[col] = 0;
//					continue;
//				}
				int inc = 0;

				if (col >= w[row])
					inc = strg[col - w[row]] + p[row];
				int exc = strg[col];

				strg[col] = Math.max(inc, exc);
			}
		}
		return strg[cap];

	}

	public static int Mixtures(int[] arr, int si, int ei) {

		if (si == ei) {
			return 0;
		}

		int min = Integer.MAX_VALUE;
		for (int k = si; k <= ei - 1; k++) {
			int left = Mixtures(arr, si, k);
			int right = Mixtures(arr, k + 1, ei);
			int sw = color(arr, si, k) * color(arr, k + 1, ei);
			int total = left + right + sw;
			if (total < min) {
				min = total;
			}
		}

		return min;
	}

	public static int color(int[] arr, int si, int ei) {
		int sum = 0;
		for (int i = si; i <= ei; i++) {
			sum += arr[i];
		}
		return sum % 100;
	}

	// fill all with -1;
	public static int MixturesTD(int[] arr, int si, int ei, int[][] strg) {

		if (si == ei) {
			return 0;
		}

		int min = Integer.MAX_VALUE;
		if (strg[si][ei] != -1) {
			return strg[si][ei];
		}
		for (int k = si; k <= ei - 1; k++) {
			int left = Mixtures(arr, si, k);
			int right = Mixtures(arr, k + 1, ei);
			int sw = color(arr, si, k) * color(arr, k + 1, ei);
			int total = left + right + sw;
			if (total < min) {
				min = total;
			}
		}
		strg[si][ei] = min;
		return min;
	}

	public static int MixturesBU(int[] arr) {

		int n = arr.length;
		int[][] strg = new int[n][n];

		for (int slide = 1; slide <= n - 1; slide++) {

			for (int si = 0; si <= n - slide - 1; si++) {

				int ei = si + slide;

				int min = Integer.MAX_VALUE;

				for (int k = si; k <= ei - 1; k++) {

					int fp = strg[si][k];
					int sp = strg[k + 1][ei];

					int sw = color(arr, si, k) * color(arr, k + 1, ei);
					int total = fp + sp + sw;

					if (total < min) {
						min = total;
					}
				}

				strg[si][ei] = min;
			}

		}
		return strg[0][n - 1];
	}

	public static int rodcutting(int[] price, int len) {
		int left = 1;
		int right = len - 1;
		int max = price[len];
		while (left <= right) {
			int lc = rodcutting(price, left);
			int rc = rodcutting(price, right);
			int total = lc + rc;
			if (total > max) {
				max = total;
			}
			left++;
			right--;

		}
		return max;
	}

	public static int rodcuttingTD(int[] price, int len, int[] strg) {
		if (strg[len] != 0) {
			return strg[len];
		}

		int left = 1;
		int right = len - 1;
		int max = price[len];
		while (left <= right) {
			int lc = rodcuttingTD(price, left, strg);
			int rc = rodcuttingTD(price, right, strg);
			int total = lc + rc;
			if (total > max) {
				max = total;
			}
			left++;
			right--;

		}
		strg[len] = max;
		return max;
	}

	public static int rodcuttingBU(int[] price,int length) {
		int[] strg = new int[price.length];
		for (int len = 0; len < strg.length; len++) {

			int left = 1;
			int right = len- 1;
			int max = price[len];
			while (left <= right) {
				int lc = strg[left];
				int rc = strg[right];
				int total = lc + rc;
				if (total > max) {
					max = total;
				}
				left++;
				right--;

			}
			strg[len] = max;

		}

		return strg[price.length - 1];
	}

}