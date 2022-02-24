



package ch04_casting;

/*
 * instanceof 연산자
 * - 참조 변수가 실제로 참조하고 있는 객체가 어떤 타입인지를 확인할 때 사용합니다
 *   객체 타입이 동일하면 true, 다르면 false 입니다
 */

public class CastingTest {

	public static void main(String[] args) {
		
		UnitA userA = new UnitA();
		userA.attack();
		userA.unitAttack();
		System.out.println();
		
		Base base = userA;  // up casting : 자동 형변환
		base.attack();
		//base.unitAttack(); Error
		System.out.println();
		
		userA = (UnitA)base; // down casting : 변환 타입을 명시해야 합니다
		userA.attack();
		userA.unitAttack();
		System.out.println();
		
		if(base instanceof UnitA) {
			userA = (UnitA)base;
			userA.attack();
			userA.unitAttack();
		} else {
			System.out.println("타입이 달라요~");
		}
		
		//UnitB userB = (UnitB)base;
		if(base instanceof UnitB) {
			UnitB userB = (UnitB)base;
		} else {
			System.out.println("타입이 달라요~");
		}
		
		
		
	}
	
}


















