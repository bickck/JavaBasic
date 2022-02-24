



package ch05_abstract;

/*
 * 다형성
 * - 부모클래스를 상속 받은 객체들을, 부모 클래스 변수 하나로 사용하는 것입니다
 * 
 * 동적 바인딩
 * - 실행 할 메서드를 실행시(run time)에 결정하는 것입니다
 */

public class CalcMain {

	public static void main(String[] args) {
		
		Add add = new Add(12, 24);
		add.showData();
		
		Sub sub = new Sub(23, 45);
		sub.showData();
		System.out.println();
		
		//Calc calc = new Calc(); //Error
		Calc calc = null;
		calc = add;  // up casting
		calc.showData();
		// 부모클래스의 메서드가 오버라이드 되어 있으면 자식클래스의 메서드를 실행합니다
		
		calc = sub;
		sub.showData();
		System.out.println();
		
		int a = 123;
		int b = 45;
		char opt = '+';
		
		Calc run = null;
		switch(opt) {
		case '+':
			run = new Add(a, b); break;
		case '-':
			run = new Sub(a, b); break;
		}
		if(run != null) {
			run.showData();
		}
		
	}
	
}




















