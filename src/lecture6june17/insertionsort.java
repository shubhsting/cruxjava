package lecture6june17;

public class insertionsort {

	public static void main(String[] args) {
	
	int[] arr= {40,60,30,70,22};
	insertionsort(arr);
	display(arr);

	}
	public static void insertionsort(int[] arr){
		int n=arr.length;
		for(int count=1;count<=n-1;count++) {
			int temp=arr[count];
			int j=count-1; 
				while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
					
				j--;	
				}
				arr[j+1]=temp;
				
				
			
			
			
			
			
			
		}
		
		
		
		
		
	}
	public static void display(int[] arr1) {
		
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" \t");
			
			
		}
		System.out.println();

		
	}
}
