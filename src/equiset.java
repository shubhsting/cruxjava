import java.util.ArrayList;
import java.util.Scanner;

public class equiset {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
//		equiset(arr, "", "", 0, 0, 0);
		
		equiset1(arr, new ArrayList<>(), new ArrayList<>(), 0, 0, 0);
		//System.out.println(count);
	}
	static int count;
	public static void equiset(int[] arr ,String left,String right,int ls,int rs,int vidx) {
		if(vidx==arr.length) {
			if(ls==rs||rs==ls) {
				System.out.println(left+" and"+right);
				count++;
			}
			return;
		}
		
		
		equiset(arr, left+" "+arr[vidx], right, ls+arr[vidx], rs,vidx+1);
		equiset(arr, left, right+" "+arr[vidx], ls, rs+arr[vidx], vidx+1);
		
		
	}
	
	
	public static void equiset1(int[] arr,ArrayList<Integer> lft,ArrayList<Integer> rit,int ls,int rs,int vidx){
		
		
		
		
		if(vidx==arr.length) {
			if(ls==rs) {
				System.out.print(lft);
				System.out.println(rit);
			}
			
				
			
			return;
		}
		
		ArrayList<Integer> lf=new ArrayList<>();
		ArrayList<Integer> ri=new ArrayList<>();
		
		
		lf.add(arr[vidx]);
		equiset1(arr, lf, rit, ls+arr[vidx], rs, vidx+1);
		
		
		ri.add(arr[vidx]);
		equiset1(arr, lft, ri, ls, rs+arr[vidx], vidx+1);
		
		
		
		
	}
		
}
