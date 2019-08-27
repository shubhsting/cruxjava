import java.util.Scanner;

public class chessboardproblem {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
		chessboard(new int[n][n], 0, 0, n-1, n-1, "");
		System.out.println();
		System.out.println(count);

	}

	static int count;

	public static void chessboard(int[][] arr, int cr, int cl, int er, int ec, String ans) {
		if (cr == er && cl == ec) {
			ans = ans + "{" + cr + "-" + cl + "}";
			System.out.print(ans+" ");
			count++;
			return;
		}
		if (cr > er || cl > ec) {
			return;
		}

		if (cr + 2 <= er && cl + 1 <= ec) {
			chessboard(arr, cr + 2, cl + 1, er, ec, ans + "{" + cr + "-" + cl + "}K");}
		
		if (cr + 1 <= er && cl + 2 <= ec) {
			chessboard(arr, cr + 1, cl + 2, er, ec, ans + "{" + cr + "-" + cl + "}K");
		}
		
		
		if (cl == 0 || cl == ec || cr == 0 || cr == er) {
			for (int i = 1; i + cl <= ec; i++)
				chessboard(arr, cr, cl + i, er, ec, ans + "{" + cr + "-" + cl + "}R");
			
			for (int i = 1; i + cr <= er; i++)
				chessboard(arr, cr + i, cl, er, ec, ans + "{" + cr + "-" + cl + "}R");

			
		}
		if (cr == cl || cr + cl == er) {
			for (int i = 1; i + cr <= er && i + cl <= ec; i++)
				chessboard(arr, cr + i, cl + i, er, ec, ans + "{" + cr + "-" + cl + "}B");
		}

	}
}
