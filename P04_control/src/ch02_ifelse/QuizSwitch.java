package ch02_ifelse;

import java.util.Scanner;

public class QuizSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int balance = sc.nextInt();
		int cost = sc.nextInt();
		String state = sc.nextLine();
		boolean isSuccess = true;

		switch (state) {
		case "학생":
			if (balance >= 750) {
				cost = 750;
			} else {
				isSuccess = false;
			}
			break;

		case "일반":
			if (balance >= 1250) {
				cost = 1250;
			} else {
				isSuccess = false;
			}
			break;
		}

		if (isSuccess) {
			System.out.println(state + " 요금은 " + cost + "원 " + " 남은 금액 :" + (balance - cost));
		} else {
			System.out.println("잔액 부족");
		}

		// - 2월은 "28 or 29일" 로 처리하세요...
		// - Ex) 월 입력 > 5
		// 31일

		int month = sc.nextInt();

		switch (month) {
		case 2:
			System.out.println("28 or 29일");
			break;
		default:
			System.out.println("31일");
			break;
		}

		// 간단한 사칙연산 계산기 코드를 작성하세요
		// Ex) + , - , * , / 선개 > *
		// 숫자 2개 입력 > 2 7
		// 2 * 7 = 14

		System.out.println("연산자 입력 + , - , * , /");
		String s = sc.nextLine();

		System.out.println("숫자 a, b 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		switch (s) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			if (b != 0) {
				result = a / b;
			} else {
				System.out.println("분모가 0임");
			}
			break;
		default:
			break;
		}
		System.out.println("두 수 a" + s + "b의 값은" + result);

	}
}
