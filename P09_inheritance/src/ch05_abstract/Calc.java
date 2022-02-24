



package ch05_abstract;

/*
 * 추상 클래스
 * - 상속받을 class에서 구현 할 특성을 정의한 class 입니다
 * - 객체를 생성할 수 없습니다
 * 
 * 추상 메서드
 * - 추상 클래스 안에 기능을 정의하지 않은 메서드 입니다
 * - 상속받는 class에서 반드시  override 해야 합니다
 */

public abstract class Calc {

	protected int dataA;
	protected int dataB;
	
	public abstract void showData();
	
	public void typyInfo() {
		System.out.println("- Calc class -");
	}
	
}

class Add extends Calc {
	
	public Add(int a, int b) {
		dataA = a;
		dataB = b;
	}
	
	public void showData() {
		System.out.println(dataA + " + " + dataB + " = " + (dataA+dataB));
	}
	
}

class Sub extends Calc {
	
	public Sub(int a, int b) {
		dataA = a;
		dataB = b;
	}
	
	public void showData() {
		System.out.println(dataA + " - " + dataB + " = " + (dataA-dataB));
	}
	
}












