package ch02_ifelse;

import java.util.Scanner;

public class QuizIfelse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 세과목의 점수를 확인해서 합격, 불합격을 알려주는 코드를 작성하세요
		// 합격 조건 : 각 과목별 점수가 40 이상이면서, 평균이 60 이상이어야 합니다

		System.out.println("세과목의 점수 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double sum = a + b + c / 3.0;

		if (sum >= 60 && a >= 40 && b >= 40 && c >= 40) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		System.out.println();
		// ATM 코드를 작성하세요
		// - 현재 통장 잔고를 설정합니다
		// 인출하려는 금액을 입력받습니다
		// 인출 금액이 정상이면 출금 후 잔액을 알려줍니다
		// > 인출 조건 : 잔액보다 작거나 같아야 합니다
		// 10000원 단위만 가능합니다( 10001 X, 11000 X )
		// -(minus) 금액은 안됩니다
		int money = 50000;
		System.out.println("인출하려는 금액을 입력");
		int take = sc.nextInt();

		if (money >= take) {
			System.out.println("인출");
			money -= take;
		} else {
			System.out.println("인출 불가능");
		}
		System.out.println("현재 잔고  : " + money);
	}

}
