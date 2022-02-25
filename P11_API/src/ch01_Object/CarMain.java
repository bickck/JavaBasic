



package ch01_Object;

public class CarMain {

	public static void main(String[] args) {
		
		Car carA = new Car("현대", "아이오닉");
		Car carB = new Car("현대", "아이오닉");
		Car carC = new Car("기아", "ev6");
		
		System.out.println(carA.equals(carB));
		System.out.println(carA.equals(carC));
		System.out.println();
		
		System.out.println(carA);
		System.out.println(carC);
		
	}
	
}














