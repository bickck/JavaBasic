package ch09_Quiz;

public class Triangle implements Shape {

	private double x;
	private double y;

	public Triangle(double x2, double y2) {
		this.x = x2;
		this.y = y2;
	}

	@Override
	public void drawing() {
		System.out.println("삼각형을 그립니다.");
	}

	@Override
	public double getArea() {

		return x * y;
	}
}
