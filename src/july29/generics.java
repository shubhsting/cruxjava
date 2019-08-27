package july29;

public class generics {
public static void main(String[] args) {
	Car[] ab=new Car[5];
	ab[0]=new Car(1, 11, "ab");
	ab[1]=new Car(2, 22, "abc");
	ab[2]=new Car(9, 33, "abcd");
	ab[3]=new Car(4, 44, "abcde");
	ab[4]=new Car(5, 55, "abcdef");
	display(ab);
	
}
public static <T> void display(T[] arr) {
	for(T val:arr) {
		System.out.println(val);
	}
}


}
