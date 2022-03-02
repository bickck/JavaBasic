package ch02_Quiz;
/*
 * Product class를 정의하세요
 * - 제품이름, 가격의 관리가 가능합니다
 */

public class Product {

	private String productName;
	private int price;

	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}

	public void setProductName(String name) {
		this.productName = name;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + "]";
	}

}
