
package day1;

public class QuizBasic {

	public static void main(String[] args) {

		// 아래의 내용을 변수에 저장해서 출력하는 코드를 작성하세요
		// - String : 이름, 주소
		// int : 생일(년, 월, 일), 나이
		// char : 성별(m, f)
		// double : 키
		// Ex) --- 고 객 정 보 ---
		// 이름 : test
		// 주소 :
		// 생일 : 2022년 2월 16일
		// 나이 : 1 세
		// 성별 : m
		// 키 : 123.4 cm

		String name = "test";
		String addr = "서울시 강남구 오디?";
		int year = 2022;
		int month = 2;
		int day = 16;
		int age = 1;
		char gender = 'm';
		double height = 123.4;

		System.out.println("--- 고 객 정 보 ---");
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + addr);
		System.out.println("생일 : " + year + "년 " + month + "월 " + day + "일");
		System.out.println("나이 : " + age + " 세");
		System.out.println("성별 : " + gender);
		System.out.println("키    : " + height + " cm");

	}

}
