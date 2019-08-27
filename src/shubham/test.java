package shubham;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int i; 
		int n=scn.nextInt();
		int j;
		
		for( i=2;i<=n;i++)
	    {
	        int c=0;
	        for(j=1;j<=i;j++)
	        {
	            if(i%j==0)
	            {
	                c++;
	            }
	        }
	         
	       if(c==2)
	        {
	            System.out.println(i);
	        }
	
	    }}}
