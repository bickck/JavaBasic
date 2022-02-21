



package ch04_if_elseif;

/*
 * if ~ else if
 * - if ( 조건식_a ) {
 *       조건식_a 가 참이면 실행
 *   } else if ( 조건식_b ) {
 *       조건식_a 거짓, 조건식_b가 참이면 실행
 *   } ..... {
 *   
 *   } else {
 *       상위에 모든 조건식이  거짓이면 실행 ( 사용 O, X )
 *   }
 *   
 *   > 여러개의 조건식 중에서 하나만을 실행하거나, 특정 구간을 세분화 할 때 사용합니다
 * 
 */

public class IfelseifEx01 {

	public static void main(String[] args) {
		
		int var = 25;
		System.out.println("var : " + var);
		System.out.println();
		
		System.out.println("- if 여러개 -");
		if(var > 20)
			System.out.println("20 보다 큰수");
		if(var > 10)
			System.out.println("10 보다 큰수");
		if(var > 0)
			System.out.println("0 보다 큰수");
		System.out.println();
		
		System.out.println("- if ~ else if -");
		if(var > 20)
			System.out.println("20 보다 큰수");
		else if(var > 10)
			System.out.println("10 보다 큰수");
		else if(var > 0)
			System.out.println("0 보다 큰수");
		
		
	}
	
}


















