import java.util.Scanner;

/*
 * 메서드 ( method )
 * - class 안에서 하나의 기능을 가진 작은 프로그램 입니다
 * 
 */

public class MethodEx01 {

// 접근제한자 	 지정예약어  반환타입  메서드명     매개변수
	public    static   void   main(String[] args) {
		
		
		// 반환타입 : 메서드의 실행이 종료되면서 호출부로 돌아갈 때 보내지는 값의 자료형
		//         기본자료형, 참조자료형, void( 반환값이 없을 때 )
		// 메서드명 : 메서드 호출(실행)시에 사용하는 이름
		// 매개변수 : 호출부에서 넘어오는 값을 보관하는 변수( 사용 O, X )
		
		
		// 메서드 호출 : 메서드명을 사용해서 실행
		// - 메서드명( 인자값 );
		//   > 메서드 정의부에 매개변수가 있으면 메서드 호출시에 해당 타입에 맞는 값을 보내야 합니다
		hi();

		dataSend(10);
		
		System.out.println("원주율 : " + returnPi());
		double pi = returnPi();
		System.out.println("pi : " + pi);
		
		String end = sendReceive("실행");
		System.out.println(end);
	} // main() end
	
	public static String sendReceive(String stn) {
		System.out.println("받은 문자열 : " + stn);
		String end = "종료";
		return end;
	} // sendReceive() end
	
	public static double returnPi() {
		return 3.141592;
		// 반환값은 하나만 가능합니다
	}
	
	public static void dataSend(int param) {
		System.out.println("받은 데이터 : " + param);
	}
	
	// 메서드 정의 : 메서드 호출시에 실행하는 기능 구현
	public static void hi() {
		System.out.println("안녕하세요 ^^");
	}
	
}



















