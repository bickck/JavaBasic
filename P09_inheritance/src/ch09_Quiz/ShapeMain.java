package ch09_Quiz;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();

		System.out.println();

		Shape pen = null;

		switch (select) {
		case 1:
			System.out.println("x 입력");
			double tx = sc.nextDouble();

			System.out.println("y 입력");
			double ty = sc.nextDouble();
			pen = new Triangle(tx, ty);
			break;

		case 2:
			System.out.println("x 입력");
			double rx = sc.nextDouble();

			System.out.println("y 입력");
			double ry = sc.nextDouble();
			pen = new Rectangle(rx, ry);
			break;

		}
		if (pen != null) {
			System.out.println("넓이 :" + pen.getArea());
			pen.drawing();
		}
	}
}
