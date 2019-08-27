package july29;

import java.util.Comparator;

//public class Car implements Comparable<Car> {
//	int speed;
//	int price;
//	String color;
//
//	public Car(int speed, int price, String color) {
//		this.speed = speed;
//		this.price = price;
//		this.color = color;
//	}
//
//	public String toString() {
//		String s = ("S: " + speed + "P: " + price + "C: " + color);
//		// return super.toString();
//		return s;
//	}
//
//	@Override
//	public int compareTo(Car other) {
//
//		// return this.speed-other.speed;
//		// return this.price-other.price;
//		return this.color.compareTo(other.color);
//
//	}
//
//}
public class Car {
	int speed;
	int price;
	String color;

	public Car(int speed, int price, String color) {
		this.speed = speed;
		this.price = price;
		this.color = color;
	}

	public String toString() {
		String s = ("S: " + speed + "P: " + price + "C: " + color);
		// return super.toString();
		return s;
	}
	
}


