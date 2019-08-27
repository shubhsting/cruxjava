package july1;

import java.util.ArrayList;
import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		//getPermutation("abac", "");
		
		Scanner scn = new Scanner(System.in);
		int c = scn.nextInt();
		int d = scn.nextInt();
		ArrayList<String> nr =mazepath11(0, 0, c-1, d-1);
		for(int i=0;i<nr.size();i++) {
			System.out.print(nr.get(i)+" ");
		}
		System.out.println();
		System.out.println(nr.size());
	}

	public static ArrayList<String> mazepath11(int cr, int cl, int er, int ec) {

		if (cr == er && cl == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> nr = new ArrayList<>();

		if (cl + 1 <= ec) {
			ArrayList<String> rr = mazepath11(cr, cl + 1, er, ec);

			for (String val : rr) {
				nr.add( val+"H");
			}
		}

		if (cr + 1 <= er) {
			ArrayList<String> rr1 = mazepath11(cr + 1, cl, er, ec);
			for (String val : rr1) {
				nr.add( val+"V");

			}
		}
		if (cr + 1 <= er && cl + 1 <= ec) {
			ArrayList<String> rr1 = mazepath11(cr + 1, cl + 1, er, ec);
			for (String val : rr1) {
				nr.add("D" + val);

			}
		}
		return nr;

	}

	public static ArrayList<String> mazepath1(int cr, int cl, int er, int ec) {

		if (cr == er && cl == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> nr = new ArrayList<>();

		for (int n = 1; n <= er && n <= ec; n++) {
			if (cl + n <= ec) {
				ArrayList<String> rr = mazepath1(cr, cl + n, er, ec);

				for (String val : rr) {
					nr.add("H" + n + val);

				}

			}

			if (cr + n <= er) {
				ArrayList<String> rr1 = mazepath1(cr + n, cl, er, ec);
				for (String val : rr1) {
					nr.add("V" + n + val);

				}

			}
			if (cr + n <= er && cl + n <= ec) {
				ArrayList<String> rr1 = mazepath1(cr + n, cl + n, er, ec);
				for (String val : rr1) {
					nr.add("D" + n + val);

				}

			}

		}
		return nr;

	}


	public static ArrayList<String> laddergame(int cv, int endvalue){
		
		if (cv==endvalue) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}
		if (cv>endvalue) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> nr = new ArrayList<>();
		
		ArrayList<String> rr1 = laddergame(cv+1, endvalue);
		
		for (String val : rr1) {
			nr.add("1" +  val);

		}	
		
		ArrayList<String> rr2 = laddergame(cv+2, endvalue);

		for (String val : rr2) {
			nr.add("2" +  val);

		}
		
		ArrayList<String> rr3 = laddergame(cv+3, endvalue);
		
		for (String val : rr3) {
			nr.add("3" +  val);

		}
		
		ArrayList<String> rr4 = laddergame(cv+4, endvalue);
		
		for (String val : rr4) {
			nr.add("4" +  val);

		}
		
		ArrayList<String> rr5 = laddergame(cv+5, endvalue);
	
		for (String val : rr5) {
			nr.add("5" +  val);

		
		}
		
		ArrayList<String> rr6 = laddergame(cv+6, endvalue);
		cv=cv+6;
		for (String val : rr6) {
			nr.add("6" +  val);

		}
		
	return nr;} 


	public static String getCode(char question) {
		if (question == '1')
			return "abc";
		else if (question == '2')
			return "def";
		else if (question == '3')
			return "ghi";
		else if (question == '4')
			return "jk";
		else if (question == '5')
			return "lmno";
		else if (question == '6')
			return "pqr";
		else if (question == '7')
			return "stu";
		else if (question == '8')
			return "vwx";
		else if (question == '9')
			return "yz";
		else if (question == '0')
			return "@#";
		else
			return "";
	}
	
	public static void KPC(String question,String ans) {
		if(question.length()==0) {
			
			System.out.println(ans);
			return;
		}
		char c=question.charAt(0);
		String d=question.substring(1);
		String code=getCode(c);
		for(int i=0;i<=code.length()-1;i++) {
			char newcode=code.charAt(i);
			KPC(d,ans+newcode);
			
		}
		
	}

	public static void getPermutation(String ques,String ans) {
if(ques.length()==0) {
			
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			
			char ch=ques.charAt(i);
			
		String neq=ques.substring(0,i)+ques.substring(i+1);
		getPermutation(neq,ans+ch);
		}
	}
	
	public static void getPermutation2(String ques,String ans) {
		if(ques.length()==0) {
					
					System.out.println(ans);
					return;
				}
		char ch=ques.charAt(0);
		String req=ques.substring(1);
				for(int i=0;i<=ans.length();i++) {
					
					
				String neq=ans.substring(0,i)+ch+ans.substring(i);
				getPermutation2(req,neq);
				}
			}
}