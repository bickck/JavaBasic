



package ch03_nested_if;

/*
 * 중첩 if
 * - if ( 조건식_a ) {
 *       조건식_a가 참이면 실행
 *       if ( 조건식_b ) {
 *           조건식_a, 조건식_b 둘다 참이면 실행
 *       } else {
 *           조건식_a 참, 조건식_b가 거짓이면 실행
 *       }
 *   }
 * 
 *   > 조건식에 대한 결과에 대해서 세분화 하거나, 재분류 할 때 사용합니다
 * 
 */

public class NestedIf {

	public static void main(String[] args) {
		
		int data = -9;
		int mdata = 0;
		System.out.println("data : " + data);
		System.out.println();
		
		if(data >= 0) {
			System.out.println("plus");
			if(data%2 == 1) {
				System.out.println("홀수");
			} else {
				System.out.println("짝수");
			}
		} else {
			System.out.println("minus");
			mdata = data * -1;
			if(mdata%2 == 1) {
				System.out.println("홀수");
			} else {
				System.out.println("짝수");
			}
		}
		
	}
	
}



















