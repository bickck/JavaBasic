package ch02Quiz;

public class Product {

	private String productName;
	private int productPrice;

	public Product() {
		productName = "none";
		productPrice = 0;
	}

	public Product(String productName, int productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public void showInfo() {
		System.out.println("===== 제품 정보 =====");
		System.out.println("제품 이름" + productName);
		System.out.println("제품 가격" + productPrice);
	}

}
