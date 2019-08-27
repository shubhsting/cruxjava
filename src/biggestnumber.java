
public class biggestnumber {

	public static void main(String[] args) {
		int[] arr= {54,546,548,60};
		
		ab(bubblesort(arr));
	}
	public static int[] bubblesort(int[] arr) {
		int count = arr.length ;
		for (int c = 0; c <= arr.length - 2; c++) {
			for (int j = 0; j <= count - c - 2; j++) {
				if (arr[j] > arr[j + 1]) {
					String abs=Integer.toString(arr[j]);
					String ab1s=Integer.toString(arr[j+1]);
					 
					int re1=Integer.parseInt(abs+ab1s);
					
				}

			}

		}
		return arr;

	}
	public static void ab(int[] arr) {
		
		for(int i=arr.length-2;i>=0;i--) {
			String abs=Integer.toString(arr[i]);
			String ab1s=Integer.toString(arr[i+1]);
			int re1=Integer.parseInt(abs+ab1s);
			int re2=Integer.parseInt(ab1s+abs);
			if(re1>re2)
				System.out.print(re1);
			else 
				System.out.print(re2);
		}
		
		
	}
}
