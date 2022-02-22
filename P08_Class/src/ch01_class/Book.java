package ch01_class;

import java.util.Scanner;

public class Book {
	String title;
	String author;
	String location;
	int price;

	public void inputInfo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("책제목 입력");
		title = sc.nextLine();
		System.out.println("지은이 입력");
		author = sc.nextLine();
		System.out.println("진열위치 입력");
		location = sc.nextLine();
		System.out.println("가격 입력");
		price = sc.nextInt();
	}

	public void setBookManager(String title, String author, String location, int price) {

		this.title = title;
		this.author = author;
		this.location = location;
		this.price = price;
	}

	public String view() {
		return "BookManager [title=" + title + ", author=" + author + ", location=" + location + ", price=" + price
				+ "]";
	}
}
