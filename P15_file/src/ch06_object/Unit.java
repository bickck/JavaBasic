package ch06_object;

import java.io.Serializable;

// 직렬화 자격을 획득하기 위해서 java.io.Serializable
public class Unit implements Serializable{

	/**
	 * serialVersionUID
	 * - 같은 class인지 확인하는 식별자
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String lv;

	public Unit(String id, String lv) {
		this.id = id;
		this.lv = lv;
	}

	public String toString() {
		return "ID : " + id + "-LV :" + lv;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLv() {
		return lv;
	}

	public void setLv(String lv) {
		this.lv = lv;
	}

}
