package ch09_Quiz;

public class Rectangle implements Shape {

	private double x;
	private double y;

	public Rectangle(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public double getArea() {

		return x * y;
	}

	@Override
	public void drawing() {
		System.out.println("사각형을 그립니다.");
	}

}
