package exercise2;

import java.util.Optional;

public class App {

	public static void main(String[] args) {
		Employee kent = new Employee(50);
		JobItem j1 = new LaborItem(5, kent);
		JobItem j2 = new MaterialItem(15, 10);
		int total = j1.getTotalPrice() + j2.getTotalPrice();
	}

}
