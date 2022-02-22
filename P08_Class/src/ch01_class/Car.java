package ch01_class;

import java.util.Scanner;

/*
 * Car class 를 정의하고, CarManager class에서 테스트 하세요
 * - 멤버필드 : 제조회사, 모델명, 색상, 가격
 * - 기능 : 필드값 설정, 정보확인이 가능합니다
 * 
 */

public class Car {

	String company;
	String modelName;
	String color;
	int price;

	public void setCar(String company, String modelName, String color, int price) {
		this.company = company;
		this.modelName = modelName;
		this.color = color;
		this.price = price;
	}

	public void inputInfo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("제조사 입력");
		company = sc.nextLine();
		System.out.println("모델 이름 입력");
		modelName = sc.nextLine();
		System.out.println("색상 입력");
		color = sc.nextLine();
		System.out.println("가격 입력");
		price = sc.nextInt();
	}

	public String view() {
		return "Car [company=" + company + ", modelName=" + modelName + ", color=" + color + ", price=" + price + "]";
	}

}
