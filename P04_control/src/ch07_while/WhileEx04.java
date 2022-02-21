



package ch07_while;

import java.util.Scanner;

/*
 * do while 문
 * - do {
 *       실행 코드
 *   } while( 조건식 ) ;
 *   
 *   > 반복문의 코드가 먼저 실행되고 조건식을 확인하기 때문에, 반복문이 무조건 한번은 실행됩니다
 * 
 */

public class WhileEx04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int value = 0;
		int total = 0;
		
//		while(true) {
//			System.out.print("숫자 입력  > ");
//			value = scanner.nextInt();
//			if(value == 0)
//				break;
//			total += value;
//		}
//		System.out.println("입력값의 합 : " + total);
		
		
		total = 0;
		do {
			System.out.print("숫자 입력(종료 : 0) > ");
			value = scanner.nextInt();
			total += value;
		} while(value != 0);
		System.out.println("입력값의 합 : " + total);
		
		
		
	}
	
}
















