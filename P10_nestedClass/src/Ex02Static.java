

/*
 * 정적 중첩 클래스
 * - 내부 클래스에서 static 멤버필드를 사용할 수 있습니다
 * - 외부 클래스의 static 멤버만 사용할 수 있습니다
 * - 외부 클래스의 객체 생성과 상관없이 독립적으로 객체 생성이 가능합니다
 */

class Outer2 {
	
	public static int a;
	private int b;
	
	static { a = 1; }
	
	public Outer2() {
		b = 2;
	}
	
	public void info() {
		System.out.println("- outer2Info() -");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	
	static class Inner2 {
		
		public static int c; 
		private int d;
		
		static { c = 3; }
		
		public Inner2() { d = 4; }
		
		public void inner2Info() {
			System.out.println("- innerI2nfo() -");
			System.out.println("a : " + a);
			//System.out.println("b : " + b); Error
			System.out.println("c : " + c);
			System.out.println("d : " + d);
		}
		
	}
}

class MySystem {
	
	static final class Inner {
		
		public void println(String message) {
			System.out.println(message);
		}
		
	}
	
	static final Inner out = new Inner();
	
}

public class Ex02Static {

	public static void main(String[] args) {
		
		Outer2.Inner2 oi2 = new Outer2.Inner2();
		oi2.inner2Info();
		System.out.println();
		
		MySystem.out.println("my print");
		
	}
	
}

























