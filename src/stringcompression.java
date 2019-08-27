import java.util.Scanner;

public class stringcompression {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		String ab=scn.next();
		StringBuilder a=new StringBuilder();
		a.append(ab.charAt(0));
		int count=1;
		for(int i=0;i<=ab.length()-2;i++) {
			
			char c=ab.charAt(i);
			char d=ab.charAt(i+1);
			if(c==d) {
				count=count+1;
				
			}
			else {
				if(count>1)
				a.append(count);
				a.append(d);
				count=1;
			}
		}
		if(count>1)
			a.append(count);
		
		System.out.println(a);
	}

}
