package july3;

import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		// Scanner scn=new Scanner(System.in);
		// int n=scn.nextInt();

		// validParenthesis(n, 0, 0, "");
		//getPermutationNoDuplicates("aabc", "");
		boardpath(0, 10, "");
	//System.out.println(lexicocounting(0, 1000));
//lexicocounting(9, 1000);
	}

	public static void validParenthesis(int n, int open, int close, String ans) {

		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}
		if (open > n || close > n || close > open) {
			return;

		}
		validParenthesis(n, open + 1, close, ans + "(");

		validParenthesis(n, open, close + 1, ans + ")");

	}

	public static void getPermutationNoDuplicates(String ques, String ans) {
		if (ques.length() == 0) {

			System.out.println(ans);
			return;
		}

		for (int i = 0; i <= ques.length() - 1; i++) {
			char ch = ques.charAt(i);
			String neq = ques.substring(0, i) + ques.substring(i + 1);
			int c = 0;
			for (int j = i + 1; j <= ques.length() - 1; j++) {

				
				if (ch == ques.charAt(j))
					c++;
			}

			if (c == 0) {
				getPermutationNoDuplicates(neq, ans + ch);
			}
		}

	}
	 static int c=1;
	public static void boardpath(int curr,int end,String ans) {
		
		if(curr==end) {
			System.out.println(c+": "+ans);
			c++;
			return;
		}
		if(curr>end)
			return;
		
		for(int dice=1;dice<=6;dice++) {
			boardpath(dice+curr, end, ans+dice);
			
		}
		
	}

	public static int mazepath(int cr,int cc,int er,int ec,String ans) {
		if(cr==er&& cc==ec) {
			System.out.println(ans);
			return 1;
		}
		if(cr>er||cc>ec) {
			return 0;
		}
		int cor=0;
		int col=0;
		col=mazepath(cr, cc+1, er, ec, ans+"H");
		cor=mazepath(cr+1, cc, er, ec, ans+"V");
		
		
		return col+cor;
		
		
		
		
		
	}
	

	public static void lexicocounting(int curr,int end) {
		int i=0;
		if(curr>end) {
			return ;
		
		}
		System.out.println(curr);
		
		if(curr==0)
		 i=1;
		int c=0;
		
		for(;i<=9;i++) {
			
			lexicocounting(curr*10+i, end);
		}
	
	}}

	