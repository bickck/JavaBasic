

package ch03_nested_if;

import java.util.Scanner;

public class QuizNestedIf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		// 보유한 금액에 따라서 구매 가능한 아이템 목록을 보여주는 코드를 작성하세요
//		// - 3000 미만
//		//   : 일반검 - 일반 방패 - 물약
//		//   5000 미만
//		//   : 쇠검 - 방어막 - 에너지 드링크
//		//   5000 이상
//		//   : 아이템 팩키지
//		int money = 5000;
//		System.out.println("보유 금액 : " + money + " 원");
//		System.out.println();
//		
//		System.out.println("--- 아이템 목록 ---");
//		if(money > 0) {
//			System.out.println("일반검 - 일반 방패 - 물약");
//			if(money >= 3000) {
//				System.out.println("쇠검 - 방어막 - 에너지 드링크");
//				if(money >= 5000) {
//					System.out.println("아이템 팩키지");
//				}
//			}
//		}
		
		
		
		// 물품의 크기와 무게에 따라서 사용가능한 카트를 알려주는 코드를 작성하세요
		// - 크기           무게              cart
		//   small     50kg 미만    cart-A
		//   small     50kg 이상    cart-B 
		//   large     50kg 미만    cart-C
		//   large     50kg 이상    cart-D 
		String size = "";
		double weight = 0;
		String cart = "";
		
		System.out.print("물품 크기 입력 > ");
		size = scanner.next();
		
		if(size.equals("small") || size.equals("large")) { // 크기 확인
		
			System.out.print("무게 입력 > ");
			weight = scanner.nextDouble();
			
			if(size.equals("small")) {
				if(weight < 50)
					cart = "cart-A";
				else 
					cart = "cart-B";
			} else {
				if(weight < 50)
					cart = "cart-C";
				else 
					cart = "cart-D";
			}
			System.out.println(cart + " 사용하세요");
		
		} else {
			System.out.println("크기 오류~");
		}
		
	}
	
}






















