import java.io.IOException;

/*
 * import : 사용하려는  class를 호출합니다
 * > 자동 import : Ctrl + Shift + o
 */

/*
 * System.in.read()
 * - 콘솔창에 키보드로 입력한 값을 1byte 단위로 처리 합니다
 * 
 */

public class Ex01System {
	                                      // 예외전가 : System.in.read() 사용시 필요
	public static void main(String[] args) throws IOException {
		
		System.out.print("키보드로 값을 입력하세요 >> ");
		int iv = System.in.read();
		System.out.println("iv : " + iv);
		char cv = (char)iv;
		System.out.println("cv : " + cv);
		System.out.println();
		
//		System.in.read();
//		System.in.read();		
		System.in.skip(2);
		
		System.out.print("문자 입력 > ");
		char ch = (char)System.in.read();
		System.out.println("ch : " + ch);
		System.out.println("ch : " + (int)ch);
		
		
	}
	
}
















