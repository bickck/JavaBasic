package ch10_Quiz;

public class Product {

	private static int productCount;
	private String kind;
	private String name;
	private int price;
	private final String number;

	public Product(String kind, String name, int price, String number) {
		productCount += 1;
		this.kind = kind;
		this.name = name;
		this.price = price;
		this.number = number;
		System.out.println("제품 등록");
	}

	public void currentCount() {
		System.out.println("제품 등록 수 : " + productCount);
	}

	public void changePrice(int price) {
		if (price >= 0) {
			this.price = price;
			System.out.println("가격이 변경 되었습니다." + price);
		} else {
			System.out.println("유효하지 않는 가격입니다." + price);
		}
	}

	public void showProduct() {
		System.out.println("======= 제품 정보 ======");
		System.out.println("제품 이롬 :" + name);
		System.out.println("제품 가격 :" + price + "원");
		System.out.println("제품 관리 번호 :" + number);
	}

	public static void remove() {
		--productCount;
		System.out.println("제품 삭제 : " + productCount);
	}

	public static void resetCount() {
		productCount = 0;
	}

	public static int getProductCount() {
		return productCount;
	}

	public static void setProductCount(int productCount) {
		Product.productCount = productCount;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
