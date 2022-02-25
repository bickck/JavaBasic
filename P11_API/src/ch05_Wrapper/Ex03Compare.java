



package ch05_Wrapper;

/*
 * Wrapper class 데이터 비교
 * - Wrapper class로 포장된 객체의 데이터 비교시에는 '==', '!=' 연산자를 적용할 수 없습니다
 * - 예외적으로 아래의 다섯가지 형태는 바로 가능합니다
 *   > boolean, char, byte, short, int(-128 ~ 127 )
 * - 포장된 객체의 데이터 비교시에는 unboxing 해서 확인하거나, equals()를 사용합니다  
 */

public class Ex03Compare {

	public static void main(String[] args) {
		
		Integer oA = 1000;
		Integer oB = 1000;
		System.out.println(oA == oB);
		System.out.println(oA.equals(oB));
		System.out.println(oA.intValue() == oB.intValue());
		System.out.println();
		
		Integer oC = 123;
		Integer oD = 123;
		System.out.println(oC == oD);
		
		
		
		
	}
	
}





















