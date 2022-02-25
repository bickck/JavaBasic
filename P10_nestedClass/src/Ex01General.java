

/*
 * 중첩 클래스
 * - class 안에 class를 정의할 수 있습니다
 * 
 * 일반 중첩 클래스
 * - 외부 클래스 객체가 있어야지만 객체 생성이 가능합니다
 */

class Outer {
	
	public static int a;
	private int b;
	
	static { a = 1; }
	
	public Outer() {
		b = 2;
	}
	
	public void info() {
		System.out.println("- outerInfo() -");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	
	public void generalTest() {
		Inner in = new Inner();
		in.innerInfo();
	}
	
	class Inner {
		
		// public static int c; Error
		private int d;
		
		public Inner() { d = 3; }
		
		public void innerInfo() {
			System.out.println("- innerInfo() -");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("d : " + d);
		}
		
	}
}

public class Ex01General {

	public static void main(String[] args) {
		
		Outer outerA = new Outer();
		outerA.info();
		System.out.println();
		
		// Inner innerA = new Inner(); Error
		Outer.Inner oiA = outerA.new Inner();
		oiA.innerInfo();
		System.out.println();
		
		outerA.generalTest();
		
	}
	
}


















