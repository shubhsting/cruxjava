package june24;

public class skips {

	public static void main(String[] args) {
		// System.out.println(fibonacci(5));

		int[] arr = { 10, 20, 30, 40, 25 ,30,30};
	// System.out.println(firstindex(arr,300,0));
		// System.out.println(max(arr, 0));
		int[] ar=findindex(arr, 0, 30,0);
		for(int val:ar) {
			System.out.println(val);
		}
		}
		

	public static void dcr(int n) {
		if (n == 0)
			return;

		if (n % 2 == 1)
			System.out.println(n);
		dcr(n - 1);

		if (n % 2 == 0)
			System.out.println(n);

	}

	public static int factorial(int n) {

		if (n == 1)
			return 1;

		int fact1 = factorial(n - 1);

		int fn = fact1 * n;

		return fn;

	}

	public static int power(int n, int p) {
		if (p == 0)
			return 1;

		int res1 = power(n, p - 1);

		int res = res1 * n;
		return res;

	}

	public static int fibonacci(int n) {
		if (n == 1)
			return 1;
		if (n == 0)
			return 0;

		int p = fibonacci(n - 1);
		int q = fibonacci(n - 2);

		int result = p + q;
		return result;

	}

	public static int firstindex(int[] arr, int item, int virt) {
		if (virt == arr.length)
			return -1;

		if (arr[virt] == item) {

			return virt;
		}

		int m = firstindex(arr, item, virt + 1);

		return m;
	}

	public static int lastindex(int[] arr, int item, int virt) {
		if (virt == arr.length)
			return -1;

		int m = lastindex(arr, item, virt + 1);

		if (arr[virt] == item && m == -1) {
			return virt;

		}
		return m;
	}


	public static int max(int[] arr,int virt) {
		if (virt == arr.length-1)
			return arr[virt];
		int ab=max(arr,virt+1);
		if(ab>arr[virt])
			{
			return ab;
		}
		else {
			return arr[virt];
		}
			
	}
	public static int[] findindex(int[] arr,int virt,int item,int count) {
		
		if (virt == arr.length) {
			 int[] br = new int[count];
		return br;
		}
			
		int[] rr;
		if(item==arr[virt]) {
			rr=findindex( arr, virt+1, item, count+1);
			rr[count]=virt;
		}
		else {
			rr= findindex( arr, virt+1, item, count);
			
			
		}
	
		return rr;
	}
}
