package june28;

import java.util.ArrayList;

public class recursionget {

	public static void main(String[] args) {
		// String m="497";
		//ArrayList<String> s = mazepath(0, 0, 2, 2);
		//System.out.print(s);
		//System.out.println(getSS("abc"));
System.out.println(getPermutation("254"));
	}

	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;

		}
		char ch = str.charAt(0);
		String res = str.substring(1);
		ArrayList<String> rr = getSS(res);
		ArrayList<String> nr = new ArrayList<>();
		for (String val : rr) {
			nr.add(val);
			nr.add(ch + val);

		}
		return nr;
	}

	public static ArrayList<String> getSS1(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;

		}
		char ch = str.charAt(0);
		String res = str.substring(1);
		ArrayList<String> rr = getSS1(res);
		ArrayList<String> nr = new ArrayList<>();
		for (String val : rr) {
			nr.add(val);
			nr.add(ch + val);
			nr.add((int) ch + val);

		}
		return nr;
	}

	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

	public static ArrayList<String> getSS2(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;

		}
		char ch = str.charAt(0);
		String res = str.substring(1);
		ArrayList<String> rr = getSS2(res);
		ArrayList<String> nr = new ArrayList<>();
		String code = getCode(ch);
		for (int i = 0; i < code.length(); i++) {
			for (String val : rr) {

				nr.add(code.charAt(i) + val);

			}
		}
		return nr;
	}

	public static ArrayList<String> getHT(int n) {
		if (n == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add(" ");
			return br;

		}
		ArrayList<String> rr = getHT(n - 1);
		ArrayList<String> nr = new ArrayList<>();

		for (String val : rr) {
			nr.add("H" + val);
			nr.add("T" + val);
		}
		return nr;
	}

	public static ArrayList<String> getPermutation(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;

		}
		char ch = str.charAt(0);
		String res = str.substring(1);
		ArrayList<String> rr = getPermutation(res);
		ArrayList<String> nr = new ArrayList<>();
		for (String val : rr) {
			for (int i = 0; i <= val.length(); i++) {

				nr.add(val.substring(0, i) + ch + val.substring(i));

			}
		}
		return nr;
	}

	public static ArrayList<String> mazepath(int cr, int cl, int er, int ec) {

		if (cr == er && cl == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> nr = new ArrayList<>();

		if (cl + 1 <= ec) {
			ArrayList<String> rr = mazepath(cr, cl + 1, er, ec);

			for (String val : rr) {
				nr.add("H" + val);
			}
		}

		if (cr + 1 <= er) {
			ArrayList<String> rr1 = mazepath(cr + 1, cl, er, ec);
			for (String val : rr1) {
				nr.add("V" + val);

			}
		}

		return nr;

	}
}
