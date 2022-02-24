package ch02_Quiz;

public class Police extends Person {

	private String type;

	public Police(String name, int age, String type) {
		super(name, age);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
