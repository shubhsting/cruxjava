package shubham;
import java.util.Scanner;
public class fib {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
	
	int n=scn.nextInt();
		int a=0;
		int b=1;
		int  sum=0;
		while(a<n)
		{
			System.out.println(a);
			sum=a+b;
			
			a=b;
			b=sum;
			
		}
	
	
	
	}

}
