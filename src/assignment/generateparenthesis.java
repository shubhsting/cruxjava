package assignment;

import java.awt.List;
import java.util.ArrayList;

public class generateparenthesis {

	public static void main(String[] args) {
		ArrayList<String> s=generateParenthesis(3);
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
	}
	public static ArrayList<String> generateParenthesis(int n) {
	    ArrayList<String> result = new ArrayList<String>();
	    dfs(result, "", n, n);
	    return result;
	}
	public static void dfs(ArrayList<String> result, String s, int left, int right){
	    if(left > right)
	        return;
	 
	    if(left==0&&right==0){
	        result.add(s);
	        return;
	    }
	 
	    if(left>0){
	        dfs(result, s+"(", left-1, right);
	    }
	 
	    if(right>0){
	        dfs(result, s+")", left, right-1);
	    }
	}
}
