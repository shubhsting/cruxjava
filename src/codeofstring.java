import java.util.ArrayList;
import java.util.Scanner;

public class codeofstring {

	public static void main(String[] args) {
		
Scanner scn= new Scanner(System.in);
		
		String n= scn.next();
	
	System.out.println(getcodemain(n,""));
	
	}
	public static String getCode(String question) {
		if (question.equals("1"))
			return "a";
		else if (question.equals("2"))
			return "b";
		else if (question.equals("3"))
			return "c";
		else if (question.equals("4"))
			return "d";
		else if (question.equals("5"))
			return "e";
		else if (question.equals("6"))
			return "f";
		else if (question.equals("7"))
			return "g";
		else if (question.equals("8"))
			return "h";
		else if (question.equals("9"))
			return "i";
		else if (question.equals("10"))
			return "j";
		if (question.equals("11"))
			return "k";
		else if (question.equals("12"))
			return "l";
		else if (question.equals("13"))
			return "m";
		else if (question.equals("14"))
			return "n";
		else if (question.equals("15"))
			return "o";
		else if (question.equals("16"))
			return "p";
		else if (question.equals("17"))
			return "q";
		else if (question.equals("18"))
			return "r";
		else if (question.equals("19"))
			return "s";
		else if (question.equals("20"))
			return "t";
		if (question.equals("21"))
			return "u";
		else if (question.equals("22"))
			return "v";
		else if (question.equals("23"))
			return "w";
		else if (question.equals("24"))
			return "x";
		else if (question.equals("25"))
			return "y";
		else if (question.equals("26"))
			return "z";
		
		
		else
			return "";
	}
	
	public static ArrayList<String> getcodemain(String num,String ans) {
		
		if(num.length()==0 ) {
			
	
			ArrayList<String> br = new ArrayList<>();
			br.add(ans);
			return br;
		}
		ArrayList<String> nr = new ArrayList<>();
		
		String temp=num.substring(0,1);
		
		String  j=num.substring(1);
		ArrayList<String> rr =getcodemain(j, ans+getCode(temp));
		for (String val : rr) {
			nr.add( val);
		}
		
		
		
		if(num.length()>=2 &&getCode(num.substring(0,2)) !="" ) {
		String temp1=num.substring(0,2);
		String  k=num.substring(2);
		ArrayList<String> rr1 = getcodemain(k, ans+getCode(temp1));
		for (String val : rr1) {
			nr.add( val);
		}
		}
		
	
		
		

		
		
		
		
		
		
			
		
			
			
		
	return nr;	
	}
	

}





