
package ch02_set;

/*
 * Person class를 정의하세요
 * - 이름, 전화번호의 관리가 가능합니다
 */

public class Person {

	private String phoneNumber;
	private String name;
	

	public Person(String phoneNumber, String name) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
