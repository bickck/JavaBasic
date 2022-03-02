



package ch03_generic2;

public class Computer {

	private String name;
	
	public Computer(String name) {
		this.name = name;
	}
	
	public String getName() { return name; }
	
	public String toString() {
		return "제품 종류 : " + name;
	}
	
}
