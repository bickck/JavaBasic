package ch02_ifelse;

import java.util.Scanner;

public class QuizNestedIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 보유한 금액에 따라서 구매 가능한 아이템 목록을 보여주는 코드를 작성하세요
		// - 3000 미만
		// : 일반검 - 일반 방패 - 물약
		// 5000 미만
		// : 쇠검 - 방어막 - 에너지 드링크
		// 5000 이상
		// : 아이템 팩키지

		int money = sc.nextInt();

		if (money >= 5000) {
			System.out.println("아이템 팩키지");
		} else if (money >= 3000 && money < 5000) {
			System.out.println("쇠검 - 방어막 - 에너지 드링크");
		} else {
			System.out.println(" 일반검 - 일반 방패 - 물약");
		}

		// 물품의 크기와 무게에 따라서 사용가능한 카트를 알려주는 코드를 작성하세요
		// - 크기 무게 cart
		// small 50kg 미만 cart-A
		// small 50kg 이상 cart-B
		// large 50kg 미만 cart-C
		// large 50kg 이상 cart-D
		System.out.println(" 물품의 크기와 무게 입력 ");
		String size = sc.nextLine();
		int weight = sc.nextInt();

		if (size == "small" && weight < 50) {
			System.out.println("cart-A");
		} else if (size == "small" && weight >= 50) {
			System.out.println("cart-B");
		} else if (size == "large" && weight < 50) {
			System.out.println("cart-C");
		} else {
			System.out.println("cart-D");
		}
	}
}
