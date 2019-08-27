package july31;

public class car implements Comparable<car> {
	int speed;
	int price;
	String color;

	public car(int speed, int price, String color) {
		this.speed = speed;
		this.price = price;
		this.color = color;
	}

	public String toString() {
		String s = (" S: " + speed + " P: " + price + " C: " + color);
		// return super.toString();
		return s;
	}

	@Override
	public int compareTo(car other) {

		// return this.speed - other.speed;
		// return other.price-this.price;
		return this.color.compareTo(other.color);

	}

}
