package ch01_if;

import java.util.Scanner;

public class QuizIf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * // 세개의 수 중에서 큰수를 찾는 코드를 작성하세요 // - 세개의 수는 모두 1이상이고, 같은 값은 없습니다 int a =
		 * sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt(); int max = -1;
		 * 
		 * if (a > b) { max = a; } if (b > a) { max = b; } if (c > max) { max = c; }
		 * System.out.println("A : " + a + "B" + b + "C" + c + " ," + "MAX : " + max);
		 * // 성별(m, f)을 사용해서 m이면 "남성", f이면 "여성"을 출력하는 코드를 작성하세요
		 * 
		 * char gender = 'm';
		 * 
		 * if (gender == 'm') { System.out.println("남성"); } if (gender == 'f') {
		 * System.out.println("여성"); }
		 */

		// 두수의 합이 2의 배수이면서, 3의 배수도 되는지를 확인하는 코드를 작성하세요
		System.out.println("값 두개 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		
		boolean isValid = false;
		if (sum % 2 == 0 && sum % 3 == 0) {
			isValid = true;
		}

		System.out.println(sum + " 의 값은" + "2의 배수이면서, 3의 배수 유효한가  :" + isValid);

		// 두점 사이의 거리를 구하는 코드를 작성하세요
		// - 거리의 결과는 + 값으로만 나와야 합니다
		// Ex) 첫번째 위치 : 2
		// 두번째 위치 : 9
		// 거리 : 7
		
		System.out.println("두 점 사이의 값을 입력하시오");

		int x = sc.nextInt();
		int y = sc.nextInt();

		int distance = x - y;
		if (distance < 0)
			distance = -distance;

		System.out.println(x + " 와 " + y + " 사이의 거리 : " + distance);

	}

}
