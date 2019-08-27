package july29;

import java.util.Comparator;

public class classspeedcomparator implements Comparator<Car> {

	public int compare(Car d, Car o) {

		return d.speed - o.speed;
	}

}
