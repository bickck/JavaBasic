



package ch01_Object;

public class Product {
	
	private String serial;  // 제품 고유 번호
	
	public Product(String serial) {
		this.serial = serial;
	}
	
	public int hashCode() {
		return serial.hashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Product) { // 같은 타입인지 확인
			Product tmp = (Product)obj; // 원래 타입으로 변환
			if(this.serial.equals(tmp.serial)) { // 필드값이 같은지 확인
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return "제품번호 : " + serial;
	}
	
	public void info() {
		System.out.println("제품번호 : " + serial);
	}

}















