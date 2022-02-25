package ch02_String;

public class Quiz {

	public static void main(String[] args) {
		// 아래의 주민번호를 사용해서 문제를 해결하세요
		// -생년월일을 사용해서 년 월 일을 구하세요.
		// -뒤에 7자리중 첫번째 자리를 사용해서 남성, 여성을 확인하세요.
		// 1 : 1900년대 남자, 2 : 1900년대 여자
		// 3 : 2000년대 남자, 4 : 2000년대 여자

		/*
		 * String passport = "220225-345689";
		 * 
		 * int a = passport.indexOf("-");
		 * 
		 * String birth = passport.substring(0, a); String be = passport.substring(a,
		 * passport.length());
		 * 
		 * String year = birth.substring(0, 2); String month = birth.substring(2, 4);
		 * String day = birth.substring(4, 6);
		 * 
		 * String check = be.substring(0); String gender = ""; if (check.equals("1")) {
		 * System.out.println("생일" + "19" + year + "년" + month + "월 " + day + "일");
		 * System.out.println("성별 : 남자"); gender = "1900년대 남자"; } else if
		 * (check.equals("2")) { System.out.println("생일" + "19" + year + "년" + month +
		 * "월 " + day + "일"); System.out.println("성별 : 여자"); } else if
		 * (check.equals("3")) { System.out.println("생일" + "20" + year + "년" + month +
		 * "월 " + day + "일"); System.out.println("성별 : 남자"); } else {
		 * System.out.println("생일" + "20" + year + "년" + month + "월 " + day + "일");
		 * System.out.println("성별 : 여자"); }
		 */

		// 아래의 파일경로에서 데이터를 추출하세요
		// - 파일이름 : food
		// 확장자 : jpg
		// 폴더이름 : "D:/photo/2022/travel"
		String file = "D:/photo/2022/travel/food.jpg";

		String foldName = file.substring(0, 20);
		String fileName = file.substring(21, 25);
		String extension = file.substring(26, 29);

		System.out.println("폴더 이름 :" + foldName);
		System.out.println("파일이름 이름 :" + fileName);
		System.out.println("폴더 확장자 :" + extension);

	}
}
