import java.util.Random;

public class QuizRandom {

	public static void main(String[] args) {
		Random ra = new Random();
		/*
		 * // 1 ~ 50 사이의 랜덤값 5개를 출력하는 코드를 작성하세요
		 * 
		 * for (int i = 0; i < 5; i++) { System.out.println(ra.nextInt(50) + 1); } //
		 * 주사위 값을 가지는 변수 2개를 선언하고, 1 ~ 6 사이의 랜덤값으로 각각 초기화 합니다 // 두개의 주사위에 한번에 같은값이 들어갈때
		 * 까지의 시도 횟수를 구하는 코드를 작성하세요
		 * 
		 * int dice1 = 0; int dice2 = 0; int cnt = 0; while (true) { dice1 =
		 * ra.nextInt(6) + 1; dice2 = ra.nextInt(6) + 1; if (dice1 == dice2) { break; }
		 * cnt++; } System.out.println("cnt갯수 : " + cnt);
		 */

		// 사용자 확인값을 생성하는 코드를 작성하세요
		// - 사용자 확인값
		// > 0 ~ 9, A ~ Z의 조합 5개로 이루어져 있습니다.

		String str = "";
		while (str.length() <= 5) {
			int rand = ra.nextInt(50) + 50;
			if (rand >= 48 && rand <= 57 || rand >= 65 && rand <= 90) {
				str += (char) rand;
			}
		}
		System.out.println("사용자 확인값 " + str);

	}
}
