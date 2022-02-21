

package ch05_switch;

/*
 * switch 문
 * - switch ( 값 ) {
 *   case 상수값 :
 *       실행 코드
 *       break; <- switch 종료
 *   .....
 *   case 상수값 :
 *       실행 코드
 *       break;
 *   default :
 *       실행코드
 *   }
 *   
 *   > switch 문안의 값과 정확하게 일치하는 case 값을 찾아서 해당 지역의 코드를 실행합니다
 *     - switch : 정수, 문자, 문자열
 *       case   : 상수만 사용가능 ( 변수 X )
 *                하나의 case가 끝나는 마지막에는 'break'문을 사용해서 종료합니다
 *       default : 매칭되는 case 값이 없을때 실행 할 코드가 있으면 사용합니다( 사용 O, X )
 * 
 */

public class SwitchEx01 {

	public static void main(String[] args) {
		
		int no = 1;
		System.out.println("no : " + no);
		System.out.println();
		
		int n = 1;
		switch(no) {
		case 1:
		//case n: Error
			System.out.println("1 - one");
			break;
		case 2:
			System.out.println("2 - two");
			break;
		case 3:
			System.out.println("3 - three");
			break;
		default:
			System.out.println("??");
		}
		
		
	}
	
}




















