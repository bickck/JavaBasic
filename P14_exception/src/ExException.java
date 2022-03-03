import java.util.Scanner;

/*
 * 예외 (Exception)
 * - 잘못된 코드 또는 사용자의 잘못된 조작으로 인해 발생하는 프로그램 오류 입니다.
 * 
 * 예외 처리
 * - 프로그램에서 오류가 발생했을 때, 문제 내용을 처리하는 것입니다.
 */

public class ExException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int candy = 0;
		int people = 0;

		System.out.println("사탕 수 입력 >");

		candy = sc.nextInt();

		System.out.println("사람 수 입력 >");

		people = sc.nextInt();

		int div = candy / people;
		int mod = candy % people;

		System.out.println("한 사람당 사탕 수" + div);
		System.out.println("남은 사탕 수" + mod);

	}
}
