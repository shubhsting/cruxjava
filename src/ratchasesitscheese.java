import java.util.Scanner;

public class ratchasesitscheese {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		char[][] arr=new char[r][c];
		
		for(int i=0;i<r;i++) {
			String scr=scn.next();
			for(int j=0;j<c;j++) {
				arr[i][j]=scr.charAt(j);
				
			}
		}
		
		
		int[][] visited=new int[r][c];
		blockedmazepath(arr, 0, 0, visited);
		
		if(flag==false) {
System.out.println("NO PATH FOUND");
			
		}
	}
	static boolean flag=false;
	
	public static 	void blockedmazepath(char[][] arr, int cr, int cl,  int[][] visited) {

		if (cr == arr.length - 1 && cl == arr[0].length - 1) {
			visited[cr][cl]=1;
			flag=true;
			for(int i=0;i<visited.length;i++) {
				for(int j=0;j<visited[0].length;j++) {
					System.out.print(visited[i][j]+" ");
					
				}
			System.out.println();
		}
			return;}
			
			
		
		
		if (cr >= arr.length || cl >= arr[0].length || cr < 0 || cl < 0) {
			return;
		}
		if (visited[cr][cl]==1 || arr[cr][cl]=='X') {
			return;
		}
		visited[cr][cl] = 1;

		blockedmazepath(arr, cr + 1, cl, visited);
		blockedmazepath(arr, cr - 1, cl,  visited);
		blockedmazepath(arr, cr, cl + 1, visited);
		blockedmazepath(arr, cr, cl - 1, visited);
		visited[cr][cl] = 0;
	
		
}
	
}