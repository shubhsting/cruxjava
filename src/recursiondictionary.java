import java.util.Scanner;

public class recursiondictionary {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		getPermutation(s, "",s);
	}
	public static void dictionary(String ques,String ans,String q1) {
		
		
		}
		
	public static void getPermutation(String ques,String ans,String q1) {
		if(ques.length()==0) {
				
			for(int i=0;i<q1.length()-1;i++) {
					if(ans.charAt(i)>q1.charAt(i)) {
					System.out.println(ans);
					return;}
					
					else if(ans.charAt(i)==q1.charAt(i)) {
						if (ans.charAt(i+1)>q1.charAt(i+1)){
							System.out.println(ans);
							return;
						}
						
					}
					else {
					return;}
			}
					
				}
				
				for(int i=0;i<ques.length();i++) {
					
					char ch=ques.charAt(i);
					
				String neq=ques.substring(0,i)+ques.substring(i+1);
				getPermutation(neq,ans+ch,q1);
				}
			}
}
