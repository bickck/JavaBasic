



package ch05_switch;

import java.util.Scanner;

public class QuizSwitch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		// 버스 카드 단말기 코드를 작성하세요
//		// - 요금 : 일반(1250), 학생(750)
//		//   버스 카드 잔액, 사용 카드를 설정합니다
//		//   일반, 학생 카드인지를 확인해서 정상이면 차감된 금액을 알려주세요
//		System.out.print("일반 , 학생 > ");
//		String card = scanner.next();
//		System.out.println();
//		
//		int balance = 1000;  // 잔액
//		int general = 1250;  // 일반
//		int student = 750;   // 학생
//		boolean check = true;  // 결제 확인 ( true : 정상, false : 미결제 )
//		
//		switch(card) {
//		case "일반":
//			if(balance >= general) {
//				balance -= general;
//			} else {
//				check = false;
//			}
//			break;
//		case "학생":
//			if(balance >= student) {
//				balance -= student;
//			} else {
//				check = false;
//			}
//			break;
//		}
//		// 결제 확인
//		if(check) {
//			System.out.println("삑! 잔액 : " + balance + "원");
//		} else {
//			System.out.println("잔액이 부족합니다");
//		}
		
		
		
//		// 월을 사용해서 해당 월이 몇일까지 있는지를 알려주는 코드를 작성하세요
//		// - 2월은 "28 or 29일" 로 처리하세요...
//		// - Ex) 월 입력 > 5
//		//       31일
//		System.out.print("월 입력 > ");
//		int month = scanner.nextInt();
//		System.out.println();
//		
//		switch(month) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			System.out.println("31일");
//			break;
//		case 2:
//			System.out.println("28일 or 29일");
//			break;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			System.out.println("30일");
//			break;
//		default:
//			System.out.println("??");
//		}
		
		
		
		// 간단한 사칙연산 계산기 코드를 작성하세요
		// Ex) + , - , * , / 선택 > *
		//     숫자 2개 입력 > 2 7
		//     2 * 7 = 14
		char opt = ' ';      // 연산자
		int dataA, dataB;    // 계산값
		double result = 0;   // 결과
		boolean run = true;  // 실행 확인 ( true : 정상, false : 오류 )
		
		System.out.print("+ , - , * , / 선택 > ");
		opt = scanner.next().charAt(0);
		
		if(opt == '+' || opt == '-' || opt == '*' || opt == '/') {
		
			System.out.print("숫자 2개 입력 > ");
			dataA = scanner.nextInt();
			dataB = scanner.nextInt();
			System.out.println();
			
			switch(opt) {
			case '+':
				result = dataA + dataB;
				break;
			case '-':
				result = dataA - dataB;
				break;
			case '*':
				result = dataA * dataB;
				break;
			case '/':
				if(dataB > 0)
					result = (double)dataA / dataB;
				else
					run = false;
				break;
			}
			// 계산 결과
			if(run)
				System.out.println(dataA + " " + opt + " " + dataB + " = " + result);
			else
				System.out.println("계산 오류~");
		
		} else {
			System.out.println("연산자 오류~");
		}
		
	}
	
}





















