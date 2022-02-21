

package ch04_if_elseif;

import java.util.Scanner;

public class QuizIfelseif {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		// 차량 속도를 확인해서 벌점, 벌금을 알려주는 코드를 작성하세요
//		// - 속도(km)       벌점      벌금(만원)
//		//   0     ~ 100    0     0
//		//   100 초과 ~ 120   0     3
//		//   120 초과 ~ 140  15     6
//		//   140 초과 ~ 160  30     9
//		//   160 초과             60    12
//		System.out.print("속도 입력 > ");
//		int speed = scanner.nextInt();
//		System.out.println();
//		
//		int penalty = 0;  // 벌점
//		int fine = 0;     // 벌금
//		if(speed > 160) {
//			penalty = 60;
//			fine = 12;
//		} else if(speed > 140) {
//			penalty = 30;
//			fine = 9;
//		} else if(speed > 120) {
//			penalty = 15;
//			fine = 6;
//		} else if(speed > 100) {
//			penalty = 0;
//			fine = 3;
//		} 
//		
//		System.out.println("속도 : " + speed +  " km");
//		System.out.println("벌점 : " + penalty + " 점");
//		System.out.println("벌금 : " + fine + " 만원");
		
		
		
		// 몸무게(kg), 키(cm)를 사용해서 bmi(체질량지수)구하는 코드를 작성하세요
		//          몸무게(kg)
		// BMI = ---------------
		//        키(m) * 키(m)
		// bmi           몸상태
		//      ~ 18.4     저체중
		// 18.5 ~ 22.9     정상
		// 23.0 ~ 24.9     과체중 
		// 25.0 ~ 29.9     비만
		// 30.0 ~        고도비만
		System.out.print("몸무게 입력 > ");
		double weight = scanner.nextDouble();
		
		System.out.print("키     입력 > ");
		double height = scanner.nextDouble();
		System.out.println();
		
		double mHeight = height / 100;
		double bmi = weight / (mHeight * mHeight);
		
		String body = "고도비만";
		if(bmi < 18.5) body = "저체중";
		else if(bmi < 23.0) body = "정상";
		else if(bmi < 25.0) body = "과체중";
		else if(bmi < 30.0) body = "비만";
		
		System.out.printf("BMI : %.1f\n", bmi);
		System.out.println("몸상태 : " + body);
		
		
		
	}
	
}



















