package ch02_ifelse;

import java.util.Scanner;

public class QuizIfelseif {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 차량 속도를 확인해서 벌점, 벌금을 알려주는 코드를 작성하세요
		// - 속도(km) 벌점 벌금(만원)
		// 0 ~ 100 0 0
		// 100 초과 ~ 120 0 3
		// 120 초과 ~ 140 15 6
		// 140 초과 ~ 160 30 9
		// 160 초과 60 12

		System.out.println("차량 속도 입력");
		int km = sc.nextInt();
		int cost = 0;
		int demerit = 0;
		if (km >= 0 && km <= 100) {
			cost = 0;
			demerit = 0;
		} else if (km > 100 && km <= 120) {
			cost = 3;
			demerit = 0;
		} else if (km > 120 && km <= 140) {
			cost = 6;
			demerit = 15;
		} else if (km > 140 && km < 160) {
			cost = 9;
			demerit = 30;
		} else {
			cost = 12;
			demerit = 60;
		}

		System.out.println(" 차량 속도 : " + km + " 벌점 : " + demerit + " 벌금 : " + cost);

		// 몸무게(kg)
		// BMI = ---------------
		// 키(m) * 키(m)
		// bmi 몸상태
		// ~ 18.4 저체중
		// 18.5 ~ 22.9 정상
		// 23.0 ~ 24.9 과체중
		// 25.0 ~ 29.9 비만
		// 30.0 ~ 고도비만

		double kg = sc.nextDouble();
		double height = sc.nextDouble();
		double bmi = kg / height * height;
		String str = "";
		
		if (bmi > 18.4) {
			str = "저체중";
		} else if (18.5 <= bmi) {
			str = "정상";
		} else if (23.0 <= bmi) {
			str = "과체중";
		} else if (25.0 >= bmi && bmi < 30.0) {
			str = "비만";
		} else {
			str = "고도비만";
		}

		System.out.println("bmi : " + bmi + " 상태 :" + str);
	}

}
