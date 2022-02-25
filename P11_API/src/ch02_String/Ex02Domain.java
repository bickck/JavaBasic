package ch02_String;

public class Ex02Domain {

	public static void main(String[] args) {
		String email = "test@abc.com";

		// @ 위치
		int a = email.indexOf("@");

		// 아이디
		String id = email.substring(0, a);

		// 도메인
		String domain = email.substring(a + 1);

		System.out.println("ID" + id);
		System.out.println("domain" + domain);
	}
}
