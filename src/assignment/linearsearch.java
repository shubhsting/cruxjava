package assignment;
import java.util.Scanner;
public class linearsearch {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
        }
        int b=scn.nextInt();
        int j=0;
        while(j<n){
            if(b==arr[j]) {
            	System.out.println(j);
             break;}
            
            	
            
             j=j+1;
            
            
        }
        if(j==n) {
        	System.out.println("-1");
        }

	}

}
