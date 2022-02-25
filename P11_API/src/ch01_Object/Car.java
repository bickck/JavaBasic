



package ch01_Object;

/*
 * Car class를 정의하고, CarMain class에서 테스트 하세요
 * - 제조회사, 모델명의 관리가 가능합니다
 * - 제조회사, 모델명이 같으면 동일한 객체로 판단해야 합니다
 * - 변수명을 사용해서 차량 정보가 나올수 있어야 합니다
 */

public class Car {
	
	private String company;
	private String model;
	
	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	public int hashCode() {
		return company.hashCode() + model.hashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car tmp = (Car)obj;
			if(!company.equals(tmp.company))
				return false;
			if(!model.equals(tmp.model))
				return false;
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "제조회사 : " + company + " - 모델명 : " + model;
	}

}



















