package july5;

public class randomrecursion {

	public static void main(String[] args) {

		// palindromePartitioning("nitin", "");
		// queenCombination(new boolean[4], 0, 2, "",0);
	//	int[] arr = { 2, 3, 5, 6 };
		//CoinChange(arr, 10, "", 0,0);
		queencombinationbox2d(new boolean[2][2],0, 0, 0, 2, "");
	}

	public static void palindromePartitioning(String ques, String ans) {
		if (ques.length() == 0) {

			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String part = ques.substring(0, i);
			String neq = ques.substring(i);

			if (ispalindrome(part)) {
				palindromePartitioning(neq, ans + part + " ");

			}

		}
	}

	public static boolean ispalindrome(String s) {

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;

		}

		return true;
	}

	static int count;

	public static void queenPermutation(boolean[] board, int qpsf, int tqq, String ans) {

		if (qpsf == tqq) {

			System.out.println(++count + " " + ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				queenPermutation(board, qpsf + 1, tqq, ans + "q" + qpsf + "b" + i + " ");
				board[i] = false;
			}
		}

	}

	public static void queenCombination(boolean[] board, int qpsf, int tqq, String ans, int lbu) {

		if (qpsf == tqq) {

			System.out.println(++count + " " + ans);
			return;
		}
		for (int i = lbu+1; i < board.length; i++) {
		
				board[i] = true;
				queenCombination(board, qpsf + 1, tqq, ans + "q" + qpsf + "b" + i + " ", i);

				board[i] = false;

			
		}

	}

	public static void CoinChange(int[] denom, int amount, String ans, int ans1,int lbu) {

		if (amount == ans1) {
			System.out.println(ans);
			return;
		}
		for (int i = lbu; i < denom.length; i++) {

			if (ans1 + denom[i] <= amount) {
				CoinChange(denom, amount, ans + denom[i], ans1 + denom[i],i);
			}
			
		}
		
	}
	
	
	public static void queencombinationbox(boolean[] board,int col,int qpsf,int tq,String ans ) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
			
		}
		if(col==board.length) {
			return;
		}
		//yes
		board[col]=true;
		queencombinationbox(board, col+1, qpsf+1, tq, ans+"b"+col);
		board[col]=false;
		
		//no
		queencombinationbox(board, col+1, qpsf, tq, ans);
		
		
	}
	
	
	
	
	public static void queencombinationbox2d(boolean[][] board,int row,int col,int qpsf,int tq,String ans ) {
		if(qpsf==tq) {
			System.out.println(++count+" --"+ans);
			return;
			
		}
		
		if(col==board[0].length) {
			row=row+1;
			col=0;
		}
		if(row==board.length) {
			return;
		}
		//yes
		board[row][col]=true;
		queencombinationbox2d(board,row, col+1, qpsf+1, tq, ans+"b"+row+col+" ");
		board[row][col]=false;
		
		//no
		queencombinationbox2d(board, row,col+1, qpsf, tq, ans);
		
		
	}
	
}
