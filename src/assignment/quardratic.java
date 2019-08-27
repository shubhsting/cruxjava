package assignment;

import java.util.Scanner;
import java.lang.Math; 
public class quardratic {

	public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
		
		int a= scn.nextInt();
		int b= scn.nextInt();
		int c= scn.nextInt();
		if((b*b - 4*a*c)<0){
			System.out.println("Imaginary");
		}
		else {
		
		
		if( (b*b - 4*a*c)==0) {
			
			System.out.println("Real and Equal");
			
		}
		else if((b*b - 4*a*c)>0)
		{
			System.out.println("Real and Distinct");
		}
		int root1=(int)( (-b + Math.sqrt(b*b - 4*a*c))/2*a);
		int root2= (int)((-b - Math.sqrt(b*b - 4*a*c))/2*a);
		System.out.print(root2+" ");
		System.out.println(root1);
		}
	}

}
