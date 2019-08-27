package assignment;
import java.util.Scanner;
public class removingrepeatedcharacters {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		String ab=scn.next();
		StringBuilder a=new StringBuilder();
		for(int i=0;i<ab.length()-1;i++) {
			char c=ab.charAt(i);
			
			for(int j=i+1;j<=ab.length()-1;j++) {
				char d=ab.charAt(j);
				if(d==c) {
				
					ab.replace(d, Character.toUpperCase(d));
				}
				
				
				
			}}
		
		
			for(int k=0;k<=ab.length()-1;k++) {
				char e=ab.charAt(k);
				if(Character.isLowerCase(e) ) {
					
					a.append(e);
				}
				
			}
			
			System.out.println(a);
			
		
		

	}

}
