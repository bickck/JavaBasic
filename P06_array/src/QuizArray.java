import java.util.Random;

public class QuizArray {

	public static void main(String[] args) {

		/*
		 * // 위 배열을 1 ~ 30 사이의 값으로 초기화하고, 출력하는 코드를 작성하세요
		 * 
		 * Random rd = new Random(); int[] point = new int[10];
		 * 
		 * int sum = 0; for (int i = 0; i < point.length; i++) { point[i] =
		 * rd.nextInt(30) + 1; sum += point[i]; }
		 * 
		 * // 위 배열의 전체 평균을 구하고, 평균보다 높은 데이터의 갯수를 구하는 코드를 작성하세요 int avg = sum /
		 * point.length; int cnt = 0; for (int i = 0; i < point.length; i++) { if (avg
		 * >= point[i]) { cnt++; } }
		 */

		Random rd = new Random();
		int[] data = new int[10];

		// 위 배열을 1 ~ 10 사이의 랜덤값으로 초기화하는 코드를 작성하세요
		// - 중복값은 들어갈 수 없습니다

		for (int i = 0; i < data.length; i++) {

		}

		for (int i = 0; i < data.length; i++) {
			int rand = rd.nextInt(10) + 1;

			boolean isValid = true;
			boolean isDuple = false;
			while (isValid) {
				for (int j = 0; j < i; j++) {
					if (rand == data[j]) {
						isDuple = true;
						rand = rd.nextInt(10) + 1;
					}
				}
				if (isDuple == false) {
					isValid = false;
				} else {
					break;
				}
			}
			data[i] = rand;
		}

		for (int i = 0; i < data.length; i++) {
			System.out.print(" " + data[i]);
		}

	}
}
