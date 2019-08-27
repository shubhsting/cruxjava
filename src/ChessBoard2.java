

import java.util.ArrayList;
import java.util.Scanner;

public class ChessBoard2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] board = new int[n][n];
		int count1 = 1;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				board[row][col] = count1;
				count1++;
			}
		}

		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = 2; i <= n * n; i++) {
			if (isPrime(i))
				primes.add(i);
		}

//		for (int i = 0; i < board.length; i++) {
//			for (int j = 0; j < board[0].length; j++) {
//				System.out.print(board[i][j] + " ");
//			}
//			System.out.println();
//		}
		ChessBoardProb(board, 0, 0, n - 1, n - 1, "", primes);
		System.out.println();
		System.out.println(count);
//		System.out.println(primes);
	}

	static int count = 0;

	public static void ChessBoardProb(int[][] board, int cr, int cc, int fr, int fc, String ans,
			ArrayList<Integer> primes) {

		if (cr == fr && cc == fc) {
			System.out.print(ans + "{" + fr + "-" + fc + "}" + " ");
			++count;
			return;
		}

		if (cr > fr || cc > fc) {
			return;
		}

		if (isPrime(board[cr][cc])) {
			for (int i = 0; i <= primes.size() - 1; i++) {
				if (i % 2 == 0) {
					// mine(donot stop)
					if (board[cr][cc] == primes.get(i)) {
						return;
					}

				} else {
					// Port
					if (board[cr][cc] == primes.get(i)) {
						System.out.print(ans + "{" + cr + "-" + cc + "}P{" + fr + "-" + fc + "} ");
						
						++count;
						
					}
				}
			}
		}
		// knight
		ChessBoardProb(board, cr + 2, cc + 1, fr, fc, ans + "{" + cr + "-" + cc + "}k", primes);
		ChessBoardProb(board, cr + 1, cc + 2, fr, fc, ans + "{" + cr + "-" + cc + "}k", primes);

		// Rock
		if (cr == 0 || cr == fr || cc == 0 || cc == fc) {
			for (int i = 1; i <= fr; i++) {
				ChessBoardProb(board, cr, cc + i, fr, fc, ans + "{" + cr + "-" + cc + "}R", primes);
			}
			for (int i = 1; i <= fr; i++) {
				ChessBoardProb(board, cr + i, cc, fr, fc, ans + "{" + cr + "-" + cc + "}R", primes);
			}
		}

		// bishop
		for (int i = 1; i <= fr; i++) {
			if (cc == cr || cc + cr == fr) {
				ChessBoardProb(board, cr + i, cc + i, fr, fc, ans + "{" + cr + "-" + cc + "}B", primes);
			}
		}
	}

	public static boolean isPrime(int n) {

		for (int i = 2; i * i <= n; i++) {

			if (n % i == 0)
				return false;

		}
		return true;

	}

}