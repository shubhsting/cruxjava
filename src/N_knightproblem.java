import java.util.Scanner;

public class N_knightproblem {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int c = scn.nextInt();
		knightproblem(new boolean[c][c], 0, 0, 0, c, "");
		System.out.println();
		
		System.out.println(count);

	}

	static int count;

	public static void knightproblem(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			System.out.print(ans + " ");
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
			knightproblem(board, row, col + 1, qpsf + 1, tq, ans + "{" + row + "-" + col + "} ");
			board[row][col] = false;
		}
		// no
		knightproblem(board, row, col + 1, qpsf, tq, ans);

	}

	public static boolean isItSafe(boolean[][] board, int row, int col) {
		int r = 0;
		int c = 0;
		// upleft
		if (row - 2 >= 0 && col - 1 >= 0 && col - 1 < board[0].length && row - 2 < board.length) {
			r = row - 2;
			c = col - 1;

			if (board[r][c]) {
				return false;
			}
		}

		// upright
		if (row - 2 >= 0 && col + 1 >= 0 && col + 1 < board[0].length && row - 2 < board.length) {
			c = col + 1;
			r = row - 2;
			if (board[r][c]) {
				return false;
			}
		}
			// behind left
			if (row - 1 >= 0 && col - 2 >= 0 && col - 2 < board[0].length && row - 1 < board.length) {
				c = col - 2;
				r = row - 1;

				if (board[r][c]) {
					return false;
				}

			}

			// front right
			if (row - 1 >= 0 && col + 2 >= 0 && col + 2 < board[0].length && row - 1 < board.length) {
				c = col + 2;
				r = row - 1;

				if (board[r][c]) {
					return false;
				}

			

		}
		return true;
	}
}