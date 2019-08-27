import java.util.Scanner;

public class sudoko {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		if(r%3==0) {
		int[][] arr = new int[r][r];
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		sudoko(arr, 0, 0);
		}
	}

	public static void sudoko(int[][] board, int row, int col) {
		if (row == board.length-1 && col == board[0].length) {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {

					System.out.print(board[i][j]+" ");
				}
				System.out.println();
			}
			
			return;

		}

		if (col == board[0].length) {
			row = row + 1;
			col = 0;
		}
		if (row == board.length) {
			return;
		}
		if (board[row][col] != 0) {
			sudoko(board, row, col + 1);
			return;
		} 

			for (int i = 1; i <= 9; i++) {
				if (isItPossible(board, row, col, i)) {
					board[row][col] = i;
					sudoko(board, row, col + 1);
					board[row][col] = 0;
				
				}

			}
		
		}
	

	public static boolean isItPossible(int[][] board, int row, int col, int num) {

		// vertical
		int r = board.length - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c] == num) {
				return false;
			}
			r--;
		}

		// horizontal
		c = board[0].length - 1;
		r = row;
		while (c >= 0) {
			if (board[r][c] == num) {
				return false;
			}
			c--;
		}
		// grid

		r = row - row % 3;
		c = col - col % 3;

		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (board[i][j] == num) {
					return false;
				}
			}
		}
		return true;
	}
}
