



package ch06_for;

/*
 * for 문
 * - for ( 초기식 ; 조건식 ; 증감식 ){
 *       실행 코드
 *   }
 * 
 *   > 초기식 : 반복 횟수 카운트하는 변수의 선언(생성)과 초기값 설정
 *            for문 시작과 동시에 최초 한번만 실행
 *     조건식 : 반복 횟수 설정( 실행 확인 )
 *     증감식 : 반복 횟수를 카운트하는 변수의 값을 증가 or 감소
 */

public class ForEx01 {

	public static void main(String[] args) {
		
		//  1         2     4
		for(int i=0 ; i<3 ; i++) {
			// 3
			System.out.println(i);
		}
		System.out.println();
		
		// 1(한번실행) -> 2(참) -> 3 -> 4
		//           -> 2(참) -> 3 -> 4
		//           .....
		//           -> 2(거짓) -> 종료
		
		for(int i=5 ; i>0 ; i--) {
			System.out.println(i);
		}
		System.out.println();
		
		
	}
	
}












