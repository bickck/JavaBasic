package ch02_Quiz;

public class Celebrity extends Person {

	private String agency;

	public Celebrity(String name, int age, String agency) {
		super(name, age);
		this.agency = agency;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

}
