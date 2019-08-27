import java.util.Scanner;

public class maxfreq {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		String ab=scn.next();
		StringBuilder a=new StringBuilder();
		char m;
		int[] arr=new int[ab.length()];
		int count=0;
		int cout1=0;
		for(int i=0;i<ab.length()-1;i++) {
			char c=ab.charAt(i);
			for(int j=i+1;j<=ab.length()-1;j++) {
				char d=ab.charAt(j);
				if(c==d) {
					count=count+1;
					
				}
				
				
				}
			a.append(c);
			arr[i]=count;
			count=0;
			
		}
		int abc = 0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>abc)
				abc=arr[i];
			
			
		}
	System.out.println(a.charAt(abc));

	}

}
