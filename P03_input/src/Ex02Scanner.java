import java.util.Scanner;

/*
 * Scanner class
 * - 입력받은 데이터를 원하는 자료형으로 선택해서 처리할 수 있습니다
 */

public class Ex02Scanner {

	public static void main(String[] args) {
		
		// Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// 문자열 : next()
		System.out.print("단어 입력 > ");
		String wordA = scanner.next();
		System.out.println("wordA : " + wordA);
		System.out.println();
		
		// 숫자 : nextInt()
		System.out.print("숫자 입력 > ");
		int iv = scanner.nextInt();
		System.out.println("iv : " + iv);
		System.out.println();
		
		// 실수 : nextDouble()
		System.out.print("실수 입력 > ");
		double dv = scanner.nextDouble();
		System.out.println("dv : " + dv);
		System.out.println();
		
		// 문자 : next().charAt(index)
		//      가져온 단어에 'charAt(index)'를 적용해서, index 번째 문자 사용
		//      index는 0부터 시작
		System.out.print("문자 입력 > ");
		char ch = scanner.next().charAt(0);
		System.out.println("ch : " + ch);
		System.out.println();
		
		// 문장 : nextLine()
		System.out.print("문장 입력 > ");
		//scanner.nextLine(); // Enter 처리
		String str = scanner.nextLine();
		System.out.println("str : " + str);
		
		

		
		
		
		
		
	}
	
}






















