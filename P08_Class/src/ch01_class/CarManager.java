package ch01_class;

public class CarManager {

	public static void main(String[] args) {
		Car car = new Car();
		car.inputInfo();
		System.out.println(car.view());

		Car carA = new Car();
		carA.setCar("KIA", "K7", "BLACK", 100000);
		car.view();
	}
}
