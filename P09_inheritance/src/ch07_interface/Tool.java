



package ch07_interface;

/*
 * interface
 * - 100% 순수한 추상클래스 입니다
 * - class 대신 interface를 사용해서 정의합니다
 * - interface를 상속받아서 구현할 때에는 implements 를 사용합니다
 * - 하나의 class에서 여러개의 interface를 상속 받을 수 있습니다
 */

public interface Tool {
	
	// interface안의 모든 멤버필드는 자동으로 public static final 입니다
	int A = 1;
	public static final int B = 2;
	
	// 추상 메서드
	void testMethod();  // public abstract void testMethod();
	public abstract void absMethod();
	
	// static 메서드
	public static void staMethod() {
		System.out.println("- staMethod() -");
	}
	
	// default 메서드
	default void defMethod() {
		System.out.println("- defMethod() -");
	}
	

}


















