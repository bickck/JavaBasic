package ch05_Quiz;

public class Shoes {

	private String company;
	private String modelName;
	private int size;
	private int price;

	public Shoes() {
		// TODO Auto-generated constructor stub
	}

	public Shoes(String company, String modelName, int size, int price) {
		super();
		this.company = company;
		this.modelName = modelName;
		this.size = size;
		this.price = price;
	}
	
	public void show() {
		System.out.println("---정 보 ---");
		System.out.println("company  : " + company);
		System.out.println("modelName : " + modelName);
		System.out.println("size : " + size);
		System.out.println("price : " + price);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size >= 200 && size <= 300) {
			this.size = size;
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 0) {
			this.price = price;
		}
	}

}
