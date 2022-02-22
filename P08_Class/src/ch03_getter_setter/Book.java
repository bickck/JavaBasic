

package ch03_getter_setter;

import java.util.Scanner;

/*
 * Book class를 정의하고, BookManager class에서 테스트 하세요
 * - 필드 : 책제목, 지은이, 진열위치, 가격의 관리가 가능합니다
 * - 멤버필드 값을 설정, 사용하는 getter/setter 메서드를 정의하세요
 *   > 지은이 : 2 ~ 10글자 가능합니다
 *     진열위치 : A, B, C 만 가능합니다
 *     가격 : +(plus)만 가능합니다
 */

public class Book {

	private String title;
	private String author;
	private char area;
	private int price;
	
	String getTitle() { return title; }
	void setTitle(String _title) {
		title = _title;
	}
	
	String getAuthor() { return author; }
	void setAuthor(String _author) {
		if(_author.length() >= 2 && _author.length() <= 10) {
			author = _author;
		}
	}
	
	char getArea() { return area; }
	void setArea(char _area) {
		if(_area >= 'A' && _area <= 'C') {
			area = _area;
		}
	}
	
	int getPrice() { return price; }
	void setPrice(int _price) {
		if(_price >= 0) {
			price = _price;
		}
	}
	
	void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("책제목 입력 > ");
		title = scanner.next();
		System.out.print("지은이 입력 > ");
		author = scanner.next();
		System.out.print("진열지역 입력 > ");
		area = scanner.next().charAt(0);
		inputPrice(scanner);
	}
	
	void inputPrice(Scanner scanner) {
		while(true) {
			System.out.print("가격 입력 > ");
			price = scanner.nextInt();
			if(price >= 0)
				break;
			else
				System.out.println("0 이상으로 설정하세요~");
		}
	}
	
	void setInfo(String _title, String _author, char _area, int _price) {
		title = _title;
		author = _author;
		area = _area;
		price = _price;
	}
	
	void info() {
		System.out.println("--- 도 서  정 보 ---");
		System.out.println("제목    : " + title);
		System.out.println("지은이 : " + author);
		System.out.println("진열지역 : " + area + " 구역");
		System.out.println("가격    : " + price + " 원");
	}
	
}



















