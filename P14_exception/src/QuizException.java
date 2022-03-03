import java.util.Scanner;

public class QuizException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userId = null;
		while (true) {
			System.out.println("사용자 아이디를 입력하세요.");
			userId = sc.nextLine();
			try {
				if (userId.contains("admin")) {
					throw new Exception("admin은 포함할 수 없습니다.");
				}
				if (userId.length() >= 2 && userId.length() <= 10) {
					throw new Exception("아이디는 2 ~ 10 글자만 가능합니다.");
				}

				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("입력한 아이디는 " + userId + " 입니다.");
	}
}
