



package ch05_Wrapper;

/*
 * Wrapper class
 * - 기본자료형을 포장해서 객체화 시키는 클래스 입니다
 * - 기본타입                 Wrapper
 *   byte            Byte
 *   short           Short
 *   int             Integer
 *   long            Long
 *   float           Float
 *   double          Double
 *   boolean         Boolean
 *   char            Character
 */

public class Ex01Wrapper {

	public static void main(String[] args) {
		
		// boxing
		// - 기본타입의 값을 포장해서 객체화하는 과정
		// - Wrapper class의 인자값으로 기본타입의 값 또는 문자열을 사용하면 됩니다
		Integer wia = new Integer(1000);
		Integer wib = new Integer("2000");
		Double wda = new Double(2.4);
		
		// 각 Wrapper class 마다 가지고 있는 'valueOf()' 메서드를 사용해도 됩니다
		Integer wic = Integer.valueOf("3000");
		
		// auto boxing
		Integer wid = 4000;
		
		//------------------------------------------------------------
		
		// unboxing
		// - 포장된 객체를 기본타입으로 변환하는 과정입니다
		// - '기본타입+value()' 메서드로 unboxing 합니다
		int ia = wia.intValue();
		double da = wda.doubleValue();
		
		// auto unboxing
		int ib = wib;
		
		// 연산시 auto unboxing
		int res = wic + 2000;
		
	}
	
}




















