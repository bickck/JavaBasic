package ch01_inheritance;

public class Point {

	private int px;
	private int py;

	public Point() {
		System.out.println("- Point 생성자1 -");
		this.px = this.py = 0;
	}

	public int getPx() {
		return px;
	}

	public void setPx(int px) {
		this.px = px;
	}

	public int getPy() {
		return py;
	}

	public void setPy(int py) {
		this.py = py;
	}

	public void info() {
		System.out.println("좌표 X:" + px + " - Y" + py);
	}

}
