package ch01_generic;




public class Fruits {

	private String country;  // 생산지
	private int ea;          // 수량
	
	public Fruits(String country, int ea) {
		this.country = country;
		this.ea = ea;
	}
	
	public String toString() {
		return "생산지  : " + country + " - " + ea + "개";
	}
	
}


















