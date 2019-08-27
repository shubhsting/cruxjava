package shubham;
import java.util.Scanner;
public class gcd {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int rem=0;
		int mul=a*b;
		
			while(b%a!=0) {
			  rem=b%a;
			  
			  
			  b=a;
			  a=rem;
			  
			  
			}
			int result=mul/a;
			System.out.println(result);
		
		
		
		
		
		
		
		
	}

}
