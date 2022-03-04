
package Quiz;

import java.io.Serializable;

/*
 * Member class를 정의하세요
 * - 회원이름, 전화번호의 관리가 가능합니다
 */

public class Member implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String tel;

	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String toString() {
		return name + " - " + tel;
	}

}
