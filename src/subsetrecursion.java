import java.util.Scanner;

public class subsetrecursion {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
		arr[i]= scn.nextInt();}
		int sum=scn.nextInt();
	subset(arr, sum, "", 0,-1);
System.out.println();
System.out.println(count);
	}
	static int count;
	public static void subset(int[] arr,int sum,String ans,int virt,int lu) {
		
		if(virt==sum) {
			System.out.print(ans+" ");
			count=count+1;
			return ;
		}
		if(virt>sum) {
			return ;
		}
		
		
		for(int i=lu+1;i<arr.length;i++) {
			
			if((virt+arr[i])<=sum) {
				subset(arr, sum, ans+arr[i]+" ",virt+arr[i],i);
				
				
			}
			
			
		}
	}
}
