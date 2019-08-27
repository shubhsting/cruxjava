import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        String[] arr=new String[m];
        for(int i=0;i<arr.length;i++) {
        	
        	arr[i]=scan.next();
        }
		sequence(arr);

	}
	public static void sequence(String[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			String temp="";
			temp=arr[i];
			while(temp.length()!=0) {
				temp=temp.substring(1);
				count=count+1;
			}
				String te="";
				te=arr[i];
				while(te.length()!=0) {
					char d=te.charAt(0);
					if(d=='I') {
						System.out.println("1 2 ");
					}
					if(d=='D') {
						System.out.println(count+" "+(count-1));
						count=count-2;
					}
				}
				
				
			
		}
		
	}

}
