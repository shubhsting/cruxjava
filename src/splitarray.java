
public class splitarray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,3,4,5};
		split(arr, "", "", 0, 0);

	}
	public static void split(int[] arr  ,String ls,String rs,int rsu,int lsu) {
		
		if(lsu==rsu) {
			System.out.println(lsu+"ans"+rsu);
			return;
		}
		
		int i=0;
		int j=arr.length-1;
		
		while(lsu!=rsu) {
			
			if(arr[j]>arr[i]) {
				split(arr, ls+arr[i], rs, rsu, lsu+arr[i]);
				i++;
			}
			
			else if(arr[i]<arr[j]) {
				
			
				
			}
			
		}
		
	}
}
