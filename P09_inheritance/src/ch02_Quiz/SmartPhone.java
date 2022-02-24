package ch02_Quiz;

public class SmartPhone extends Product {

	private String phoneNumber;
	private String agency;

	public SmartPhone() {
		super();
		phoneNumber = "none";
		agency = "none";

	}

	public SmartPhone(String productName, int productPrice) {
		super(productName, productPrice);
		phoneNumber = "none";
		agency = "none";
	}

	public SmartPhone(String phoneNumber, String agency, String productName, int productPrice) {
		super(productName, productPrice);
		this.phoneNumber = phoneNumber;
		this.agency = agency;

	}

	public void showInfo() {
		super.showInfo();
		System.out.println("===== 스마트 폰 정보 =====");
		System.out.println("휴대폰 번호" + phoneNumber);
		System.out.println("통신사 " + agency);

	}

	public void chageAgency(String newAgency) {
		this.agency = newAgency;
	}

	public void chagePhoneNumber(String newPhoneNumber) {
		this.agency = newPhoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}
}
