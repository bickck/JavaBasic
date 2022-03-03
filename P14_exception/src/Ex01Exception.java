



import java.util.Scanner;

/*
 * 예외  ( Exception )
 * - 잘못된 코드 또는 사용자의 잘못된 조작으로 인해 발생하는 프로그램 오류 입니다
 * 
 * 예외 처리
 * - 프로그램에서 오류가 발생했을 때, 문제 내용을 처리하는 것입니다
 *   Ex) try {
 *            문제가 발생할 수 있는 지역 설정
 *       } catch ( 예외 타입 ) {
 *            예외처리 지역
 *            > catch 의 예외 타입으로 기본자료형은 사용할 수 없습니다
 *       } finally {
 *            예외처리 여부와 상관없이 무조건 실행됩니다 ( 사용 O, X )
 *       }
 * 
 */

public class Ex01Exception {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int candy = 0;
		int people = 0;
		
		try {
		
			System.out.print("사탕수 입력 > ");
			candy = scanner.nextInt();
			System.out.print("사람수 입력 > ");
			people = scanner.nextInt();
			
			int div = candy / people;
			int mod = candy % people;
			
			System.out.println("한사람당 사탕 수 : " + div);
			System.out.println("남은 사탕수 : " + mod);
		
		} catch(Exception e) {
			//System.out.println("0으로 나눌수 없어요...");
			//e.printStackTrace();  // 상세한 내용
			//System.out.println(e.toString());  // 조금 덜 상세한 내용
			System.err.println(e.getMessage());  // 간단한 내용
		} finally {
			System.out.println("- end -");
		}
		
		
		
	}
	
}
















