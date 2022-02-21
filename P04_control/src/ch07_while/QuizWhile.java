package ch07_while;

import java.util.Scanner;

public class QuizWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * // 나이를 입력받아서 출력하는 코드를 작성하세요 // - 0 ~ 130 사이의 값만 가능합니다.
		 * 
		 * boolean isValidAge = false; while (isValidAge == true) {
		 * System.out.println("나이를 입력하세요(0 ~ 130 사이의 값만 가능합니다.)"); int age =
		 * sc.nextInt();
		 * 
		 * if (age >= 0 && age <= 130) { isValidAge = true; } else {
		 * System.out.println(age + "은 잘못된 입력입니다. 0 ~ 130 값만 입력하세요."); } }
		 * 
		 * // 성별을 입력받아서 출력하는 코드를 작성하세요 // - 성별 : 남성, 여성만 가능합니다.
		 * 
		 * boolean isValidGender = false; while (isValidGender == true) {
		 * System.out.println("성별을 입력하세요(성별 : 남성, 여성만 가능합니다)"); String gender =
		 * sc.nextLine();
		 * 
		 * if (gender.equals("남성") || gender.equals("여성")) { isValidAge = true; } else {
		 * System.out.println(gender + "은 잘못된 입력입니다. 남성, 여성만 입력하세요."); } }
		 */

		// 치즈 10Box가 저장되어 있는 창고에 1쌍의 쥐가 살고 있습니다..
		// 쥐 한마리가 하루에 먹을 수 있는 치즈의 양은 20g이고,
		// 치즈를 먹은 10일째 되는 날마다 쥐의 객체수가 2배씩 증가합니다
		// 몇일만에 창고에 있는 치즈를 모두 먹게 되고, 이때까지의 쥐의 객체수를 구하는 코드를 작성하세요
		// - 1box = 1kg

		/*
		 * double cheese_Box = 10; int mouse = 2; double eatAvailable = mouse * 0.02;
		 * int day = 1;
		 * 
		 * while (cheese_Box > 0) { if (day % 10 == 0) { mouse *= 2; eatAvailable =
		 * mouse * 0.02; } cheese_Box -= eatAvailable; day++; }
		 * 
		 * System.out.println("쥐가 다 먹은 날 : " + day + "일");
		 */

		// 집주소, 자주가는 장소 한군데씩을 저장하고, 확인할 수 있는 코드를 작성하세요.
		// - 1.집주소 등록, 2. 장소등록 3. 확인
		// - 0 이 입력되면 종료됩니다.
		String home = null;
		String place = null;

		System.out.println("집주소, 자주가는 장소 한군데씩을 저장");
		while (true) {
			System.out.println("1.집주소 등록, 2. 장소등록 3. 확인");
			int num = sc.nextInt();

			if (num == 1) {
				home = sc.nextLine();
			} else if (num == 2) {
				place = sc.nextLine();
			} else if (num == 3) {
				System.out.println("집 주소 :" + home + "자주 가는 곳: " + place);
			} else if (num == 0) {
				System.out.println("종료되었습니다.");
				break;
			}

		}

	}
}
