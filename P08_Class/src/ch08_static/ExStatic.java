



package ch08_static;

/*
 * static
 * - class 공통 멤버로서 객체를 생성하지 않아도 사용할 수 있는 필드와 메서드 입니다
 * 
 * static 멤버필드
 * - 같은 class 에서 공통으로 사용하는 변수 입니다
 * 
 * 
 */

public class ExStatic {
	
	public static int staValue;
	private int priValue;
	
	static {
		System.out.println("- static area -");
		staValue = 0;
		//priValue = 0; Error
	}
	
	public ExStatic() {
		++staValue;
		++priValue;
		System.out.println("staValue : " + staValue + " - priValue : " + priValue);
	}
	
	public void info() {
		System.out.println("staValue : " + staValue);
		System.out.println("priValue : " + priValue);
	}
	
	public static void staticMethod() {
		System.out.println("- staticMethod() -");
		System.out.println("staValue : " + staValue);
		//System.out.println("priValue : " + priValue); Error
		int data = 1;
	}

}
























