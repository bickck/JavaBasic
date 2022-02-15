/*
 * 상수 : 값 변경 불가
 * 
 * literal(리터럴)
 * - 소스 코드안의 고정된 데이터입니다.
 * 
 * 자료형
 * - 데이터를 저장하는 공간을 생성할 떄 사용하는 이름입니다.
 * 
 * 기본 자료형
 * - 값과 이름이 하나 입니다.
 * - 데이터 공간의 크기가 고정입니다.
 * 			1byte		2byte		4byte		8byte
 * 	논리형	boolean		
 *  문자형				char
 *  정수형	byte		short		int(기본)		long
 *  실수형							float		double(기본)
 *  
 * 참조 자료형
 * - 기본자료형을 제외한 모든 자료형 입니다.
 * - 실제 데이터가 있는 곳과 이름이 분리되어 있습니다.
 * 
 * 변수
 * - 자료형을 사용해서 만들어 쓰는 데이터 입니다.
 *   > 자료형 변수명
 */
public class Ex04Integer {

	public static void main(String[] args) {
		System.out.println(10);

		int a; // 변수 선언(생성)
		// System.out.println("a : " + a); // Error
		// 모든 변수는 초기화 후에 사용해야 합니다...

		a = 10; // 변수 초기화

		System.out.println("a : " + a);

		a = 20;
		System.out.println("a : " + a);

		int ia = 11;
		System.out.println("ia :" + ia);

		// byte ba = 128; 에러 바이트를 넘었음
		// System.out.println("ba : " + ba);

		byte ba = 127; // 가능

		short sa = 32767;
		System.out.println("sa : " + sa);
		
		long la = 2147483647; // 최대값
		System.out.println("la : " + la);

	}
}
