package july10;

import java.util.Scanner;

public class randomrecursion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int c = scn.nextInt();
		 queencombinationbox2d(new boolean[c][c], 0, 0, 0, c, "");
		 System.out.println();
		 System.out.println(count);
		//int[][] arr = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		//blockedmazepath(arr, 0, 0, "", new boolean[4][4]);
		//char[][] arr = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		//String ques="SEE";
	//	boolean ans =false;
		//for(int i=0;i<arr.length;i++) {
		//	for(int j=0;j<arr[i].length;j++) {
			//	if(arr[i][j]==ques.charAt(0)) {
			//		ans=ans||word(arr, ques, i, j, 0,new boolean[arr.length][arr[0].length] );
			//	}
				
			//}
			
		//}
	//	System.out.println(ans);
	}

	static int count;

	public static void queencombinationbox2d(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			System.out.print( ans+" ");
			count++;
			return;

		}

		if (col == board[0].length) {
			row = row + 1;
			col = 0;
		}
		if (row == board.length) {
			return;
		}
		// yes
		if (isItSafe(board, row, col)) {
			board[row][col] = true;
			queencombinationbox2d(board, row, col + 1, qpsf + 1, tq, ans + "{" + row + "-" + col + "} ");
			board[row][col] = false;
		}
		// no
		queencombinationbox2d(board, row, col + 1, qpsf, tq, ans);

	}

	public static boolean isItSafe(boolean[][] board, int row, int col) {

		// vertical
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}

		// horizontal
		c = col - 1;
		r = row;
		while (c >= 0) {
			if (board[r][c]) {
				return false;
			}
			c--;
		}

		// diagonally left
		c = col - 1;
		r = row - 1;
		while (c >= 0 && r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		c = col + 1;
		r = row - 1;

		// diagonally right
		while (c < board[0].length && r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}

		return true;
	}

	public static void blockedmazepath(int[][] arr, int cr, int cl, String ans, boolean[][] visited) {

		if (cr == arr.length - 1 && cl == arr[0].length - 1) {
			System.out.println(ans);
			return;
		}
		if (cr >= arr.length || cl >= arr[0].length || cr < 0 || cl < 0) {
			return;
		}
		if (visited[cr][cl] || arr[cr][cl] == 1) {
			return;
		}
		visited[cr][cl] = true;

		blockedmazepath(arr, cr + 1, cl, ans + "B", visited);
		blockedmazepath(arr, cr - 1, cl, ans + "T", visited);
		blockedmazepath(arr, cr, cl + 1, ans + "R", visited);
		blockedmazepath(arr, cr, cl - 1, ans + "L", visited);
		visited[cr][cl] = false;
	}

	public static boolean word(char[][] arr,String ques,int cr,int cl,int idx,boolean[][] visited) {
		if(idx==ques.length()) {
			return true;
		}
		
		if (cr >= arr.length || cl >= arr[0].length || cr < 0 || cl < 0) {
			
			return false;
			
			
		}
		if (visited[cr][cl] || arr[cr][cl] !=ques.charAt(idx) ) {
			return false;
		}
		
		
		visited[cr][cl]=true;
		
		boolean d=word(arr, ques, cr+1, cl, idx+1, visited);
		boolean u=word(arr, ques, cr-1, cl, idx+1, visited);
		boolean r=word(arr, ques, cr, cl+1, idx+1, visited);
		boolean l=word(arr, ques, cr, cl-1, idx+1, visited);
		
		
		
		visited[cr][cl]=false;
		return d||u||r||l;
	}
}
