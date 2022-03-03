package ch03_mapQuiz;
/*
 * Member class를 정의하세요
 * - 회원이름, 전화번호의 관리가 가능합니다
 */

public class Member {

	private String userName;
	private String phoneNumber;

	public Member(String username, String phoneNumber) {
		this.userName = username;
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
