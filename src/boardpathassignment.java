import java.util.Scanner;

public class boardpathassignment {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int c = scn.nextInt();
		int d = scn.nextInt();
		boardpath(0, c, "",d);
System.out.println();
		
		System.out.println(count);
	}
	 static int count;
		public static void boardpath(int curr,int end,String ans,int d) {
			
			if(curr==end) {
				System.out.print(ans+" ");
				count++;
				return;
			}
			if(curr>end)
				return;
			
			for(int dice=1;dice<=d;dice++) {
				boardpath(dice+curr, end, ans+dice,d);
				
			}
			
		}
}
