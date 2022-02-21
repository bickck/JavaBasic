import java.util.Scanner;

public class QuizInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		// 이름, 주소, 나이, 성별(m, f), 키를 입력받아서 출력하는 코드를 작성하세요
//		// - 주소는 띄어쓰기 처리가 가능합니다
//		System.out.print("이름 입력 > ");
//		String name = scanner.next();
//		
//		System.out.print("주소 입력 > ");
//		scanner.nextLine();
//		String addr = scanner.nextLine();
//		
//		System.out.print("나이 입력 > ");
//		int age = scanner.nextInt();
//		
//		System.out.print("성별 입력 > ");
//		char gender = scanner.next().charAt(0);
//		
//		System.out.print("키   입력 > ");
//		double height = scanner.nextDouble();
//		System.out.println();
//		
//		System.out.println("--- 입 력 정 보 ---");
//		System.out.println("이름 : " + name);
//		System.out.println("주소 : " + addr);
//		System.out.println("나이 : " + age + " 세");
//		System.out.println("성별 : " + gender);
//		System.out.println("키   : " + height + " cm");
				
		
		
//		// ID 를 입력받고, 입력받은 ID 를  사용해서 E-mail을 생성하는 코드를 작성하세요
//		// Ex) ID 입력 > test
//		//     E-mail : test@abc.com
//		System.out.print("ID 입력 > ");
//		String id = scanner.next();
//		System.out.println();
//		
//		String domain = "@abc.com";
//		String email = id + domain;
//		System.out.println("E-mail : " + email);
		
		
		
		// 세과목의 점수를 입력받아서 총점, 평균을 구하는 코드를 작성하세요
		// - int     : 점수, 총점
		//   double  : 평균
		// - 평균은 소수점 둘째자리 까지만 나오게 하세요
		System.out.print("세과목 점수 입력\n>> ");
		int s1 = scanner.nextInt();
		int s2 = scanner.nextInt();
		int s3 = scanner.nextInt();
		System.out.println();
		
		int tot = s1 + s2 + s3;
		double avg = (double)tot / 3; //tot / 3.0;
		System.out.println("총점 : " + tot);
		System.out.printf("평균 : %.2f\n", avg);
		
		

		
		
	}
	
}





















