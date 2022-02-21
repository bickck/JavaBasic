package ch06_for;

import java.util.Scanner;

public class QuizFpr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 알파벳 대문자 A ~ Z까지를 출력하는 코드를 작성하세요
		// for 문이 한번 실행 될 때마다 알파벳 하나씩 출력됩니다

		/*
		 * int cnt = sc.nextInt(); for (int i = 0; i < cnt; i++) {
		 * System.out.print("*"); }
		 * 
		 * System.out.println(); int seven = 0; int three = 0; for (int i = 1; i <= 50;
		 * i++) { if (i % 3 == 0 && i % 7 == 0) { seven += i; three+=i; }else if(i%3 ==
		 * 0) { three+=i; }else if(i%7 ==0) { seven += i; } }
		 * System.out.println("3의 배수의 합 : "+ three);
		 * System.out.println("7의 배수의 합 : "+seven);
		 */

		// 알파벳 대문자 A ~ Z까지를 출력하는 코드를 작성하세요
		// for 문이 한번 실행 될 때마다 알파벳 하나씩 출력됩니다

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}

		System.out.println();

		// 첫날에는 통장에 1원을 입금하고, 둘째날부터는 전날 입금액의 2배를 입금합니다
		// 위와 같은 방식으로 30일 동안 입금한 총금액을 구하는 코드를 작성하세요
		long input = 0;
		long balance = 0;
		for (int i = 1; i <= 30; i++) {
			if (i == 1) {
				input = 1;
			} else {
				input *= 2;
			}
			balance += input;
		}
		
		System.out.println(balance);
		// 아래와 같은 출력을 진행하는 코드를 작성하세요
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		
		for(int i = 1;i<=5;i++) {
			for(int j =1;j<=5;j++) {
				System.out.print(i * j);
			}
			System.out.println();
		}
	}
}
